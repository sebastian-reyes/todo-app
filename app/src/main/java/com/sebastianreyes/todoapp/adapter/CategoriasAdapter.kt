package com.sebastianreyes.todoapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sebastianreyes.todoapp.R
import com.sebastianreyes.todoapp.TaskCategory

class CategoriasAdapter(private val categorias: List<TaskCategory>) :
    RecyclerView.Adapter<CategoriasViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriasViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_task_categoria, parent, false)
        return CategoriasViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoriasViewHolder, position: Int) {
        holder.render(categorias[position])
    }

    override fun getItemCount() = categorias.size
}