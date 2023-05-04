package com.example.eitaabot.network

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitObject {

    val eitaaApiObject : EitaaApi by lazy {
        Retrofit
            .Builder()
            .baseUrl("https://eitaayar.ir/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(EitaaApi::class.java)
    }
}