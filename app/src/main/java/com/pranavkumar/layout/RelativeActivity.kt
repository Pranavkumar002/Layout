package com.pranavkumar.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.pranavkumar.layout.databinding.RelativeMainBinding

class RelativeActivity : AppCompatActivity() {
    lateinit var binding : RelativeMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = RelativeMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}