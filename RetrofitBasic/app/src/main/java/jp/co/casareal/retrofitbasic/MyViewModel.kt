package jp.co.casareal.retrofitbasic

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel(
    var id:MutableLiveData<String> = MutableLiveData<String>(""),
    var title:MutableLiveData<String> = MutableLiveData<String>(""),
    var author:MutableLiveData<String> = MutableLiveData<String>(""),
    var result:MutableLiveData<String> = MutableLiveData<String>("")
) : ViewModel()