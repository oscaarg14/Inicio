package com.unitec.inicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //vamos a quitar la barrita superior que se llama actionBar
        supportActionBar?.hide()

//invocamos al boton  por medio de su id

        ingresar.setOnClickListener{
            //Aqui adentro generamos la navegación
            var i= Intent(this, LoginActivity::class.java)
            startActivity(i)

        }
    }
}
