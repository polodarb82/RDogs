package com.pdb82.rdogsv.ui.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pdb82.rdogsv.data.data.Datasource
import com.pdb82.rdogsv.databinding.FragmentMainBinding
import com.pdb82.rdogsv.ui.recycler.MainRV

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)

        val myDataset = Datasource().loadAffirmations()
        val recyclerView = binding.rvMain
        recyclerView.adapter = MainRV(requireContext(), myDataset)
        recyclerView.setHasFixedSize(true)

        return binding.root
    }
}