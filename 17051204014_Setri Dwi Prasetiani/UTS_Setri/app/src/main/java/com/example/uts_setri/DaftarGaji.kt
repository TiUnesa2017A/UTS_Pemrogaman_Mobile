package com.example.uts_setri

class DaftarGaji(jumlah_pegawai: Int) {
    private val listPegawai: Array<Pegawai?>
    private var jumlahPegawaiSekarang = 0
    fun addPegawai(p: Pegawai?) {
        listPegawai[jumlahPegawaiSekarang] = p
        jumlahPegawaiSekarang++
    }

    fun printSemuaGaji() {
        for (i in 0 until jumlahPegawaiSekarang) {
            print(listPegawai[i]!!.nama + " mendapatkan gaji ")
            println(listPegawai[i]!!.gaji)
        }
    }

    init {
        listPegawai = arrayOfNulls<Pegawai?>(jumlah_pegawai)
    }
}