package com.dnail.designsg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CreateNewOKRActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_new_okr)

        val actionBar = supportActionBar

        actionBar!!.title = "Tạo OKR"

        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar.setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp)
    }
}
