package jp.co.casareal.retrofitbasic

import jp.co.casareal.retrofitbasic.model.Post
import retrofit2.Call
import retrofit2.http.GET

interface MyService{

    @GET("posts")
    fun listPosts(): Call<String>
}