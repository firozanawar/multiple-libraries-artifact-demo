package com.firozanwar.artifact.libraries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.firozanwar.artifact.libraryandroid.LogUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LogUtils.d("Hi This message is from App")
    }
}
