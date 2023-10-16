package com.example.androidfour.data_store.preferences_data_store.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import androidx.lifecycle.asLiveData
import com.example.androidfour.databinding.ActivityDataStoreBinding

class DataStoreActivity : AppCompatActivity() {

    lateinit var userManager: UserManager
    var age = 0
    var name=""

    private lateinit var binding: ActivityDataStoreBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataStoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get reference to our userManager class
        userManager = UserManager(this)

        // this function saves the data to
        // preference data store on click of
        // save Button
        buttonSave()

        // this function retrieves the saved data
        // as soon as they are stored and even
        // after app is closed and started again
        observeData()
    }

    private fun buttonSave() {
        // Gets the user input and saves it
        binding.btnSave.setOnClickListener {
            name = binding.etName.text.toString()
            age = binding.etAge.text.toString().toInt()

            // Stores the values
            // Since the storeUser function of UserManager
            // class is a suspend function
            // So this has to be done in a coroutine scope
            GlobalScope.launch {
                userManager.storeUser(age, name)
            }
        }

    }

    private fun observeData() {

        // Updates age
        // every time user age changes it will be observed by userAgeFlow
        // here it refers to the value returned from the userAgeFlow function
        // of UserManager class

        this.userManager.userAgeFlow.asLiveData().observe(this){
            age = it
            binding.tvAge.text = age.toString()
        }

        // Updates name
        // every time user name changes it will be observed by userNameFlow
        // here it refers to the value returned from the usernameFlow function
        // of UserManager class

        userManager.userNameFlow.asLiveData().observe(this){
            name = it
            binding.tvName.text = it.toString()

        }

    }


}