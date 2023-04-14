package com.example.androidfour.viewmodel.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.androidfour.R
import com.example.androidfour.databinding.ActivitySecondVmactivityBinding

class SecondVMActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondVmactivityBinding;

    private lateinit var secondVMViewModel: SecondVMViewModel
    private lateinit var secondVMViewModelFactory: SecondVMViewModelFactory
//    private lateinit var textView: TextView
//    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondVmactivityBinding.inflate(layoutInflater)

        setContentView(binding.root)

//        textView = findViewById(R.id.textView)
//        button = findViewById(R.id.button)
        secondVMViewModelFactory = SecondVMViewModelFactory(125)
        secondVMViewModel = ViewModelProvider(this, secondVMViewModelFactory)
            .get(SecondVMViewModel::class.java)

        binding.textView.text = secondVMViewModel.getCurrentCount().toString()

        binding.button.setOnClickListener{
            binding.textView.text=secondVMViewModel.getUpdatedCount().toString()

        }
    }
}