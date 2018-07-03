package com.example.miyagi.sample1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.edit_test_layout.*
import kotlinx.android.synthetic.main.edit_test_layout.view.*
import java.util.*

class EditTest : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var imageView2: ImageView
    private lateinit var imageView3: ImageView
    private lateinit var imageView4: ImageView
    private lateinit var textView2: TextView
    private lateinit var editTest: EditText
    private lateinit var button: Button
    private lateinit var button2: Button
    private lateinit var button6: Button
    private lateinit var button7: Button

    private var random = Random()
    private var a = 13
    private var b = 14
    private var c = 15

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_test_layout)

        var image = IntArray(9)
        imageView2 = findViewById(R.id.imageView2)
        imageView3 = findViewById(R.id.imageView3)
        imageView4 = findViewById(R.id.imageView4)
        textView2 = findViewById(R.id.textView2)

        image[0] = R.drawable.t1
        image[1] = R.drawable.t2
        image[2] = R.drawable.t3
        image[3] = R.drawable.t4
        image[4] = R.drawable.t5
        image[5] = R.drawable.t6
        image[6] = R.drawable.t7
        image[7] = R.drawable.ic_launcher

        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)

        button.setOnClickListener {
            a = random.nextInt(1)
            imageView2.setImageResource(image[a])
            button.isEnabled = false
            if (a == b && b == c && c == a) {
                textView2.text = "あたり"
            }
        }
        button6.setOnClickListener {
            b = random.nextInt(1)
            imageView3.setImageResource(image[b])
            button6.isEnabled = false
            if (a == b && b == c && c == a) {
                textView2.text = "あたり"
            }
        }

        button7.setOnClickListener {
            c = random.nextInt(1)
            imageView4.setImageResource(image[c])
            button7.isEnabled = false
            if (a == b && b == c && c == a) {
                textView2.text = "あたり"
            }
        }

        button2.setOnClickListener {
            imageView2.setImageResource(image[7])
            imageView3.setImageResource(image[7])
            imageView4.setImageResource(image[7])
            button.isEnabled = true
            button6.isEnabled = true
            button7.isEnabled = true
            textView2.text = ""
            a = 991
            b = 992
            c = 993
        }
    }


}
