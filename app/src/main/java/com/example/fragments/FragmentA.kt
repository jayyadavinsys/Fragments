package com.example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FragmentA : Fragment() {
    companion object {
        val TAG = FragmentA::class.java.simpleName
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_a, container, false)

        val btnNext: Button = view.findViewById(R.id.btn_next)
        val btnAddChild: Button = view.findViewById(R.id.btn_add_child)

        // Navigate to FragmentB
        btnNext.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container_view, FragmentB())
                .addToBackStack(TAG)
                .commit()
        }

        // Add ChildFragment inside FragmentA
        btnAddChild.setOnClickListener {
            childFragmentManager.beginTransaction()
                .replace(R.id.child_fragment_view, ChildFragment())
                .addToBackStack(TAG)
                .commit()
        }

        return view
    }
}
