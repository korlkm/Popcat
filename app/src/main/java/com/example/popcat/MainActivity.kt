package com.example.popcat

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val count:TextView = findViewById<TextView>(R.id.count)
        var number = 0;

        var imageView:ImageView = findViewById(R.id.imageView)
        imageView.setImageResource(R.drawable.popcat1)

        imageView.setOnTouchListener(object : View.OnTouchListener{
            @SuppressLint("ClickableViewAccessibility")
            override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {
                if (p1 != null) {
                    if(p1.action == MotionEvent.ACTION_DOWN) {
                        imageView.setImageResource(R.drawable.popcat2)
                        number++
                        count.setText(number.toString())

                    } else {
                        imageView.setImageResource(R.drawable.popcat1)
                    }
                }

                return true

            }
        })
    }
}