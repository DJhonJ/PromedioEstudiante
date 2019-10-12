package com.example.promedioestudiante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.buttonPromedio.setOnClickListener {

            if(!this.editTextMate.text.isEmpty() && !this.editTextIng.text.isEmpty() && !this.editTextQui.text.isEmpty()) {
                calcularPromedio(parseo(this.editTextMate.text.toString()), parseo(this.editTextIng.text.toString()),
                    parseo(this.editTextQui.text.toString()))
            }else {
                Toast.makeText(this, "Llenar los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun calcularPromedio(txt1: Int, txt2 : Int, txt3: Int){
        var promedio = ((txt1 + txt2 + txt3) / 3)

        if (promedio >= 6) {
            Toast.makeText(this, "El alumno aprobo. Promedio ${promedio}", Toast.LENGTH_LONG).show()
        }else {
            Toast.makeText(this, "El alumno reprobo. Promedio ${promedio}", Toast.LENGTH_LONG).show()
        }
    }

    fun parseo(variable: String) : Int = Integer.parseInt(variable)
}
