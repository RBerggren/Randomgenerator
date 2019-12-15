package com.example.randomgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbtn= findViewById<Button>(R.id.rollbtn)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        rollbtn.setOnClickListener {
            val rand = java.util.Random().nextInt(seekBar.progress) + 1
            resultTextView.setText(rand.toString());
        }
    }
}
