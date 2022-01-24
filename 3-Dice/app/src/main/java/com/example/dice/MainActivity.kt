package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.math.abs
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var button:Button
    lateinit var dice: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViews()

        diceGenerator()

    }

    private fun findViews(){
        button = findViewById(R.id.button)
        dice = findViewById(R.id.dice)
    }

    private fun diceGenerator(){
        button.setOnClickListener {
            var randomNumber = (abs(Random.nextInt()) % 6) + 1
            when(randomNumber){
                1 -> dice.setImageResource(R.drawable.dice_1)
                2 -> dice.setImageResource(R.drawable.dice_2)
                3 -> dice.setImageResource(R.drawable.dice_3)
                4 -> dice.setImageResource(R.drawable.dice_4)
                5 -> dice.setImageResource(R.drawable.dice_5)
                6 -> dice.setImageResource(R.drawable.dice_6)
            }
        }
    }
}