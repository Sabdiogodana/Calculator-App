package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculationActivity : AppCompatActivity() {
    lateinit var btnAdd: Button
    lateinit var btnSubtract:Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus:Button
    lateinit var etOne: EditText
    lateinit var etTwo: EditText
    lateinit var tvResult:TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculation)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)
        etOne = findViewById(R.id.etOne)
        etTwo = findViewById(R.id.etTwo)
        tvResult = findViewById(R.id.tvResult)


        btnAdd.setOnClickListener {
            var one = etOne.text.toString().toInt()
            var two = etTwo.text.toString().toInt()
            addition(one, two)

        }

        btnSubtract.setOnClickListener {
            var one = etOne.text.toString().toInt()
            var two = etTwo.text.toString().toInt()
            subtraction(one, two)

        }

        btnMultiply.setOnClickListener {
            var one = etOne.text.toString().toInt()
            var two = etTwo.text.toString().toInt()
            multiplication(one, two)

        }
        btnModulus.setOnClickListener {
            var one = etOne.text.toString().toInt()
            var two = etTwo.text.toString().toInt()
            calculateModulus(one, two)


        }

    }
        fun addition(one: Int, two: Int) {
            var sum = one+two
            tvResult.text=sum.toString()
        }

        fun subtraction(one: Int, two: Int) {
            var diff = one-two
            tvResult.text=diff.toString()
        }
        fun multiplication(one: Int, two: Int) {
            var multiply = one*two
            tvResult.text=multiply.toString()
        }
        fun calculateModulus(one: Int, two: Int) {
            var modulus = one%two
            tvResult.text=modulus.toString()
        }
    }
