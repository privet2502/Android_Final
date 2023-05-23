package kz.qarapaiymstudios.testapi

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kz.qarapaiymstudios.testapi.data.retrofit.RetrofitBuilder
import kz.qarapaiymstudios.testapi.databinding.ActivityMainBinding
import okhttp3.Dispatcher


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        CoroutineScope(Dispatchers.Main).launch{

            kotlin.runCatching {
                RetrofitBuilder.retrofitCall.getLaureats()
            }.onSuccess {
                val adapter = MainActivityAdapter()
                adapter.submitList(it.laureates)
                binding.rcViewAdapter.adapter = adapter
            }.onFailure {
                Toast.makeText(applicationContext,"$it", Toast.LENGTH_LONG).show()
            }


        }

    }
}