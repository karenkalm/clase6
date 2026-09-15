package com.example.class6

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.class6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.rvProducts.apply {
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            adapter = ProductAdapter(DataRepository.productos) { product ->
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("PRODUCTO", product)
                startActivity(intent)
            }
        }
    }
}