package com.example.activitylifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("onCreate","Hello onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart","Hello onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume","Hello onResum")
    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause","Hello onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("onRestart","Hello onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop","Hello onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy","Hello onDestroy")
    }
}