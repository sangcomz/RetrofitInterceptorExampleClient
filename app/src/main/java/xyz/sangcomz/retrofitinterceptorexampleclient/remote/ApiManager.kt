package xyz.sangcomz.retrofitinterceptorexampleclient.remote

import okhttp3.OkHttpClient
import retrofit2.Retrofit

class ApiManager {


    fun makeRetrofit() {

    }

    fun getRetrofit() {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://0.0.0.0")

    }

    fun getOkhttpClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()
        return builder.build()
    }

}