package com.ankagroup.otelinibul

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Profil : AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profil)
        //Anasayfadaki favoriler kısmını açan kod
        val buttonAnaFavori = findViewById<ImageButton>(R.id.imageButtonFavori)
        buttonAnaFavori.setOnClickListener {
            val intent = Intent(this, Favoriler::class.java)
            startActivity(intent)
        }
        //Profil Sayfasındaki Sosyal medya butonunun kodları
        val buttonSos = findViewById<Button>(R.id.buttonSosMed)
        buttonSos.setOnClickListener {
            val intent = Intent(this, SosyalMedya::class.java)
            startActivity(intent)
        }

        //Profil Sayfasındaki hakkımızda butonunun kodları
        val buttonHakki = findViewById<Button>(R.id.buttonHak)
        buttonHakki.setOnClickListener {
            val intent = Intent(this, Hakkimizda::class.java)
            startActivity(intent)
        }

    }
}