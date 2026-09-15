package com.example.class6

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.class6.databinding.ActivityDetailBinding
import java.util.Locale

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private var quantity = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val product = intent.getSerializableExtra("PRODUCTO") as? Producto
        if (product != null) {
            setupUI(product)
        }

        binding.btnPlus.setOnClickListener {
            quantity++
            binding.tvQuantity.text = quantity.toString()
        }

        binding.btnMinus.setOnClickListener {
            if (quantity > 1) {
                quantity--
                binding.tvQuantity.text = quantity.toString()
            }
        }

        binding.btnAddToCart.setOnClickListener {
            Toast.makeText(this, "${product?.nombre} agregado al carrito", Toast.LENGTH_SHORT).show()
        }

        binding.btnBack.setOnClickListener {
            finish()
        }
    }

    private fun setupUI(product: Producto) {
        binding.apply {
            ivProductDetail.setImageResource(product.imagenResource)
            tvTitleDetail.text = product.nombre
            tvCategoryDetail.text = product.categoria
            tvPriceDetail.text = String.format(Locale.US, "$%.2f MXN", product.precio)
            tvStarsDetail.text = "★ ${product.estrellas}"
            tvDescriptionDetail.text = product.descripcion
        }
    }
}