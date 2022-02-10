package com.tc.wellness

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tc.wellness.databinding.FragmentWellnessBinding

class WellnessFragment : Fragment() {

    //using binding to connect XML file to Kotlin file with Fragment context
    private lateinit var binding: FragmentWellnessBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWellnessBinding.inflate(inflater, container, false)
        return binding.root
    }

    //separate function to keep OnCreateView content to a minimum
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupClickListeners()
    }

    /*function to bind images in XML to Kotlin file and
    make them clickable using the functions below
     */
    private fun setupClickListeners() {
        binding.frameMeditation.setOnClickListener { launchMeditationActivity() }
        binding.frameYoga.setOnClickListener { launchYogaActivity() }
        binding.frameCleanEat.setOnClickListener { launchCleanEatingActivity() }
    }

    private fun launchMeditationActivity() {
        val intent = Intent(context, MeditationActivity::class.java)
        startActivity(intent)
    }

    private fun launchYogaActivity() {
        val intent = Intent(context, YogaActivity::class.java)
        startActivity(intent)
    }

    private fun launchCleanEatingActivity() {
        val intent = Intent(context, CleanEatingActivity::class.java)
        startActivity(intent)
    }
}