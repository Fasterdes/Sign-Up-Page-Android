package com.example.beginningproject

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var dataEmail  : Array<String>
    private lateinit var dataPassword  : Array<String>
    private  var progressBar : ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtEmail : EditText = findViewById(R.id.edit_email)
        val edtPassword : EditText = findViewById(R.id.edit_password)
        val btnLogin : Button = findViewById(R.id.btn_login)
        val btnRegister : Button = findViewById(R.id.btn_register)
        progressBar  = findViewById(R.id.progress_bar) // Type Casting


//            val builder = AlertDialog.Builder(this , R.style.AlertDialog_AppCompat).create()
//            builder.setTitle("Harap Diisi")
//            builder.setMessage("Tentukan Pilihan Anda")
//            builder.setIcon((R.drawable.person))
//            builder.setPositiveButton("Ok" ,
//                DialogInterface.OnClickListener( {})
//                )


         dataEmail = arrayOf("Faainama" , "Caldera" , "Sudibyo")
         dataPassword = arrayOf("12345" , "4231" , "0495")

        btnLogin.setOnClickListener {
            progressBar?.visibility = View.VISIBLE // Null safety
            signIn(edtEmail.text.toString() , edtPassword.text.toString())
        }

        btnRegister.setOnClickListener {
            startActivity(Intent(this , RegisterActivity::class.java)) // cara berpindah view pada Android
        }
    }

    fun signIn (email : String , password : String) {
        for (i in dataEmail.indices) {
            val takeDataEmail = dataEmail.get(i)
            val takeDataPass = dataPassword.get(i)

            if (takeDataEmail == email || takeDataPass == password) {
                Toast.makeText(this , "Logged In" , Toast.LENGTH_SHORT).show()
                progressBar?.visibility = View.VISIBLE
                startActivity(Intent(this , HomeActivity::class.java))
                break
            }else {
                Toast.makeText(this , "Akun Salah" , Toast.LENGTH_SHORT).show()
                // Toast buat alert notification
            }
        }
    }
}