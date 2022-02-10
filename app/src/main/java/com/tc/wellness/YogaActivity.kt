package com.tc.wellness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tc.wellness.databinding.ActivityYogaBinding

class YogaActivity : AppCompatActivity() {

    //using binding to connect XML file to Kotlin file
    private lateinit var binding: ActivityYogaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYogaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Setting the custom title for action bar
        title = "Time For Yoga"
    }
}