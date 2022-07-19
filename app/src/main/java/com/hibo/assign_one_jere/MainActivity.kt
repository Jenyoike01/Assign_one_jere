package com.hibo.assign_one_jere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var buttoncalculator: Button?= null
    var buttonIntents: Button?= null
    var buttonWebsite: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttoncalculator = findViewById(R.id.mBtnCalc)
        buttoncalculator!!.setOnClickListener {
            var goToCalcIntent = Intent(applicationContext,CalculatorActivity::class.java)
            startActivity(goToCalcIntent)
        }

        buttonIntents = findViewById(R.id.mBtnIntents)
        buttonIntents!!.setOnClickListener {
            var goToIntIntent = Intent(applicationContext,IntentsActivity::class.java)
            startActivity(goToIntIntent)
        }

        buttonWebsite = findViewById(R.id.mBtnWebsite)
        buttonWebsite!!.setOnClickListener {
            var goToWebIntent = Intent(applicationContext, WebActivity::class.java)
            startActivity(goToWebIntent)
        }
    }
}