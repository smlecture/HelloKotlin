package com.androidapp.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BmiKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_view_binding)

        val btnBmi = findViewById<Button>(R.id.btnBmi)
        val heightField = findViewById<EditText>(R.id.heightField)
        val weightField = findViewById<EditText>(R.id.weightField)
        val txtResult = findViewById<TextView>(R.id.txtResult);

        btnBmi.setOnClickListener{
            val height = heightField.text.toString().toDouble()
            val weight = weightField.text.toString().toDouble()
            val bmi = weight / Math.pow(height / 100, 2.0)

            txtResult.text = "BMI = $bmi"
        }
    }
}