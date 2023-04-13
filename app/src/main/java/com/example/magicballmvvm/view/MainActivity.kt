package com.example.magicballmvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.magicballmvvm.databinding.ActivityMainBinding
import com.example.magicballmvvm.viewmodel.ResponseViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val responseViewModel: ResponseViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        responseViewModel.responseModel.observe(this, Observer {
            binding.tvResponse.text = it.response
        })

        binding.viewContainer.setOnClickListener { responseViewModel.randomResponse() }

    }
}