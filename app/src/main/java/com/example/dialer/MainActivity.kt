package com.example.dialer

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
   internal var number:String?=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dialBtn.setOnClickListener {
            number=numberEt.text.toString().trim()
            val intent=Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+Uri.encode(number)))
            startActivity(intent)

        }

    }
}