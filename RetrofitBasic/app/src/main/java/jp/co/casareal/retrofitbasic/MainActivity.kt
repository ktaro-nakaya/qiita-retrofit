package jp.co.casareal.retrofitbasic

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import jp.co.casareal.retrofitbasic.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    val scope = CoroutineScope(Dispatchers.IO)

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

        val listPosts = service.getRawResponseForPosts()

        scope.launch {

            val responseBody = listPosts.execute()
            responseBody.body()?.let {
                withContext(Dispatchers.Main) {
                    textResult.text = it.string()
                }
            }
        }
    }


}