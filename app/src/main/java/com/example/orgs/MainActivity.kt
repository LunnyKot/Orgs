package com.example.orgs

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import android.widget.Toast

class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        val view = TextView(this)
        view.setText("Cesta de frutas")
        setContentView(view)
    }
}