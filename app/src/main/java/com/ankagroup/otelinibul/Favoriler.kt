package com.ankagroup.otelinibul

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Favoriler : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.favoriler)
        //favoriler sayfasından profil kısmını açan kod
        val buttonAnaFavori = findViewById<ImageButton>(R.id.imageButtonProfil)
        buttonAnaFavori.setOnClickListener {
            val intent = Intent(this, Profil::class.java)
            startActivity(intent)
        }
    }
}