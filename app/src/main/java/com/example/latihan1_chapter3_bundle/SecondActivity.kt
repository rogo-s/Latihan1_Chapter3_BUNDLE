package com.example.latihan1_chapter3_bundle

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latihan1_chapter3_bundle.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        binding.tvName.text = "Hallo," + bundle!!.getString("nama")
        binding.tvLahir.text = "Umur Kamu " +bundle.getInt("lahir")
    }
}