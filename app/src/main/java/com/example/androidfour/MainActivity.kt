package com.example.androidfour

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.androidfour.httpclient.OkhttpPageActivity
import com.example.androidfour.listView.ListViewOneActivity
import com.example.androidfour.listView.ListviewTwoActivity
import com.example.androidfour.recycler_view.RecyclerViewOneActivity
import com.example.androidfour.view_pager.ViewPagerTwoActivity
import com.example.androidfour.view_pager.ViewpagerOneActivity
import com.example.androidfour.view_pager2.Viewpager2OneActivity
import com.example.androidfour.view_pager2.Viewpager2ThreeActivity
import com.example.androidfour.view_pager2.Viewpager2TwoActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

//    val navController = this.findNavController(R.id.nav_host_fragment)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBottomNavView = findViewById<Button>(R.id.btnBottomNavigationView)
        val btnListView = findViewById<Button>(R.id.btnListviewOne)
        val btnListViewTwo = findViewById<Button>(R.id.btnListviewTwo)
        val btnRecyclerviewOne = findViewById<Button>(R.id.btnRecyclerviewOne)
        val btnViewPagerOne = findViewById<Button>(R.id.btnViewPagerOne)
        val btnViewPagerTwo = findViewById<Button>(R.id.btnViewPagerTwo)
        val btnViewPager2One = findViewById<Button>(R.id.btnViewPager2One)
        val btnViewPager2Two = findViewById<Button>(R.id.btnViewPager2Two)
        val btnViewPager2Three = findViewById<Button>(R.id.btnViewPager2Three)
        val btnOkHttpClient = findViewById<Button>(R.id.btnOkHttpClient)

        btnBottomNavView.setOnClickListener{

            val intent = Intent(this , BottomNavigationHomeActivity::class.java)
            startActivity(intent)
        }

        btnListView.setOnClickListener{
            val intent = Intent(this , ListViewOneActivity::class.java)
            startActivity(intent)
        }

        btnListViewTwo.setOnClickListener{
            val intent = Intent(this, ListviewTwoActivity::class.java)
            startActivity(intent)
        }

        btnRecyclerviewOne.setOnClickListener{
            val intent = Intent(this, RecyclerViewOneActivity ::class .java)
            startActivity(intent)
        }

        btnViewPagerOne .setOnClickListener{
            val intent = Intent(this, ViewpagerOneActivity::class.java)
            startActivity(intent)
        }

        btnViewPagerTwo .setOnClickListener{
            val intent = Intent(this, ViewPagerTwoActivity::class.java)
            startActivity(intent)
        }

        btnViewPager2One .setOnClickListener{
            val intent = Intent(this, Viewpager2OneActivity::class.java)
            startActivity(intent)
        }


        btnViewPager2Two .setOnClickListener{
            val intent = Intent(this, Viewpager2TwoActivity::class.java)
            startActivity(intent)
        }

        btnViewPager2Three .setOnClickListener{
            val intent = Intent(this, Viewpager2ThreeActivity::class.java)
            startActivity(intent)
        }
        btnOkHttpClient .setOnClickListener{
            val intent = Intent(this, OkhttpPageActivity::class.java)
            startActivity(intent)
        }


    }


}