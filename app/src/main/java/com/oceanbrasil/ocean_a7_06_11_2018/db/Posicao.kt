package com.oceanbrasil.ocean_a7_06_11_2018.db

data class Posicao(var id: Int,
                   val latitude: Double,
                   val longitude: Double,
                   val dataHora : String) {


    constructor(latitude: Double,
                longitude: Double,
                dataHora: String) : this(0, latitude, longitude, dataHora)



}