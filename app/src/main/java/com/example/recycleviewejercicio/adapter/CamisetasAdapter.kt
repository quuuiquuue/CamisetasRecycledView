package com.example.recycleviewejercicio.adapter

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewejercicio.Camiseta
import com.example.recycleviewejercicio.adapter.CamisetasViewHolder
import com.example.recycleviewejercicio.R

//A nuestro adaptardor le vamos a pasar el listado de superheroes que nos hemos creados
class CamisetasAdapter(private val camisetasList: List<Camiseta>) : RecyclerView.Adapter<CamisetasViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CamisetasViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        // Creamos el ViewHolder y pasamos el itemView
        return CamisetasViewHolder(layoutInflater.inflate(R.layout.item_camisetas, parent, false))
    }

    override fun getItemCount(): Int {
        return camisetasList.size
    }

    override fun onBindViewHolder(holder: CamisetasViewHolder, position: Int) {
        val item = camisetasList[position]
        holder.render(item) // Pasamos el modelo al render
    }
}

