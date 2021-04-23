package com.example.reforgeprototype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.dice_image)
        imageView.setOnClickListener {
            rollDice_4()

        /*val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = getString(R.string.roll)
        rollButton.setOnClickListener {
            rollDice_4()*/
        }

        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice_4() {
        val randomInt = Random().nextInt(4) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.four_die_1
            2 -> R.drawable.four_die_2
            3 -> R.drawable.four_die_3
            else -> R.drawable.four_die_4
        }
        diceImage.setImageResource(drawableResource)
    }

   /* private fun rollDice_6() {
        val randomInt = Random().nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.four_die_1
            2 -> R.drawable.four_die_2
            3 -> R.drawable.four_die_3
            else -> R.drawable.four_die_4
        }
        diceImage.setImageResource(drawableResource)
    }*/
}