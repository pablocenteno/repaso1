package com.example.repaso.recyclerview

import com.example.repaso.Pista
import com.example.repaso.R

class Provider {
    companion object{
        val listaPistas=listOf<Pista>(
            Pista(
                1, "Padel Norte", "Cubierta, dobles, cristal", "Av. del Camino de Santiago, 25, 28050 Madrid", R.drawable.pista1
            ),
            Pista(
                2, "3 Olivos", "Exterior", "Av. del Camino de Santiago, 26, 28050 Madrid", R.drawable.pista2
            ),
            Pista(
                3, "Liceo", "Cubierta, dobles, cristal", "Av. del Camino de Santiago, 27, 28050 Madrid", R.drawable.pista3
            ),
            Pista(
                4, "Las Tablas", "Exterior", "Av. del Camino de Santiago, 28, 28050 Madrid", R.drawable.pista4
            )
        )


    }
}
