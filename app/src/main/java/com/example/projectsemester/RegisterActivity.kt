package com.example.projectsemester

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.hiasan
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        btnHomePageListener()
        txtLoginListener()
        icBackMainActivityListener()
    }
    private fun btnHomePageListener() {
        btnregister.setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
        }
    }

    private fun txtLoginListener() {
        txt_login.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    private fun icBackMainActivityListener() {
        kembali.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}