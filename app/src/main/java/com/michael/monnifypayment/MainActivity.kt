package com.michael.monnifypayment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var customerName: EditText
    private lateinit var customerEmail: EditText
    private lateinit var customerPhone: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        customerName = findViewById(R.id.customerName)
        customerEmail = findViewById(R.id.customerEmail)
        customerPhone = findViewById(R.id.customerPhone)
    }
}