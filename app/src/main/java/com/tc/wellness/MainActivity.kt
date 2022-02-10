package com.tc.wellness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.commit
import com.google.android.material.navigation.NavigationBarView
import com.tc.wellness.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {

    //using binding to connect XML file to Kotlin file with Fragment context
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //using binding to connect bottom navigation panel to Kotlin file
        binding.bottomNav.setOnItemSelectedListener(this)
    }

    //function to show home fragment
    private fun onHomeClicked() {
        supportFragmentManager.commit {
            replace(R.id.frame_content, HomeFragment())
        }
    }

    //function to show wellness fragment
    private fun onWellnessClicked() {
        supportFragmentManager.commit {
            replace(R.id.frame_content, WellnessFragment())
        }
    }

    //function to make XML navigation panel buttons clickable
    override fun onNavigationItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        R.id.nav_home -> {
            onHomeClicked()
            true
        }
        R.id.nav_wellness -> {
            onWellnessClicked()
            true
        }
        else -> {
            false
        }
    }
}



