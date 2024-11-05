package com.example.recycleviewejercicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewejercicio.adapter.CamisetasAdapter
import com.example.recycleviewejercicio.CamisetasProvider
import com.example.recycleviewejercicio.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CamisetasProvider.camisetasList
        setContentView(R.layout.activity_main)
        initRecycleView()
    }

    private fun initRecycleView() {
        val recycleView = findViewById<RecyclerView>(R.id.recycleview)
        //LinearLayoutManager nos indica como lo vamos a mostrar, en este caso de uno en uno
        recycleView.layoutManager = GridLayoutManager(this,3)
        //A nuestro adapter le pasamos la lista de elementos que tenemos generada
        recycleView.adapter = CamisetasAdapter(CamisetasProvider.camisetasList)
    }

}