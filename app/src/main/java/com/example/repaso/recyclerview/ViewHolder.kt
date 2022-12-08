package com.example.repaso.recyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.repaso.Pista
import com.example.repaso.R

class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val  nombre=view.findViewById<TextView>(R.id.nombre)
    val  desc=view.findViewById<TextView>(R.id.descripcion)
    val  direc=view.findViewById<TextView>(R.id.direccion)
    val  foto=view.findViewById<ImageView>(R.id.imageView)

    fun render(pista: Pista){
        nombre.text=pista.nombre
        desc.text=pista.descripcion
        direc.text=pista.direccion
        foto.setImageResource(pista.imagen)

    }
}