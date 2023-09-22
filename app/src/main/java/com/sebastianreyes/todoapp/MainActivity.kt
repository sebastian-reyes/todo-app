package com.sebastianreyes.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sebastianreyes.todoapp.adapter.CategoriasAdapter

class MainActivity : AppCompatActivity() {

    private var categorias = listOf(
        TaskCategory.Personal,
        TaskCategory.Negocios,
        TaskCategory.Estudios,
        TaskCategory.Otros
    )

    private lateinit var rvCategory: RecyclerView
    private lateinit var adapterCategorias: CategoriasAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()
        initUI()
    }

    private fun initComponents() {
        rvCategory = findViewById(R.id.rvCategorias)

    }

    private fun initUI() {
        adapterCategorias = CategoriasAdapter(categorias)
        rvCategory.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategory.adapter = adapterCategorias
    }
}