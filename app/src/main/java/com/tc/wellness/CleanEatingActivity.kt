package com.tc.wellness

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tc.wellness.databinding.ActivityCleanEatingBinding

class CleanEatingActivity : AppCompatActivity() {

    //using binding to connect XML file to Kotlin file
    private lateinit var binding: ActivityCleanEatingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCleanEatingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Setting the custom title for action bar
        title = "Healthy Food - Healthy Mind"
    }
}