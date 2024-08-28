package com.example.practica3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Referencias a los elementos de la interfaz
        val editTextUser = findViewById<EditText>(R.id.editTextText)
        val editTextPassword = findViewById<EditText>(R.id.editTextText2)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        // Configuración del click listener para el botón de login
        btnLogin.setOnClickListener {
            val username = editTextUser.text.toString()
            val password = editTextPassword.text.toString()

            // Aquí puedes agregar lógica adicional para validar el usuario y la contraseña

            // Muestra un mensaje de bienvenida
            Toast.makeText(this, "Bienvenido, $username", Toast.LENGTH_SHORT).show()
    }
}

}