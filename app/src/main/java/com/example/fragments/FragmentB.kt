package com.example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FragmentB:Fragment() {

    companion object{
        val TAG=javaClass.name
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_b, container, false)
        val btnBack= view.findViewById<Button>(R.id.btn_back)
        btnBack.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container_view, ParentFragment())
                .addToBackStack(TAG)

                .commit()
        }
        return view
    }
}