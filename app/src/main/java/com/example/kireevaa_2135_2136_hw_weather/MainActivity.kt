package com.example.kireevaa_2135_2136_hw_weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.FileUtils.copy
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import java.nio.file.Files.copy
import java.util.Collections.copy

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<AppCompatButton>(R.id.btn).setOnClickListener( object :View.OnClickListener{
            override fun onClick(p0: View?) {

            }

        })

        data class Note(val title: String, val note: String, val color: Int)
        val dataClass2 = Note.copy()





        for(i in 1..10) {
            print("Hello")
        }

    }
}






