package com.namdroid.retrofit_sample.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    // 싱글턴: retrofitClient가 null 이면 새로 build해서 리턴, 그렇지않으면 썻던애를 계속 리턴함
    private lateinit var retrofitClient: Retrofit

    fun getClient(baseUrl:String):Retrofit?{
        if(retrofitClient==null){
            // Retrofit 빌드 : 빌더패턴
            retrofitClient = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofitClient
    }

}