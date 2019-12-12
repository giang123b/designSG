package com.dnail.designsg

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class diary : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        val actionBar = activity!!.actionBar
        activity!!.title = "DIARY"
        return inflater.inflate(R.layout.fragment_diary, container, false)
    }

}
