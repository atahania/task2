package com.example.task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var Name :EditText
    lateinit var Last:EditText
    lateinit var Show:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Name =findViewById(R.id.editTextTextPersonName3)
        Last =findViewById(R.id.editTextTextPersonName4)
        Show =findViewById(R.id.button)
        Show.setOnClickListener{
            Toast.makeText(applicationContext,"${Name.text} ${Last.text}",Toast.LENGTH_LONG).show()
        }
    }
}