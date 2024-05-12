package com.ankagroup.otelinibul

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class OtelArama : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.otel_arama)

        val buttonKayıt = findViewById<Button>(R.id.buttonRezOl)
        buttonKayıt.setOnClickListener {
            val intent = Intent(this, OtelSec::class.java)
            startActivity(intent)
        }
    }
}