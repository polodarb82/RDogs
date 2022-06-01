package com.pdb82.rdogsv.ui.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pdb82.rdogsv.databinding.FragmentDogsBinding

class DogsFragment : Fragment() {

    private lateinit var binding: FragmentDogsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDogsBinding.inflate(inflater, container, false)



        return binding.root
    }
}