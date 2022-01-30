package com.namdroid.retrofit_sample.retrofit

import android.icu.util.UniversalTimeScale
import android.util.Log
import com.google.gson.JsonElement
import com.namdroid.retrofit_sample.utils.API
import com.namdroid.retrofit_sample.utils.Constants.TAG
import retrofit2.Call
import retrofit2.Response

class RetrofitManager {
    /*
    Retrofit 클라이언트를 가져옴
    클라이언트는 정의한 레트로핏 인터페이스를 달고 가져오도록 함
    항상 같은 클라이언트 객체를 가져오도록 클라이언트쪽에서는 싱글턴으로 구현됨
     */
    companion object{
        val instance = RetrofitManager()
    }
    // Retrofit 인터페이스 가져오기
    private val iRetrofitApi:IRetrofitApi? =RetrofitClient.getClient(API.BASE_URL)?.create(IRetrofitApi::class.java)

    fun getLotteryResult(drwNum:Int, method: String, completion:(String) -> Unit){

        val response = iRetrofitApi?.getLotteryResult(drwNum, method).let {
            it
        }?:return //비어있다면 return

        response.enqueue(object:retrofit2.Callback<JsonElement>{
            // 응답 성공시
            override fun onResponse(call: Call<JsonElement>, response: Response<JsonElement>) {
                Log.d(TAG, "onResponse: ")
                //응답 성공했을 때 처리할 함수. 여기서 넘겨줄 값을 파라미터로 설쟁하줌
                completion(response.raw().toString())

            }

            // 응답 실패시
            override fun onFailure(call: Call<JsonElement>, t: Throwable) {
                Log.d(TAG, "onFailure: ")
            }

        })

    }


}