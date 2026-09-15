package com.example.class6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.class6.databinding.ItemProductBinding
import java.util.Locale

class ProductAdapter(
    private val products: List<Producto>,
    private val onItemClick: (Producto) -> Unit
) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    class ProductViewHolder(val binding: ItemProductBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = products[position]
        holder.binding.apply {
            ivProduct.setImageResource(product.imagenResource)
            tvTitle.text = product.nombre
            tvCategory.text = product.categoria
            tvPrice.text = String.format(Locale.US, "$%.2f", product.precio)
            tvStars.text = "★ ${product.estrellas}"
            
            root.setOnClickListener { onItemClick(product) }
        }
    }

    override fun getItemCount() = products.size
}