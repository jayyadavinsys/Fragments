package com.example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class ParentFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_parent, container,false)
        val btnChild= view.findViewById<Button>(R.id.btn_add_child)
        btnChild.setOnClickListener {
            childFragmentManager.beginTransaction()
                .replace(R.id.child_fragment_view, ChildFragment())
                .commit()
        }
        return view
    }
}