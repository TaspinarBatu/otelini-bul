package com.ankagroup.otelinibul

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class KaydolmaSayfasi : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kaydol)

        //Giriş yapma ekranındaki Giriş butonuna basınca Ansayfaya giden kod
        val buttonKayıt = findViewById<Button>(R.id.buttonUygKay)
        buttonKayıt.setOnClickListener {
            val intent = Intent(this, Anasayfa::class.java)
            startActivity(intent)
        }
    }
}