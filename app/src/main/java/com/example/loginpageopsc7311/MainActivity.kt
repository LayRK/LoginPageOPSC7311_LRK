package com.example.loginpageopsc7311

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var UserName = findViewById(R.id.user_name) as EditText
        var UserPassword = findViewById(R.id.user_password) as EditText
        var btnLogin = findViewById(R.id.loginbtn) as Button
        var btnReset = findViewById(R.id.resetbtn) as Button

        btnReset.setOnClickListener {
            // clearing user_name and password edit text views on reset button click
            UserName.setText("")
            UserPassword.setText("")
        }

        btnLogin.setOnClickListener {
            val user_name = UserName.text;
            val password = UserPassword.text;
            Toast.makeText(this@MainActivity, user_name, Toast.LENGTH_LONG).show()

            // your code to validate the user_name and password combination
            // and verify the same

        }


    }
}