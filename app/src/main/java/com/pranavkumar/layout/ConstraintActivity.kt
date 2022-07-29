package com.pranavkumar.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pranavkumar.layout.databinding.ConstraintMainBinding

class ConstraintActivity : AppCompatActivity() {
    lateinit var binding: ConstraintMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ConstraintMainBinding.inflate(layoutInflater)
        setContentView(R.layout.constraint_main)
    }
}