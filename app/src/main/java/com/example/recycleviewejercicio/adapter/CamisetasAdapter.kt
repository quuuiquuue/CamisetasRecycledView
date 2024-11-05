package com.example.recycleviewejercicio.adapter

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.Camisetas
import com.example.recycleviewejercicio.adapter.CamisetasViewHolder
import com.example.recycleviewejercicio.R

//A nuestro adaptardor le vamos a pasar el listado de superheroes que nos hemos creados
class CamisetasAdapter(private val camisetasList: List<Camisetas>) : RecyclerView.Adapter<CamisetasViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CamisetasViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CamisetasViewHolder(layoutInflater.inflate(R.layout.item_camisetas, parent, false))
    }

    //nos indica el tamaño de nuestro listado de superheroes
    override fun getItemCount(): Int {
        return camisetasList.size
    }

    //Por cada item y va a pasar por el SuperHero render que hemos definido en el ViewHolder
    override fun onBindViewHolder(holder: CamisetasViewHolder, position: Int) {
        //De la lista que nos pasa en el adapter accedemos a la posición de nuestro item
        val item = camisetasList[position]
        holder.render(item)
    }

}