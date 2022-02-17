package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
          val binding:ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

           /* binding.name = "Your name"
            binding.lastName = "Last Name"*/

       val quoteObj = Quote("Parth","Shah")
        binding.quote=quoteObj

    }
}