package com.thato.virtualpetapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    private var hunger = 60
    private var clean = 60
    private var happy = 60

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val FeedButton = findViewById<Button>(R.id.FeedButton)
        val CleanButton = findViewById<Button>(R.id.FeedButton)
        val PlayButton = findViewById<Button>(R.id.PlayButton)

        FeedButton.setOnClickListener {
           updateUI()
            FeedBeeno()
        }
        CleanButton.setOnClickListener {
            updateUI()
            CleanBeeno()
        }
        PlayButton.setOnClickListener {
            updateUI()
            PlayBeeno()
        }


    }

    private fun FeedBeeno() {
        hunger -= 10
        clean -= 10
        happy += 10
        if(hunger < 0 ) hunger = 0
        if(clean < 0) clean = 0
        if (happy > 100 ) happy = 100
        if (hunger == 0){
            Toast.makeText(this, "Your pet is no longer hungry", Toast.LENGTH_SHORT).show()
        }



    }

    private fun CleanBeeno() {
        clean += 10
        happy -= 10
        if(clean > 100) clean = 100
        if (happy > 100 ) happy = 100
        if (clean == 100) {
            Toast.makeText(this, "Your pet is now clean", Toast.LENGTH_SHORT).show()
        }


    }

    private fun PlayBeeno() {
        happy += 10
        clean -= 10
        hunger += 10

        if(happy > 100) happy = 100
        if(clean < 0 ) clean = 0
        if(hunger > 100) hunger = 100
        if (clean == 100) {
            Toast.makeText(this, "Your pet is no tired", Toast.LENGTH_SHORT).show()
        }

    }

    private fun updateUI() {
        val HungerTextView = findViewById<TextView>(R.id.HungerTextView)
        val CleanTextView = findViewById<TextView>(R.id.CleanTextView)
        val HappyTextView = findViewById<TextView>(R.id.HappyTextView)

        HungerTextView.text = "Hunger: $hunger"
        CleanTextView.text = "Water: $clean"
        HappyTextView.text = "Sun: $happy"
    }
}



