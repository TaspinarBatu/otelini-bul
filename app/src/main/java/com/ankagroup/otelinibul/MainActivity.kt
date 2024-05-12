package com.ankagroup.otelinibul

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Giriş Yapma Ekranına Gönderen Buton
        val buttonGiris = findViewById<Button>(R.id.button_girisYap)
        buttonGiris.setOnClickListener {
            val intent = Intent(this, GirisYapSayfasi::class.java)
            startActivity(intent)
        }
        // Kaydolma Ekranına Gönderen Buton
        val buttonKayıt = findViewById<Button>(R.id.button_kaydol)
        buttonKayıt.setOnClickListener {
            val intent = Intent(this, KaydolmaSayfasi::class.java)
            startActivity(intent)
        }
    }
}