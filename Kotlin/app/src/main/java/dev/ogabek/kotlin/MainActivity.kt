package dev.ogabek.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var signUpBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        signUpBtn = findViewById(R.id.btn_sign_up)
        signUpBtn.setOnClickListener {
            Toast.makeText(applicationContext, "You pressed Sign Up Button", Toast.LENGTH_SHORT).show()
        }
    }
}