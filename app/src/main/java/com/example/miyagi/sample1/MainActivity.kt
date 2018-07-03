package com.example.miyagi.sample1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var changeButton: Button
    private lateinit var changeTextView: TextView
    private lateinit var changeButtonDown: Button
    private lateinit var imageView: ImageView
    private lateinit var buttonScreenChange: Button
    private var i = 0
    private val random = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeButton = findViewById(R.id.buttonChange)
        changeTextView = findViewById(R.id.textChange)
        changeButtonDown = findViewById(R.id.buttonDown)
        imageView = findViewById(R.id.imageView)

        buttonScreenChange = findViewById(R.id.buttonScreen)

        changeButton.setOnClickListener {
            i++
            imageView.setImageResource(R.drawable.abc)
            changeTextView.text = i.toString()
        }
        changeButtonDown.setOnClickListener {
            i = random.nextInt(30)
            imageView.setImageResource(R.drawable.a1)
            changeTextView.text = i.toString()
        }

        buttonScreenChange.setOnClickListener {
            val intent = Intent(this, EditTest::class.java)
            startActivity(intent)
        }


    }
}
