package com.example.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.model.Produto
import com.example.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

//Changing branches
class MainActivity: AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
//        val name = findViewById<TextView>(R.id.name)
//        name.text = "Cesta de frutas"
//        val description = findViewById<TextView>(R.id.description)
//        description.text = "Laranja, manga e maçã"
//        val value = findViewById<TextView>(R.id.value)
//        value.text = "19,99"
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto(
                nome = "teste",
                descricao = "test desc",
                valor = BigDecimal("19.99")
            ),Produto(
                nome = "teste 1",
                descricao = "test desc 1",
                valor = BigDecimal("29.99")
            ),Produto(
                nome = "teste 2",
                descricao = "test desc 2",
                valor = BigDecimal("39.99")
            ),
        ))
//        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}

