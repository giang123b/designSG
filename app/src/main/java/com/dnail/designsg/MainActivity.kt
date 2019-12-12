package com.dnail.designsg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_okr.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar

        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar.setHomeAsUpIndicator(R.drawable.branded_menu)


//        bottom_navigation.inflateMenu(R.menu.bottom_navigation_menu)
//
        val okrFragment =  okr()
        val diaryFragment =  diary()
        val financeFragment =  finance()
        val homeFragment =  home()

        supportFragmentManager.beginTransaction().replace(R.id.contain, homeFragment).commit()

        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.it1 -> {
                    // Do something for navigation item 1
                    supportFragmentManager.beginTransaction().replace(R.id.contain, homeFragment).commit()
                    true
                }
                R.id.it2 -> {
                    supportFragmentManager.beginTransaction().replace(R.id.contain, okrFragment).commit()
                    // Do something for navigation item 2
                    true
                }
                R.id.it3 -> {
                    // Do something for navigation item 1
                    supportFragmentManager.beginTransaction().replace(R.id.contain, diaryFragment).commit()
                    true
                }
                R.id.it4 -> {
                    supportFragmentManager.beginTransaction().replace(R.id.contain, financeFragment).commit()
                    // Do something for navigation item 2
                    true
                }
                else -> false
            }
        }

    }

}
