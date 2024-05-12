package com.ankagroup.otelinibul

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Anasayfa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.anasayfa)

        //Anasayfadaki Profil kısmını açan kod
        val buttonAnaProfil = findViewById<ImageButton>(R.id.imageButtonProfil)
        buttonAnaProfil.setOnClickListener {
            val intent = Intent(this, Profil::class.java)
            startActivity(intent)
        }
        //Ansayfadaki favoriler kısmını açan kod
        val buttonAnaFavori = findViewById<ImageButton>(R.id.imageButtonFavori)
        buttonAnaFavori.setOnClickListener {
            val intent = Intent(this, Favoriler::class.java)
            startActivity(intent)
        }
        //ana sayfasından Seyahatler kısmını açan kod
        val buttonAnaSeyah = findViewById<ImageButton>(R.id.imageButtonSeyahatler)
        buttonAnaSeyah.setOnClickListener {
            val intent = Intent(this, Seyahatler::class.java)
            startActivity(intent)
        }
        //ana sayfasından Arama kısmını açan kod
        val buttonAnaAra = findViewById<ImageButton>(R.id.imageButtonArama)
        buttonAnaAra.setOnClickListener {
            val intent = Intent(this, OtelArama::class.java)
            startActivity(intent)
        }
    }
}