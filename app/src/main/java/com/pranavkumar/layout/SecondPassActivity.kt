package com.pranavkumar.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pranavkumar.layout.databinding.ActivitySecondPassBinding

class SecondPassActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondPassBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondPassBinding.inflate(layoutInflater)
        setContentView(binding.root)
        intent?.let {
           val firstName = intent.getStringExtra("firstname")
            val lastName = intent.getStringExtra("lastname")
            val email = intent.getStringExtra("email")
            val setPassword = intent.getStringExtra("setpassword")


            binding.tvFirst.text = "" +firstName
            binding.tvLast.text = "" +lastName
            binding.tvEmailAddress.text = "" +email
            binding.tvPassword.text = "" +setPassword


        }
    }
}