package com.example.latihan1_chapter3_bundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.latihan1_chapter3_bundle.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val etName = findViewById<TextInputEditText>(R.id.textFieldName)
//        val etLahir = findViewById<TextInputEditText>(R.id.textFieldUmur)
//        val bundle = Bundle()
//        bundle.putString("nama", etName.text.toString())
//        bundle.putInt("lahir", 2023 - etLahir.text.toString().toInt())

        binding.btnSave.setOnClickListener {
            val tiNama =  binding.textFieldName.text.toString()
            val tiUmur = 2023 - binding.textFieldUmur.text.toString().toInt()
            val intent = Intent(this,SecondActivity::class.java)
            val bundle = Bundle()
            bundle.putString("nama", tiNama)
            bundle.putInt("lahir", tiUmur)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}