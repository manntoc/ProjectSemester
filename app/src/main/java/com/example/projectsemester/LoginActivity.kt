package com.example.projectsemester

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        btnHomePageListener()
        txtRegisterListener()
        icBackMainActivityListener()
    }
    private fun btnHomePageListener() {
        btnlogin.setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
        }
    }

    private fun txtRegisterListener() {
        txt_register.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }

    private fun icBackMainActivityListener() {
        back.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}