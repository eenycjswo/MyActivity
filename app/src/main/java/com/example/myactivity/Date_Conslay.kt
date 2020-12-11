package com.example.myactivity

import android.app.AlertDialog
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.NumberPicker
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_date__conslay.*

import java.text.SimpleDateFormat
import java.util.*

class Date_Conslay : AppCompatActivity() {
    var formatDate = SimpleDateFormat("yyyy년,MMMM,dd일", Locale.KOREAN)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date__conslay)

//        생년월일 기능
        bytton11111.setOnClickListener(View.OnClickListener {
            val getDate = Calendar.getInstance()
            val datePicker = DatePickerDialog(this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                DatePickerDialog.OnDateSetListener { datePicker, year, month, dayOfMonth ->
                    val selectDate = Calendar.getInstance()
                    selectDate.set(Calendar.YEAR,year)
                    selectDate.set(Calendar.MONTH,month)
                    selectDate.set(Calendar.DAY_OF_MONTH,dayOfMonth)
//                    나오는 값
                    val date = formatDate.format(selectDate.time)
                    Toast.makeText(this,"Date : "+date, Toast.LENGTH_LONG).show()
                    bytton11111.text=date
                },getDate.get(Calendar.YEAR),getDate.get(Calendar.MONTH),getDate.get(Calendar.DAY_OF_MONTH))
            datePicker.show()
        })



    }
}



