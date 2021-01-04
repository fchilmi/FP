package com.example.fp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.sign_up.*
import kotlinx.android.synthetic.main.user_container.*

class login : AppCompatActivity() {
    lateinit var handler: databaseHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_container)
        handler = databaseHelper(this)
        showHome()
        //daftar
        btnDaftar.setOnClickListener {
            if (inputUserDaftar.text.toString() == "" || inputPasswordDaftar.text.toString() == "") {
                Toast.makeText(this, "Harap Mengisi Username dan Password!", Toast.LENGTH_SHORT).show()
            } else {
                if (handler.insertUserData(
                        inputUserDaftar.text.toString(),
                        inputPasswordDaftar.text.toString()
                    )) {
                    Toast.makeText(this, "Pendaftaran Anda Telah Sukses!", Toast.LENGTH_SHORT).show()
                    inputUserDaftar.text.clear()
                    inputPasswordDaftar.text.clear()
                } else {
                    Toast.makeText(this, "Username yang Anda Masukkan Tidak Tersedia!", Toast.LENGTH_SHORT)
                        .show()
                    inputPasswordDaftar.text.clear()
                } } }
        //LOGIN
        btnLogin.setOnClickListener {
            if (inputUser.text.toString() == "" || inputPassword.text.toString() == "") {
                Toast.makeText(this, "Harap Mengisi Username dan Password Anda", Toast.LENGTH_SHORT).show()
            } else {
                if (handler.userPresent(
                        inputUser.text.toString(),
                        inputPassword.text.toString())) {
                    Toast.makeText(this, "Berhasil!", Toast.LENGTH_SHORT).show()
                    inputUser.text.clear()
                    inputPassword.text.clear()
                    val intentMain = Intent(this, MainActivity::class.java)
                    startActivity(intentMain)
                } else {
                    Toast.makeText(this, "Username atau Password yang Anda Masukkan Salah!", Toast.LENGTH_SHORT)
                        .show()
                    inputPassword.text.clear()
                } } }

        btnSignUp.setOnClickListener {
            inputUser.text.clear()
            inputPassword.text.clear()
            showRegistration()
        }

        btnMasuk.setOnClickListener {
            inputUserDaftar.text.clear()
            inputPasswordDaftar.text.clear()
            showLogin()
        }
    }

    private fun showRegistration() {
        registration_layout.visibility = View.VISIBLE
        login_layout.visibility = View.GONE
    }

    private fun showLogin() {
        registration_layout.visibility = View.GONE
        login_layout.visibility = View.VISIBLE
    }

    private fun showHome() {
        registration_layout.visibility = View.GONE
        login_layout.visibility = View.VISIBLE
    }
}