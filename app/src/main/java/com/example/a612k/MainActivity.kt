package com.example.a612k

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        button = findViewById(R.id.button_id)
        button.setOnClickListener {
            val users = Users("Alisher",27)
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("users",users)
            startActivity(intent)
        }
    }

}