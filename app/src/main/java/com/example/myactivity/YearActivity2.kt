package com.example.myactivity

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_year2.*
import java.util.*

class YearActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_year2)

        mNumberPicker.minValue = 0
        mNumberPicker.maxValue=12


        mNumberPicker.wrapSelectorWheel = false

    }
}