package com.kotlincalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.databinding.DataBindingUtil
import com.kotlincalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val textView: TextView = binding.textView
        binding.handlers = DigitPressHandler()
        binding.resultView = textView
    }
}
