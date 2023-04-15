package com.example.androidfour.mvvm.code_second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.androidfour.R


class SecondMvvmActivity : AppCompatActivity(R.layout.activity_second_mvvm) {

//    dependencies {
//        implementation "androidx.fragment:fragment-ktx:1.2.5"
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<SecondMvvmFragment1>(R.id.fragment_container_view)
        }

    }
}