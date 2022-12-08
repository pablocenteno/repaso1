package com.example.repaso.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.repaso.Pista
import com.example.repaso.R

class Adapter(val listaPista:List<Pista>) :RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val layoutInflater=LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item,parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val item =listaPista[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return listaPista.size
    }
}