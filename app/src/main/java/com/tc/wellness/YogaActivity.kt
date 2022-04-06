package com.tc.wellness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
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
        button()
    }

    private fun button() {

        val dialogPopUp = AlertDialog.Builder(this)
            .setTitle("Break Time!")
            .setMessage("Would you like some inspiration?")
            .setIcon(R.drawable.ic_smiley_24)
            .setPositiveButton("Oh Yes") { dialogInterface, i ->
                Toast.makeText(
                    this,
                    "Peace comes from within, do some yoga to achieve it",
                    Toast.LENGTH_SHORT
                ).show()
            }
            .setNegativeButton("Nah") { dialogInterface, i ->
                Toast.makeText(this, "Have some coffee then!", Toast.LENGTH_SHORT).show()
            }.create()

        binding.inspiration.setOnClickListener { dialogPopUp.show() }
    }
}