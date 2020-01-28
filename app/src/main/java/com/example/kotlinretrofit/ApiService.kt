package com.example.kotlinretrofit

import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST("authorize/login")
    fun registrationPost(@Body login: Login) : Observable<TokenApi>


    object ApiUtils {
        val BASE_URL = "https://fluxjwt.herokuapp.com"

        val apiService: ApiService
            get() = RetrofitClient.getClient(BASE_URL)!!.create(ApiService::class.java)

    }
}