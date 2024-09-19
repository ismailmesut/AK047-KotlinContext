package com.ismailmesutmujde.kotlincontext

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlincontext.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingMain : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMain.root
        setContentView(view)

        bindingMain.button.setOnClickListener {
            //Toast.makeText(this, "Hello", Toast.LENGTH_LONG).show()
            //Toast.makeText(this@MainActivity, "Hello", Toast.LENGTH_LONG).show()
            Toast.makeText(applicationContext, "Hello", Toast.LENGTH_LONG).show()
        }
    }
}