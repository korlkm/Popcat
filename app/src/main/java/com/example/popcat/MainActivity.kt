package com.example.popcat

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var imageView:ImageView = findViewById(R.id.imageView)
        imageView.setImageResource(R.drawable.popcat1)

        imageView.setOnTouchListener(object : View.OnTouchListener{
            @SuppressLint("ClickableViewAccessibility")
            override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {
                if (p1 != null) {
                    if(p1.action == MotionEvent.ACTION_DOWN) {
                        imageView.setImageResource(R.drawable.popcat2)
                    } else {
                        imageView.setImageResource(R.drawable.popcat1)
                    }
                }

                return true

            }
        })
    }
}