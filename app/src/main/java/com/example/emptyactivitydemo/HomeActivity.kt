package com.example.emptyactivitydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val apellido = intent.extras?.getString(Constant.NAV_APELLIDO)
        Log.i("HomeActivity", "$apellido")
    }
}