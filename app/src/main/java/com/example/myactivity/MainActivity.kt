package com.example.myactivity

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import android.widget.TimePicker
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.yearpopup.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var button_background : Int = 1;

        var button_change =findViewById(R.id.but_popup) as TextView

        button_change.setOnClickListener {
            if(button_background==2){
                button_change.setText("남성")
                button_background=1;
            } else if(button_background==1){
                button_change.setText("여성")
                button_background=2;
            }
        }


        var button_background1 : Int = 1;
        var button_background2 : Int = 1;

        var button_change1 = findViewById(R.id.change_btn1) as Button;
        var button_change2 = findViewById(R.id.change_btn2) as Button;

        button_change1.setOnClickListener {
            if(button_background1==2){

                button_change1.setBackgroundResource(R.drawable.button2);
                button_change2.setBackgroundResource(R.drawable.button1);
                button_background1=1;

            } else if(button_background1==1){
                button_change1.setBackgroundResource(R.drawable.button1);
                button_change2.setBackgroundResource(R.drawable.button2);
                button_background2=1;

                button_background1=2;
            }
        }



        button_change2.setOnClickListener {
            if(button_background2==2){
                button_change2.setBackgroundResource(R.drawable.button2);
                button_change1.setBackgroundResource(R.drawable.button2);
                button_background1=1;
                button_background2=1;

            } else if(button_background2==1){
                button_change2.setBackgroundResource(R.drawable.button1);
                button_change1.setBackgroundResource(R.drawable.button2);
                button_background1=1;

                button_background2=2;
            }
        }






}

}
