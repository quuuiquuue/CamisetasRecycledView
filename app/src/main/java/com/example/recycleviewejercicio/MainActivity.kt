package com.example.recycleviewejercicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
        setContentView(R.layout.activity_main)

        initRecycleView()
    }

    private fun initRecycleView() {
        val recycleView = findViewById<RecyclerView>(R.id.recycleview)
        recycleView.layoutManager = GridLayoutManager(this, 3) // Mostrar 3 columnas

        // Creamos el adaptador y lo asignamos al RecyclerView
        val adapter = CamisetasAdapter(CamisetasProvider.camisetasList)
        recycleView.adapter = adapter
    }
}

