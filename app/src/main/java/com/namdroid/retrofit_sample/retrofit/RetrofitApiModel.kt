package com.namdroid.retrofit_sample.retrofit

// api reply
// https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=999
/*
{
    "totSellamnt":102581351000,
    "returnValue":"success",
    "drwNoDate":"2022-01-22",
    "firstWinamnt":1513274790,
    "drwtNo6":28,
    "drwtNo4":14,
    "firstPrzwnerCo":16,
    "drwtNo5":18,
    "bnusNo":34,
    "firstAccumamnt":24212396640,
    "drwNo":999,
    "drwtNo2":3,
    "drwtNo3":9,
    "drwtNo1":1
}
*/

data class RetrofitApiModel(
    var drwNo: Int,
    var drwNoDate: String,
    var totSellamnt: Long,
    var returnValue: String,
    var firstWinamnt: Long,
    var firstPrzwnerCo: Int,
    var firstAccumamnt: Long,
    var drwtNo1: Int,
    var drwtNo2: Int,
    var drwtNo3: Int,
    var drwtNo4: Int,
    var drwtNo5: Int,
    var drwtNo6: Int,
    var bnusNo: Int
)