package com.thato.virtualpetapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    //utilizing the keyword "lateinit"
    //allows us to declare a variable and initialize it at a later stage
    private lateinit var startButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //reference the button by using the ID
        //initialize variable by making use of findviewbyID

        startButton = findViewById(R.id.Button)

        //create the intent to start the activity by making button clickable
        //make use of the setOnClickListener method

        startButton.setOnClickListener {
            val intent = Intent( this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

}