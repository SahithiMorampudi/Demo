package com.example.view


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("message","onCreate")
    }


    override fun onStart() {
        super.onStart()
        Log.d("message","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("message","onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("message","onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("message","onStop")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("message","onRestart")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("message","onDestroy")

    }


}