package com.example.gym

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText

class LoginActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val nameEditTextView: EditText = findViewById(R.id.editTextText)
        val emailEditTextView: EditText = findViewById(R.id.editTextTextEmailAddress2)
        val passwordEditTextView: EditText = findViewById(R.id.editTextTextPassword4)
        val phoneNumberEditTextView: EditText = findViewById(R.id.editTextPhone)
        val buttonView: Button = findViewById(R.id.button2)

        buttonView.setOnClickListener {
            val nameText = nameEditTextView.text.toString().trim()
            val emailText = emailEditTextView.text.toString().trim()
            val passwordText = passwordEditTextView.text.toString().trim()
            val phoneText = phoneNumberEditTextView.text.toString().trim()
            if (nameText.isBlank()) {
                nameEditTextView.error = "Name is required"
            } else if (!Patterns.EMAIL_ADDRESS.matcher(emailText).matches()) {
                emailEditTextView.error = "Invalid email address"
            } else if (passwordText.isBlank()) {
                passwordEditTextView.error = "Password is required"
            }else if (phoneText.isBlank()){
                phoneNumberEditTextView.error = "Phone Number is required"
       }
    }
}}
