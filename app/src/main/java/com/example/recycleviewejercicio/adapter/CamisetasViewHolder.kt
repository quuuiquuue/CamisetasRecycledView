package com.example.recycleviewejercicio.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.recycleview.Camisetas

import com.example.recycleviewejercicio.R

class CamisetasViewHolder(view: View):ViewHolder(view) {

    val model = view.findViewById<TextView>(R.id.textCamisetas)
    val color = view.findViewById<TextView>(R.id.textColor)
    val description = view.findViewById<TextView>(R.id.textDescription)
    val photo = view.findViewById<ImageView>(R.id.imageCamiseta)

    fun render(camisetasModelo: Camisetas) {
        model.text = camisetasModelo.model
        color.text = camisetasModelo.color
        description.text = camisetasModelo.description
        Glide.with(photo.context).load(camisetasModelo.photo).into(photo)
    }
}