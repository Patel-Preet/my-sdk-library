package com.example.sample_sdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.my_sdk_library.SdkClass
import com.example.my_sdk_library.SdkClass2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SdkClass("test")

        SdkClass2.SdkPublicFun()
        Toast.makeText(this, SdkClass2.SdkPublicVariable, Toast.LENGTH_LONG).show()
    }
}