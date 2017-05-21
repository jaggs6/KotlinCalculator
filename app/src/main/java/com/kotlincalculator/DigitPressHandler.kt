package com.kotlincalculator

import android.view.View
import android.widget.Button
import android.widget.TextView

class DigitPressHandler {
    fun onPress(view: View?, txtView: TextView) {
        if (view is Button) {
            txtView.text = (txtView.text.toString() + view.text).toInt().toString()
        }
    }
}
