package com.example.androidfour

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidfour.bottom_nav.BottomNavigationHomeActivity
import com.example.androidfour.databinding.ActivityMainBinding
import com.example.androidfour.flow.first.presentation.FlowFirstActivity
import com.example.androidfour.httpclient.OkhttpPageActivity
import com.example.androidfour.listView.ListViewOneActivity
import com.example.androidfour.listView.ListviewTwoActivity
import com.example.androidfour.livedata.LiveDataOneActivity
import com.example.androidfour.mvvm.code_first.FirstMvvmActivity
import com.example.androidfour.mvvm.code_second.SecondMvvmActivity
import com.example.androidfour.data_store.preferences_data_store.first.DataStoreActivity
import com.example.androidfour.data_store.preferences_data_store.second.data.local.DataStoreSecondActivity
import com.example.androidfour.recycler_view.RecyclerViewOneActivity
import com.example.androidfour.retrofit.RetrofitOneActivity
import com.example.androidfour.retrofit.RetrofitTwoActivity
import com.example.androidfour.room_db.third_todolist.NoteHomeActivity
import com.example.androidfour.view_pager.ViewPagerTwoActivity
import com.example.androidfour.view_pager.ViewpagerOneActivity
import com.example.androidfour.view_pager2.Viewpager2OneActivity
import com.example.androidfour.view_pager2.Viewpager2ThreeActivity
import com.example.androidfour.view_pager2.Viewpager2TwoActivity
import com.example.androidfour.viewmodel.MainViewModelOneActivity
import com.example.androidfour.viewmodel.second.SecondVMActivity

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

//    val navController = this.findNavController(R.id.nav_host_fragment)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnBottomNavigationView.setOnClickListener{
                replaceActivity(BottomNavigationHomeActivity())
            }

            btnListviewOne.setOnClickListener{
                replaceActivity(ListViewOneActivity())
//                val intent = Intent(this , ListViewOneActivity::class.java)
//                startActivity(intent)
            }

            btnListviewTwo.setOnClickListener{
                replaceActivity(ListviewTwoActivity())
//                val intent = Intent(this, ListviewTwoActivity::class.java)
//                startActivity(intent)
            }

            btnRecyclerviewOne.setOnClickListener{
                replaceActivity(RecyclerViewOneActivity())
//                val intent = Intent(this, RecyclerViewOneActivity ::class .java)
//                startActivity(intent)
            }

            btnViewPagerOne .setOnClickListener{
                replaceActivity(ViewpagerOneActivity())
//                val intent = Intent(this, ViewpagerOneActivity::class.java)
//                startActivity(intent)
            }

            btnViewPagerTwo .setOnClickListener{
                replaceActivity(ViewPagerTwoActivity())
//                val intent = Intent(this, ViewPagerTwoActivity::class.java)
//                startActivity(intent)
            }

            btnViewPager2One .setOnClickListener{
                replaceActivity(Viewpager2OneActivity())
//                val intent = Intent(this, Viewpager2OneActivity::class.java)
//                startActivity(intent)
            }


            btnViewPager2Two .setOnClickListener{
                replaceActivity(Viewpager2TwoActivity())
//                val intent = Intent(this, Viewpager2TwoActivity::class.java)
//                startActivity(intent)
            }

            btnViewPager2Three .setOnClickListener{
                replaceActivity(Viewpager2ThreeActivity())
//                val intent = Intent(this, Viewpager2ThreeActivity::class.java)
//                startActivity(intent)
            }
            btnOkHttpClient .setOnClickListener{
                replaceActivity(OkhttpPageActivity())
//                val intent = Intent(this, OkhttpPageActivity::class.java)
//                startActivity(intent)
            }

            btnRetrofitOne .setOnClickListener{
                replaceActivity(RetrofitOneActivity())
//                val intent = Intent(this, RetrofitOneActivity::class.java)
//                startActivity(intent)
            }
            btnRetrofitTwo .setOnClickListener{
                replaceActivity(RetrofitTwoActivity())
//                val intent = Intent(this, RetrofitTwoActivity::class.java)
//                startActivity(intent)
            }
            btnViewModelOne .setOnClickListener{
                replaceActivity(MainViewModelOneActivity())
//                val intent = Intent(this, MainViewModelOneActivity::class.java)
//                startActivity(intent)
            }

            btnViewModelTwo .setOnClickListener{
                replaceActivity(SecondVMActivity())
//                val intent = Intent(this, SecondVMActivity::class.java)
//                startActivity(intent)
            }
            btnMvvmOne .setOnClickListener{
                replaceActivity(FirstMvvmActivity())
//                val intent = Intent(this, FirstMvvmActivity::class.java)
//                startActivity(intent)
            }
            btnMvvmTwo .setOnClickListener{
                replaceActivity(SecondMvvmActivity())
//                val intent = Intent(this, SecondMvvmActivity::class.java)
//                startActivity(intent)
            }
            btnLiveDataOne .setOnClickListener{
                replaceActivity(LiveDataOneActivity())
//                val intent = Intent(this, LiveDataOneActivity::class.java)
//                startActivity(intent)
            }
            btnFlowOne .setOnClickListener{
                replaceActivity(FlowFirstActivity())
//                val intent = Intent(this, FlowFirstActivity::class.java)
//                startActivity(intent)
            }

            ////// After change button click

            btnRoomDbThree.setOnClickListener {
                replaceActivity(NoteHomeActivity())
            }

            btnDataStoreOne.setOnClickListener {
                replaceActivity(DataStoreActivity())
            }

            btnDataStoreSecond.setOnClickListener {
                replaceActivity(DataStoreSecondActivity())
            }

        }
    }

    fun replaceActivity( activity: Activity){
        val intent = Intent(this@MainActivity, activity::class.java)
        startActivity(intent)
    }
}