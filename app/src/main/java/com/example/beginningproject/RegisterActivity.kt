package com.example.beginningproject

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val actionBar = supportActionBar

        actionBar?.setDisplayHomeAsUpEnabled((true))
        actionBar?.setDisplayHomeAsUpEnabled((true))

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}