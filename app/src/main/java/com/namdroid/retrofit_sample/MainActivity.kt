package com.namdroid.retrofit_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.namdroid.retrofit_sample.retrofit.RetrofitManager
import com.namdroid.retrofit_sample.utils.Constants.TAG

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_callapi = findViewById<Button>(R.id.btn_callAPI)

        btn_callapi.setOnClickListener {
            RetrofitManager.instance.getLotteryResult(drwNum = 1, method = "getLottoNumber", completion = {
                Log.d(TAG, "onCreate: $it")
            })
        }
    }
}