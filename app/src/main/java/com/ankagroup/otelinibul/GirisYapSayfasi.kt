package com.ankagroup.otelinibul

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class GirisYapSayfasi : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.giris_yap)

        //Giriş yapma ekranındaki Giriş butonuna basınca Ansayfaya giden kod
        val buttonKayıtol = findViewById<Button>(R.id.button_girAna)
        buttonKayıtol.setOnClickListener {
            val intent = Intent(this, Anasayfa::class.java)
            startActivity(intent)
        }
    }
}
