package com.namdroid.retrofit_sample.retrofit

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface IRetrofitApi {
    // Retrofit 어노테이션
    // www.baseURL/common.do/?drwNo="$drwNum"&method="$method"
    @GET("/common.do")
    fun getAllLottery(
        @Query("drwNo") drwNum: Int,
        @Query("method") method: String = "getLottoNumber"
    ): Response<RetrofitApiModel> // 반환하는 값

}