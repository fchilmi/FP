package com.example.fp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class home_fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.home_fragment, container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<ImageView>(R.id.produkhome).setOnClickListener{
            view.findNavController().navigate(R.id.action_home_to_atasan)
        }
        view.findViewById<ImageView>(R.id.celana).setOnClickListener{
            view.findNavController().navigate(R.id.action_home_to_celana)
        }
        view.findViewById<ImageView>(R.id.hoodie).setOnClickListener{
            view.findNavController().navigate(R.id.action_home_to_hoodie)
        }
        view.findViewById<ImageView>(R.id.rok).setOnClickListener{
            view.findNavController().navigate(R.id.action_home_to_rok)
        }
    }
}