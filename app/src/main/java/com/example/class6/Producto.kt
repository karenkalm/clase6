package com.example.class6

import java.io.Serializable

data class Producto(
    val id: Int,
    val nombre: String,
    val precio: Double,
    val categoria: String,
    val descripcion: String,
    val imagenResource: Int,
    val estrellas: Float = 4.0f
) : Serializable