package com.pranavkumar.layout

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pranavkumar.layout.databinding.ActivityImplicitBinding

class ImplicitActivity : AppCompatActivity() {
    lateinit var binding : ActivityImplicitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityImplicitBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnurl.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.opera.com"))
            startActivity(intent)
        }




        binding.btndial.setOnClickListener {
            val phone = "+9417846155"
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))
            startActivity(intent)

        }

        binding.btnemail.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            emailIntent.type = "vnd.android.cursor.item/email"
            emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("abc@xyz.com"))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "My Email Subject")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "My email content")
            startActivity(Intent.createChooser(emailIntent, "Send mail using..."))
       }
        binding.btnmessages.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("sms:9417846155")
            startActivity(intent)
        }
    }
}