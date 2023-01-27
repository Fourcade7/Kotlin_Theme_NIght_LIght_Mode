package com.pr7.kotlin_theme_night_light_mode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    lateinit var radioGroup: RadioGroup
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radioGroup=findViewById(R.id.radiogroup)

        radioGroup.setOnCheckedChangeListener { radioGroup, i ->

            when(i){
                R.id.radiobutton1->{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)

                }
                R.id.radiobutton2->{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)


                }
            }

        }

    }
}