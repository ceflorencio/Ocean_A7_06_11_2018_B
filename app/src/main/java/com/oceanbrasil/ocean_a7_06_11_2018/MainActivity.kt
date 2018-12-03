package com.oceanbrasil.ocean_a7_06_11_2018

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.oceanbrasil.ocean_a7_06_11_2018.db.DatabaseManager
import com.oceanbrasil.ocean_a7_06_11_2018.db.Posicao
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val db = DatabaseManager.getInstancia(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val posicao = Posicao(10.0, 11.0,"06/11/2018 - 20h57")

        db.criarPosicao(posicao)

        val posicoes = db.obterPosicoes()

        textView.text = ""

        posicoes.forEach{

            textView.append("${it.id}\n")

        }
    }
}
