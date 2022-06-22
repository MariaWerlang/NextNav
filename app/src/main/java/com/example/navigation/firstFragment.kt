package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class firstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        view.findViewById<Button>(R.id.btnUm).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment)
        }

        view.findViewById<Button>(R.id.btnDois).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_thirdFragment)
        }

        return view
    }

}