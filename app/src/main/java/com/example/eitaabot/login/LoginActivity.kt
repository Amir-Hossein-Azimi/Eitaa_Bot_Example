package com.example.eitaabot.login

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.eitaabot.R
import com.example.eitaabot.databinding.ActivityLoginBinding
import com.example.eitaabot.fragments.MainFragment




class LoginActivity : AppCompatActivity() , View.OnClickListener {
    lateinit var sharedPref : SharedPreferences
    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        sharedPref = getSharedPreferences("USER" , Context.MODE_PRIVATE)
        val userName = sharedPref.getString("TOKEN" , "") ?: ""
        if (userName.isNotEmpty()){
            startActivity(Intent(this , MainFragment::class.java))
            finish()
        }

        setContentView(view)
        binding.btnLogin.setOnClickListener(this)



    }

    override fun onClick(view: View?) {
        when(view){
            binding.btnLogin ->{
                val tokenValue =binding.edtLogin.text.toString()
                Log.d("TOKEN" , tokenValue)
                if (!tokenValue.isNullOrEmpty()){
                    sharedPref.edit()?.putString("TOKEN" , tokenValue)?.apply()
                    startActivity(Intent(this , MainFragment::class.java))
                    finish()
                }

            }
        }
    }
}