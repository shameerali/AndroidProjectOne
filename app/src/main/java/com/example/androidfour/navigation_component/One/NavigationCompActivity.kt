package com.example.androidfour.navigation_component.One

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.androidfour.R
import com.example.androidfour.navigation_component.One.fragment.NcFirstPageFragmentDirections

class NavigationCompActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_comp)

        val butNext = findViewById<Button>(R.id.btnNext)

        butNext.setOnClickListener {

//            val action = NcFirstPageFragmentDirections.actionNcFirstPageFragmentToNcSecondPageFragment()
//            button.findNavController().navigate(action) // error

//            val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//            val navController = navHostFragment.navController
//            navController.navigate(R.id.action_ncFirstPageFragment_to_ncSecondPageFragment)


            val action = NcFirstPageFragmentDirections.actionNcFirstPageFragmentToNcSecondPageFragment()
            val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
            navHostFragment.findNavController().navigate(action)
        }
    }
}