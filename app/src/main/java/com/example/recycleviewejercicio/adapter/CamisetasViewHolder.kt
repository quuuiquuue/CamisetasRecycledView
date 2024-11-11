package com.example.recycleviewejercicio.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.recycleviewejercicio.Camiseta

import com.example.recycleviewejercicio.R
import com.google.android.material.snackbar.Snackbar

class CamisetasViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val model = view.findViewById<TextView>(R.id.textCamisetas)
    val color = view.findViewById<TextView>(R.id.textColor)
    val description = view.findViewById<TextView>(R.id.textDescription)
    val photo = view.findViewById<ImageView>(R.id.imageCamiseta)

    fun render(camisetasModelo: Camiseta) {
        model.text = camisetasModelo.model
        color.text = camisetasModelo.color
        description.text = camisetasModelo.description
        Glide.with(photo.context).load(camisetasModelo.photo).into(photo)

        // Configuramos el clic en el item
        itemView.setOnClickListener {
            // Crear un Snackbar para mostrar la descripción
            Snackbar.make(it, camisetasModelo.description, Snackbar.LENGTH_LONG)
                .setDuration(3000)  // Duración del Snackbar (en milisegundos)
                .show()  // Mostrar el Snackbar


        }
    }
}



