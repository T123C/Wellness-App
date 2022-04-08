package com.tc.wellness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tc.wellness.databinding.ActivityMeditationBinding

class MeditationActivity : AppCompatActivity() {


    //using binding to connect XML file to Kotlin file
    private lateinit var binding: ActivityMeditationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMeditationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Setting the custom title for action bar
        title = "Take A Moment To Meditate"
        binding.btnTimerStart.setOnClickListener { launchTimerActivity() }
    }

    private fun launchTimerActivity() {
        val intent = Intent(this, TimerActivity::class.java)
        startActivity(intent)
    }
}