package com.sebastianreyes.todoapp.adapter

import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.sebastianreyes.todoapp.R
import com.sebastianreyes.todoapp.TaskCategory

class CategoriasViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val tvNombreCategoria: TextView = view.findViewById(R.id.tvNombreCategoria)
    private val divisor: View = view.findViewById(R.id.divisor)
    fun render(taskCategory: TaskCategory) {
        when (taskCategory) {
            TaskCategory.Negocios -> {
                tvNombreCategoria.text = "Negocios"
                divisor.setBackgroundColor(
                    ContextCompat.getColor(
                        divisor.context,
                        R.color.categoria_negocios
                    )
                )
            }

            TaskCategory.Otros -> {
                tvNombreCategoria.text = "Otros"
                divisor.setBackgroundColor(
                    ContextCompat.getColor(
                        divisor.context,
                        R.color.categoria_otros
                    )
                )
            }

            TaskCategory.Personal -> {
                tvNombreCategoria.text = "Personal"
                divisor.setBackgroundColor(
                    ContextCompat.getColor(
                        divisor.context,
                        R.color.categoria_personal
                    )
                )
            }

            TaskCategory.Estudios -> {
                tvNombreCategoria.text = "Estudios"
                divisor.setBackgroundColor(
                    ContextCompat.getColor(
                        divisor.context,
                        R.color.categoria_estudios
                    )
                )
            }
        }
    }
}