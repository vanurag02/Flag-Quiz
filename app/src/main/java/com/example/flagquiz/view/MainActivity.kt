package com.example.flagquiz.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.flagquiz.R

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        Thread.sleep(2000L)
        setContentView(R.layout.activity_main)
    }
}