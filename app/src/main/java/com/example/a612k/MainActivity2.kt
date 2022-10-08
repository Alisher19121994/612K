package com.example.a612k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import timber.log.Timber

class MainActivity2 : AppCompatActivity() {
    lateinit var text: TextView
    private var TAG = MainActivity2::class.java.toString()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        initView()
    }

    private fun initView() {
        text = findViewById(R.id.text_id)

        val users = intent.getSerializableExtra("users")

        Timber.d(TAG, users)

        text.text = users.toString()


    }
}