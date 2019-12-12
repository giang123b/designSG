package com.dnail.designsg


import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_okr.*

/**
 * A simple [Fragment] subclass.
 */
class okr : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true)
        activity!!.title = "OKR"
        return inflater.inflate(R.layout.fragment_okr, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        floating_action_button.setOnClickListener{
            val intent = Intent(context, CreateNewOKRActivity:: class.java)
            startActivity(intent)
        }
        linear_okr.setOnClickListener{
            val intent = Intent(context, okrDetail::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu, menu)
        super.onCreateOptionsMenu(menu, inflater)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val actionBar = activity!!.actionBar
//        actionBar!!.title = "OKR"

    }

}
