package com.everis.becakotlinmvvm.api

import com.everis.becakotlinmvvm.model.HolidayModel
import retrofit2.Call
import retrofit2.http.GET
//ApiHolidayInterface
interface HolidayInterface {

    @GET("PublicHolidays/2021/br")
    fun getHolidays(): Call<List<HolidayModel>>

}