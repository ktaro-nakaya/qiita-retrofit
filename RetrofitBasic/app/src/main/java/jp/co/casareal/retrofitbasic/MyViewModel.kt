package jp.co.casareal.retrofitbasic

import androidx.lifecycle.ViewModel

class MyViewModel(
    var id:String = "",
    var title:String = "",
    var author:String = ""
) : ViewModel()