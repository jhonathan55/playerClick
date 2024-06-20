package com.example.playclick

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.playclick.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer1, Player1Fragment())
            .replace(R.id.fragmentContainer2, Player2Fragment())
            .commit()
    }

    //todo implement destroy
    override fun onDestroy() {
        super.onDestroy()

    }
}

