package com.example.gajipegawai

class DaftarGaji(jumlah_pegawai: Int) {

    private val listPegawai: Array<Pegawai?>
    private var jumlahPegawaiSekarang = 0

    init {
        listPegawai = arrayOfNulls(jumlah_pegawai)
    }

    fun addPegawai(p: Dosenn) {
        listPegawai[jumlahPegawaiSekarang] = Pegawai()
        jumlahPegawaiSekarang++
    }

    private fun Pegawai(): Pegawai {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun printSemuaGaji() {
        for (i in 0 until jumlahPegawaiSekarang) {
            print(listPegawai[i]?.nama!! + " mendapatkan gaji ")
            println(listPegawai[i]?.gaji)
        }
    }
}