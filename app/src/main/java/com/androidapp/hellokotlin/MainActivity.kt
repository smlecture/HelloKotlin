package com.androidapp.hellokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnJava = findViewById<Button>(R.id.btnJava)
        btnJava.setOnClickListener {
            Toast.makeText(this@MainActivity, "Hello Kotlin", Toast.LENGTH_LONG).show()
            startActivity(Intent(this@MainActivity, BmiJavaActivity::class.java))
        }
        val btnKotlin = findViewById<Button>(R.id.btnKotlin)
        btnKotlin.setOnClickListener {
            Toast.makeText(this@MainActivity, "Hello Kotlin", Toast.LENGTH_LONG).show()
            startActivity(Intent(this@MainActivity, BmiKotlinActivity::class.java))
        }
    }
}