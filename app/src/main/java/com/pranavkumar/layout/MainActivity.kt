 package com.pranavkumar.layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pranavkumar.layout.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRelative.setOnClickListener{
            var intent = Intent(this,ImplicitActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.btnConstraint.setOnClickListener{
            var intent = Intent(this,ConstraintActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}