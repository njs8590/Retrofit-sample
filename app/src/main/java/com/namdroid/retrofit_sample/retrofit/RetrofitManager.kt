package com.namdroid.retrofit_sample.retrofit

import com.namdroid.retrofit_sample.utils.API

class RetrofitManager {
    companion object{
        val instance = RetrofitManager()
    }

    // Retrofit 인터페이스 가져오기
    private val iRetrofitApi:IRetrofitApi? =RetrofitClient.getClient(API.BASE_URL)?.create(IRetrofitApi::class.java)

    fun getAllLottery(drwNum:Int, method: String){
        val response = iRetrofitApi?.getAllLottery(drwNum, method)
    }


}