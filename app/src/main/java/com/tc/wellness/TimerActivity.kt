package com.tc.wellness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import com.tc.wellness.databinding.ActivityTimerBinding
import com.tc.wellness.databinding.FragmentHomeBinding

class TimerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTimerBinding
    private lateinit var timerText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTimerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        timerText = binding.tvTimer

        title = "Take A Moment To Meditate"

        object : CountDownTimer(60000, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                timerText.text = "Time remaining: " + millisUntilFinished / 1000
            }

            override fun onFinish() {
                timerText.text = "You are a star!"
            }
        }.start()
    }
}