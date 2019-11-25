package com.example.exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCal.setOnClickListener() {
            val weight: Double = txtWeight.text.toString().toDouble()
            val height: Double = txtHeight.text.toString().toDouble()

            val bmi: Double = weight / (height * height)

            if (bmi < 18.5) {
                result.text = "%.2f ".format(bmi) + "Under"
                image.setImageResource(R.drawable.under)
            } else if (bmi < 24.9) {
                result.text = "%.2f ".format(bmi) + "Normal"
                image.setImageResource(R.drawable.normal)
            } else if (bmi > 25) {
                result.text = "%.2f ".format(bmi) + "Over"
                image.setImageResource(R.drawable.over)
            }
        }

        btnReset.setOnClickListener(){
            txtHeight.setText("")
            txtWeight.setText("")
        }

        }
}
