package com.fox.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fox.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.act1ButtonSend.setOnClickListener {
            var fragment1 : Fragment1 = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as Fragment1
            var fragment2 : Fragment2 = supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) as Fragment2

            fragment2.onGetData(fragment1.onSendDataFragment())

        }
    }
//
//    override fun onSendData(data: String) {
//      var fragment1 : Fragment1 = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as Fragment1
//
//
//    }


}