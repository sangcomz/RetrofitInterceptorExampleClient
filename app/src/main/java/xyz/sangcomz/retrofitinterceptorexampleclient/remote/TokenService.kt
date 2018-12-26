package xyz.sangcomz.retrofitinterceptorexampleclient.remote

import okhttp3.ResponseBody
import retrofit2.http.GET

interface TokenService {

    @GET("/")
    fun checkToken(): ResponseBody

    @GET("/refresh")
    fun refreshToken(): ResponseBody
}