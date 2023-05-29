package com.example.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.ui.recyclerview.adapter.ListaProdutosAdapter

//Changes Branch
class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val name = findViewById<TextView>(R.id.name)
//        name.text = "Cesta de frutas"
//        val description = findViewById<TextView>(R.id.description)
//        description.text = "Laranja, manga e maçã"
//        val value = findViewById<TextView>(R.id.value)
//        value.text = "19,99"
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter()


    }
}

