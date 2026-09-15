package com.example.class6

object DataRepository {
    val usuarios = listOf(
        Usuario("Admin", "admin", "1234", "admin@store.com"),
        Usuario("Usuario Prueba", "user", "pass", "user@test.com")
    )

    val productos = listOf(
        Producto(
            1, "iPhone 15 Pro", 999.99, "Celulares",
            "Rendimiento monstruoso gracias al chip A17 Pro, cámara de 48 MP y diseño de titanio.",
            R.drawable.ic_phone, 4.8f
        ),
        Producto(
            2, "MacBook Pro M3", 1999.00, "Computadoras",
            "La laptop más avanzada con el chip M3, pantalla Liquid Retina XDR y hasta 22 horas de batería.",
            R.drawable.ic_laptop, 4.9f
        ),
        Producto(
            3, "Sony WH-1000XM5", 349.50, "Audio",
            "Cancelación de ruido líder en la industria y calidad de sonido excepcional.",
            R.drawable.ic_headphone, 4.7f
        ),
        Producto(
            4, "Galaxy Watch Ultra", 649.00, "Relojes",
            "El smartwatch más resistente para tus aventuras más extremas.",
            R.drawable.ic_watch, 4.6f
        ),
        Producto(
            5, "Canon EOS R5", 3599.00, "Cámaras",
            "Cámara sin espejo de fotograma completo para profesionales del video y la fotografía.",
            R.drawable.ic_camera, 4.8f
        ),
        Producto(
            6, "Nike Air Max 270", 150.00, "Calzado",
            "Comodidad y estilo con la unidad Air más grande de Nike hasta la fecha.",
            R.drawable.ic_shoe, 4.5f
        )
    )
}