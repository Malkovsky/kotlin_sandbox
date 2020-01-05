package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import kotlinx.android.synthetic.main.activity_main.click_counter as click_counter1

class MainActivity : AppCompatActivity() {
    private var clicks: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val click_counter_ = findViewById<Button>(R.id.click_counter)
        val text_under_the_couter_ = findViewById<TextView>(R.id.textView)

        click_counter_.setOnClickListener {
            click_counter_.text = "Clicked ${++clicks} times"
            text_under_the_couter_.text = "Button was clicked ${clicks} times"
            Toast.makeText(this, "Button was clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
