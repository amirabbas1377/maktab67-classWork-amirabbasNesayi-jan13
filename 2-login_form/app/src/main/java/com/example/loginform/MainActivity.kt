package com.example.loginform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var firsNameView: EditText
    lateinit var lastNameView: EditText
    lateinit var button: Button
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViews()
        showResult()
    }

    private fun findViews() {
        firsNameView = findViewById(R.id.first_name_view)
        lastNameView = findViewById(R.id.last_name_view)
        button = findViewById(R.id.confirm_button)
        result = findViewById(R.id.result_view)
    }

    private fun showResult() {
        var firstName: String
        var lastName: String
        button.setOnClickListener {
            firstName = firsNameView.text.toString()
            lastName = lastNameView.text.toString()
            if (firstName.length * lastName.length != 0) {
                result.text = getString(R.string.show_result, firstName, lastName)
                result.visibility = TextView.VISIBLE
            }
        }
    }

}