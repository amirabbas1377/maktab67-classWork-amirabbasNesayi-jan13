package com.example.toast

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    lateinit var button: Button

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        var counter = 0
        button.setOnClickListener {
            counter++
            var toast = Toast.makeText(this, "clicked $counter", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP, 0, 200)
            toast.view?.setBackgroundColor(R.color.toast)
            toast.show()
        }
    }
}