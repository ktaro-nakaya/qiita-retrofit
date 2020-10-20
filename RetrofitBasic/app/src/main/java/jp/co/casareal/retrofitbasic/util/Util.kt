package jp.co.casareal.retrofitbasic.util

object Util {

    fun createJson(id:String = "",title:String, author:String):String
            ="{" +
            "  \"id\": \"${id}\"," +
            "  \"title\": \"${title}\"," +
            "  \"author\": \"${author}\"" +
            "}"
}