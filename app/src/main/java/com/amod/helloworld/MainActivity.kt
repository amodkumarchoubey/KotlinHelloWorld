package com.amod.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("Hello world")
        val textView: TextView = findViewById(R.id.txt_) as TextView
        // kotlin variable and data types
        var number = 10
        print(number)
        var decimal_no=1.0
        print(decimal_no)

        var mystr:String
        mystr="Variabl example"
        print(mystr)

        val  anotherString:String
        anotherString="Val cannot be reassigned"
        print(anotherString)
        textView.text=mystr+anotherString
    }
}