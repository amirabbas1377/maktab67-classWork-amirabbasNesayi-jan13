package com.example.find_numbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var editText :EditText
    lateinit var button: Button
    lateinit var result:TextView
    lateinit var sumView:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findView()

        calculatingResult()
    }

    private fun findView(){
        editText = findViewById(R.id.edit_text)
        button = findViewById(R.id.confirm_button)
        result = findViewById(R.id.result_view)
        sumView = findViewById(R.id.sum_view)
    }

    fun calculatingResult(){
        button.setOnClickListener {
            var flag = false
            var listOfNumbers = editText.text.toString().split(" ").map { it.toInt() }
            var sum = sumView.text.toString().toInt()
            outer@for (i in listOfNumbers.indices){
                val pivot = sum - listOfNumbers[i]
                for (j in i+1 until listOfNumbers.size){
                    if (listOfNumbers[j] == pivot) {
                        result.text = getString(R.string.show_result, listOfNumbers[i], listOfNumbers[j])
                        result.visibility = View.VISIBLE
                        flag = true
                        break@outer
                    }
                }
            }
            if (!flag){
                result.text = "nothing"
                result.visibility = View.VISIBLE
            }
        }
    }

}