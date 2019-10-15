package com.example.uts

import com.example.uts.pegawai as pegawai1

open class daftargaji {
    var listpegawai: Array<pegawai1>
    var jumPegawaisekarang = 0

    init {
        listpegawai = arrayOf()
    }

    fun addPegawai(p: pegawai1){
        listpegawai[jumPegawaisekarang] = p
        jumPegawaisekarang +=1
    }

    fun printSemua(){
        for (i in 0 until jumPegawaisekarang){
            print(listpegawai[i].getNm() +" mendapatkan gaji ")
            println(listpegawai[i].getGaji())
        }
    }
}