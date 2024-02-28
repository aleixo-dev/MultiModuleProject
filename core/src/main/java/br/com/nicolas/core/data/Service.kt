package br.com.nicolas.core.data

import retrofit2.http.GET

interface Service {

    @GET("something")
    suspend fun fetchData() : Unit

}