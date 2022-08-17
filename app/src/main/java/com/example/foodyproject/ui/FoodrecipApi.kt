package com.example.foodyproject.ui
import com.example.foodyproject.ui.model.RecipResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface FoodrecipApi {

    @GET(value = "/recipe/random")
    fun getRecip(@QueryMap queries: Map<String, String>): Response<RecipResponse>
}