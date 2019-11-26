package com.app.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
private var currentScore = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgCookie: ImageView = findViewById(R.id.imgCookie)
        val label: TextView = findViewById(R.id.lblTotal)
        imgCookie.setOnClickListener {
            currentScore ++
            label.text = "$currentScore"
            if (currentScore == 10) {
                imgCookie.setImageResource(R.drawable.jammie)
            }
            if (currentScore == 25) {
                imgCookie.setImageResource(R.drawable.hobnob)
            }
        }
    }


}
