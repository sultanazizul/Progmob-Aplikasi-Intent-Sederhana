package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val linkButton1: Button = findViewById(R.id.linkButton1)
        val linkButton2: Button = findViewById(R.id.linkButton2)
        val linkButton3: Button = findViewById(R.id.linkButton3)


        // Set onClickListener untuk button
        linkButton1.setOnClickListener {
            val url = "https://www.youtube.com/playlist?list=PLdeKwQ1BTfKm1ROWXfSHfkNLANTOa5t6k" // Ganti dengan link yang sesuai
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)

        }
        linkButton2.setOnClickListener {
            val url = "https://www.youtube.com/playlist?list=PLF1krL_nkpHgKMJnaQwyRnU4KtNiRfsuv" // Ganti dengan link yang sesuai
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)}

        linkButton3.setOnClickListener {
            val url = "https://www.dicoding.com/blog/cara-install-android-studio-dalam-15-menit/" // Ganti dengan link yang sesuai
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)}


    }
}
