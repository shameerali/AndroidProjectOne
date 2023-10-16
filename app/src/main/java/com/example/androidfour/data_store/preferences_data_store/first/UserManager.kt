package com.example.androidfour.data_store.preferences_data_store.first

import android.content.Context
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
//import androidx.datastore.preferences.createDataStore
//import androidx.datastore.preferences.edit
//import androidx.datastore.preferences.preferencesKey
import androidx.datastore.preferences.core.edit


import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences

import androidx.datastore.preferences.preferencesDataStore
//import com.example.androidfour.data_store.preferences_data_store.second.data.local.dataStore

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.dataStore by preferencesDataStore(
    name = "PreferenceDataStore"
)

class UserManager(context: Context) {

    // Create the dataStore and give it a name same as shared preferences

    // Preferences DataStore

//  if use this   implementation 'androidx.datastore:datastore-preferences:1.0.0-alpha01'
//    private val dataStore = context.createDataStore(name = "user_prefs")

    // dataSource access the DataStore file and does the manipulation based on our requirements.
    private val dataSource = context.dataStore

    // Create some keys we will use them to store and retrieve the data
    companion object {
        //        val USER_AGE_KEY = preferencesKey<Int>("USER_AGE")
//        val USER_NAME_KEY = preferencesKey<String>("USER_NAME")
        val USER_AGE_KEY = intPreferencesKey("USER_AGE")
        val USER_NAME_KEY = stringPreferencesKey("USER_NAME")
    }

    // Store user data
    // refer to the data store and using edit
    // we can store values using the keys
    suspend fun storeUser(age: Int, name: String) {
//        dataStore.edit {
//            it[USER_AGE_KEY] = age
//            it[USER_NAME_KEY] = name
//
//            // here it refers to the preferences we are editing
//        }

        dataSource.edit {
            it[USER_AGE_KEY] = age
            it[USER_NAME_KEY] = name

            // here it refers to the preferences we are editing
        }
    }

    // Create an age flow to retrieve age from the preferences
    // flow comes from the kotlin coroutine
//    val userAgeFlow: Flow<Int> = dataStore.data.map {
//        it[USER_AGE_KEY] ?: 0
//    }

    val userAgeFlow: Flow<Int> = dataSource.data.map {
        it[USER_AGE_KEY] ?: 0
    }

    // Create a name flow to retrieve name from the preferences
//    val userNameFlow: Flow<String> = dataStore.data.map {
//        it[USER_NAME_KEY] ?: ""
//    }

    val userNameFlow: Flow<String> = dataSource.data.map {
        it[USER_NAME_KEY] ?: ""
    }

}