package com.example.helloworld

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() { //메인 액티비티-> AppCompatActivity -> Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        settingButton()
    }

    fun settingButton(){
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            //subActivity로 이동
            //intent : 의지,지향,의도
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }
    }
}