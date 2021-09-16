package com.example.beginningproject

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    // Menampilkan menu DROPDOWN dari menu_home (EVENT HANDLER)
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_home , menu)
        return true
    }

    // IF DROPDOWN WAS CLICK
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId)  {
            R.id.bahasa -> {
                Toast.makeText(this , "Pengaturan Bahasa" , Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.logout -> {
                startActivity(Intent(this , MainActivity /* Nama Class */::class.java)) // Berpindah Page View
                return true
            }

           else -> super.onOptionsItemSelected(item)
        }
//
    }
}