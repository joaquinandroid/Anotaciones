package com.example.anotaciones

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.anotaciones.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nosotros1 = binding.btn1Nosotros
        val nosotros2 = binding.btn2Nosotros
        val nosotros3 = binding.btn3Nosotros
        val ellos1 = binding.btn1Ellos
        val ellos2 = binding.btn2Ellos
        val ellos3 = binding.btn3Ellos
        val salir = binding.btnSalir

        nosotros1.setOnClickListener {
            sumarPuntosNosotros(1)
        }
        nosotros2.setOnClickListener {
            sumarPuntosNosotros(2)
        }
        nosotros3.setOnClickListener {
            sumarPuntosNosotros(3)
        }

        ellos1.setOnClickListener {
            sumarPuntosEllos(1)
        }
        ellos2.setOnClickListener {
            sumarPuntosEllos(2)
        }
        ellos3.setOnClickListener {
            sumarPuntosEllos(3)
        }

        salir.setOnClickListener {
            finish()
        }

    }

    fun sumarPuntosNosotros(int: Int){
        var puntosAcumulados = binding.txtVNosotrosTotal.text.toString().toInt()
        puntosAcumulados += int
        binding.txtVNosotrosTotal.text = puntosAcumulados.toString()
    }

    fun sumarPuntosEllos(int: Int){
        var ptosAcumulados = binding.txtVEllosTotal.text.toString().toInt()
        ptosAcumulados += int
        binding.txtVEllosTotal.text = ptosAcumulados.toString()
    }
}