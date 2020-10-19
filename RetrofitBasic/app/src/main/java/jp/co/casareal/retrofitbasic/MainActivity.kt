package jp.co.casareal.retrofitbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelLazy
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import jp.co.casareal.retrofitbasic.databinding.ActivityMainBinding
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)


        val myViewModel: MyViewModel by viewModels()

        binding.model = myViewModel
        binding.lifecycleOwner = this
    }

    /**
     * POSTボタンが押された時の処理
     *
     * @param view
     */
    fun onPostButtonClick(view: View) {

    }

    /**
     * PUTボタンが押された時の処理
     *
     * @param view
     */
    fun onPutButtonClick(view: View) {


    }

    /**
     * DELETEボタンが押された時の処理
     *
     * @param view
     */
    fun onDeleteButtonClick(view: View) {


    }

    /**
     * GETボタンが押された時の処理
     *
     * @param view
     */
    fun onGetButtonClick(view: View) {

        val retrofit = Retrofit.Builder().apply {
            baseUrl("http://10.0.2.2:3000/")
        }.build()


        val service = retrofit.create(MyService::class.java)

        service.listPosts()
    }


}