package kz.qarapaiymstudios.testapi.data.retrofit

import kz.qarapaiymstudios.testapi.data.repository.ApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    private var retrofit: Retrofit? = null
    private val BASE_URL = "https://api.nobelprize.org/2.1/"

    val retrofitCall = getClient().create(ApiService::class.java)

    fun getClient(): Retrofit {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!
    }
}