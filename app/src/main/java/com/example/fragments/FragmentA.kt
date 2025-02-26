package com.example.fragments

import android.nfc.Tag
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FragmentA:Fragment() {
    companion object{
         val TAG=javaClass.name
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_a, container, false)
        val btnNext:Button= view.findViewById(R.id.btn_next)
        btnNext.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container_view, FragmentB())
                .addToBackStack(TAG)
                .commit()

        }
        return view
    }
}