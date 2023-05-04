package com.example.eitaabot.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.eitaabot.R
import com.example.eitaabot.databinding.ActivityLoginBinding
import com.example.eitaabot.databinding.FragmentMainBinding

class MainFragment:AppCompatActivity(){
   private lateinit var binding: FragmentMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navigation_host) as NavHostFragment
        binding.btmNavigation.setupWithNavController(navController = navHostFragment.navController)





    }
}