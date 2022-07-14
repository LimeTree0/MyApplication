package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMain2Binding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}