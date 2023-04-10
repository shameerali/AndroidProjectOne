package com.example.androidfour

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment(R.layout.fragment_home) {
//    val myArg = HomeFragmentDirections.actionMyHomeFragmentToMyFirstFragment( arg1 = 1234, arg2 = "abcd)

    override fun onStart() {
        super.onStart()


        val btn = view?.findViewById<Button>(R.id.btnNext)

        btn?. setOnClickListener{
            Toast.makeText(context, "haiiiii", Toast.LENGTH_SHORT).show()
//            val directin = HomeFragmentDirection.action
//            findNavController().navigate(R.id.action_myHomeFragment_to_myFirstFragment)
        }
        

    }
}