package com.example.gym

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val nameText = intent.getStringExtra("name")
        val welcomeTextView: TextView = findViewById(R.id.textView3)


        welcomeTextView.text = "Welcome, $nameText!"
    }
}
