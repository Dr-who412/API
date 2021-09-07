package com.example.churshill

import retrofit2.Call
import retrofit2.http.GET

interface API {
    @GET("products")
    fun getData():Call<data>

}