package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Secreen_two : AppCompatActivity() {

    //for concatination numbers 1 k bad 2 aya then 3

    private var strNumber: String = ""

    private var firstOperand: Double = 0.0
    private var operator: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secreen_two)

        // Initialize the components
        initializeComponents()
    }


    private fun initializeComponents() {
        val tvDisplay: TextView = findViewById(R.id.textView2)


        val button1: Button = findViewById(R.id.button2)
        button1.setOnClickListener {
            strNumber += "1"
            tvDisplay.text = strNumber
        }

        val button2: Button = findViewById(R.id.buttonn2)
        button2.setOnClickListener {
            strNumber += "2"
            tvDisplay.text = strNumber
        }

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            strNumber += "3"
            tvDisplay.text = strNumber
        }

        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener {
            strNumber += "4"
            tvDisplay.text = strNumber
        }

        val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener {
            strNumber += "5"
            tvDisplay.text = strNumber
        }

        val button6: Button = findViewById(R.id.button6)
        button6.setOnClickListener {
            strNumber += "6"
            tvDisplay.text = strNumber
        }

        val button7: Button = findViewById(R.id.button7)
        button7.setOnClickListener {
            strNumber += "7"
            tvDisplay.text = strNumber
        }

        val button8: Button = findViewById(R.id.button8)
        button8.setOnClickListener {
            strNumber += "8"
            tvDisplay.text = strNumber
        }

        val button9: Button = findViewById(R.id.button9)
        button9.setOnClickListener {
            strNumber += "9"
            tvDisplay.text = strNumber
        }

        val buttonZero: Button = findViewById(R.id.button_zero)
        buttonZero.setOnClickListener {
            strNumber += "0"
            tvDisplay.text = strNumber
        }

        val plus: Button = findViewById(R.id.plus2)
        plus.setOnClickListener {
            if (strNumber.isNotEmpty()) {
                firstOperand = strNumber.toDouble()
                operator = "+"
                strNumber = ""
                // tvDisplay.text = "+"
            } else {
                // Handle the case where strNumber is empty
                // For example, show a toast or set an error message
                Toast.makeText(this, "Please enter a number first", Toast.LENGTH_SHORT).show()
            }

            val minus: Button = findViewById(R.id.minus)
            minus.setOnClickListener {
                if (strNumber.isNotEmpty()) {
                    firstOperand = strNumber.toDouble()
                    operator = "-"
                    strNumber = ""
                    // tvDisplay.text = "+"
                } else {
                    // Handle the case where strNumber is empty
                    // For example, show a toast or set an error message
                    Toast.makeText(this, "Please enter a number first", Toast.LENGTH_SHORT).show()
                }
                val multi: Button = findViewById(R.id.multiplying)
                multi.setOnClickListener {
                    firstOperand = strNumber.toDouble()
                    operator = "*"
                    strNumber = ""
                    //tvDisplay.text = "*"
                }

                val divide: Button = findViewById(R.id.division)
                divide.setOnClickListener {
                    firstOperand = strNumber.toDouble()
                    operator = "/"
                    strNumber = ""
                    //tvDisplay.text = "/"
                }

                val dot: Button = findViewById(R.id.button_dot)
                dot.setOnClickListener {
                    strNumber += "."
                    tvDisplay.text = strNumber
                }

                val equal: Button = findViewById(R.id.button_equalto)
                equal.setOnClickListener {
                    val secondOperand = strNumber.toDouble()
                    var result = 0.0


                    //working just like a switch
                    when (operator) {
                        "+" -> result = firstOperand + secondOperand
                        "-" -> result = firstOperand - secondOperand
                        "*" -> result = firstOperand * secondOperand
                        "/" -> result = firstOperand / secondOperand
                    }
                    tvDisplay.text = result.toString()
                    strNumber = result.toString()
                }
                val clear: Button = findViewById(R.id.clear)
                clear.setOnClickListener {
                    strNumber = ""
                    firstOperand = 0.0
                    operator = ""
                    tvDisplay.text = ""
                }
                val del: Button = findViewById(R.id.del)
                del.setOnClickListener {
                    if (strNumber.isNotEmpty()) {
                        strNumber = strNumber.dropLast(1)
                        tvDisplay.text = strNumber
                    }
                }


            }
        }
    }
}
