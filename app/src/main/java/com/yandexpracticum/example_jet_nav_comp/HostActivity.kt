package com.yandexpracticum.example_jet_nav_comp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yandexpracticum.example_jet_nav_comp.databinding.ActivityHostBinding


class HostActivity : AppCompatActivity() {

private lateinit var binding: ActivityHostBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHostBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}