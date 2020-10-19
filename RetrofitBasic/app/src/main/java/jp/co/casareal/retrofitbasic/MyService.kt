package jp.co.casareal.retrofitbasic

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface MyService{

    @GET("posts")
    fun getRawResponseForPosts(): Call<ResponseBody>
}