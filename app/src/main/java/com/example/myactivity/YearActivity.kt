package com.example.myactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_year.*

class YearActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_year)

        val cancel : Button = findViewById(R.id.cancel_button)
        val save : Button = findViewById(R.id.save_button)


        number_picker.minValue = 2000
        number_picker.maxValue = 2020
        number_picker.wrapSelectorWheel = true
        number_picker.setOnValueChangedListener { number_picker, oldValue, newvalue->text_view.text  = "년" }

        number_picker1.maxValue = 32
        number_picker1.minValue = 0
        number_picker1.wrapSelectorWheel = true

        number_picker.wrapSelectorWheel = false
        number_picker1.wrapSelectorWheel = false
cancel.setOnClickListener {
    finish()
}
    }
}