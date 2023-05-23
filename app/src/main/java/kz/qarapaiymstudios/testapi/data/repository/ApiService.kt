package kz.qarapaiymstudios.testapi.data.repository

import kz.qarapaiymstudios.testapi.data.model.Laureats
import retrofit2.http.GET

interface ApiService {
    @GET("laureates")
    suspend fun getLaureats():Laureats
}