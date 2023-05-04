package com.example.eitaabot.network
import com.example.eitaabot.dto.getme.GetMe
import retrofit2.Response
import retrofit2.http.GET
interface EitaaApi {

    @GET("getMe")
    suspend fun g etInfo() : Response<GetMe>




}