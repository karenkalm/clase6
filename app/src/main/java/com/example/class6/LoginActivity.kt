package com.example.class6

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.class6.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val username = binding.etUsername.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()

            var hasError = false
            if (username.isEmpty()) {
                binding.tilUsername.error = "Campo requerido"
                hasError = true
            } else {
                binding.tilUsername.error = null
            }

            if (password.isEmpty()) {
                binding.tilPassword.error = "Campo requerido"
                hasError = true
            } else {
                binding.tilPassword.error = null
            }

            if (!hasError) {
                val user = DataRepository.usuarios.find { 
                    it.login.equals(username, ignoreCase = true) && it.password == password 
                }
                if (user != null) {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}