package com.pdb82.rdogsv.ui.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pdb82.rdogsv.databinding.ActivityMainBinding
import com.pdb82.rdogsv.ui.view.fragments.MainFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(binding.mainFragmentView.id, MainFragment())
            .addToBackStack(null)
            .commit()
    }
}
