package com.example.androidfour.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.androidfour.R
import com.example.androidfour.databinding.ActivityLiveDataOneBinding

class LiveDataOneActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLiveDataOneBinding
    private lateinit var viewModel: LiveDataOneActivityViewModel
    private lateinit var viewModelFactory: LiveDataOneActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityLiveDataOneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModelFactory = LiveDataOneActivityViewModelFactory("Counter Result: " , 0)
        viewModel = ViewModelProvider(this, viewModelFactory).get(LiveDataOneActivityViewModel::class.java)

        viewModel.readTitle.observe(this, Observer {
            binding.textTitle.text = it.toString()
        })

        viewModel.readResult.observe(this, Observer{
            binding.textResult.text = it.toString()
        })

        binding.apply {
            buttonPlus.setOnClickListener{
                viewModel.setPlus(editInput.text.toString().toInt())
            }

            buttonMinus.setOnClickListener{
                viewModel.setMinus(editInput.text.toString().toInt())
            }

            buttonTimes.setOnClickListener{
                viewModel.setTimes(editInput.text.toString().toInt())
            }

            buttonDivide.setOnClickListener{
                viewModel.setDivide(editInput.text.toString().toInt())
            }
        }


    }
}