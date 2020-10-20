package jp.co.casareal.retrofitbasic

import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface MyService{

    @GET("posts")
    fun getRawResponseForPosts(): Call<ResponseBody>

    @POST("posts")
    fun postRawRequestForPosts(@Body body:RequestBody):Call<ResponseBody>

    @PUT("posts/{id}")
    fun putRawRequestForPosts(@Path("id") id:String, @Body body:RequestBody):Call<ResponseBody>

    @DELETE("posts/{id}")
    fun deletePathParam(@Path("id") id:String ):Call<ResponseBody>
}