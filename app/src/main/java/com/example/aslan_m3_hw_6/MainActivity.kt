package com.example.aslan_m3_hw_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aslan_m3_hw_6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var  FirstFragment = FirstFragment()
    private var SecondFragment = SecondFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

     supportFragmentManager.beginTransaction()
         .add(R.id.fragment_first_container, FirstFragment)
         .add(R.id.fragment_second, SecondFragment)
         .commit()
    }
}