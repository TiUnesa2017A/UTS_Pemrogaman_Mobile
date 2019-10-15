package com.example.asus.uts_17051204049

class DaftarGaji {
    lateinit var listPegawai: Array<Pegawai>
    private var jumlahPegawaiSekarang = 0

    fun DaftarGaji(jumlah_pegawai: Int){
        listPegawai = arrayOfNulls( jumlah_pegawai)
    }

    fun addPegawai(p: Pegawai) {
        listPegawai[jumlahPegawaiSekarang] = p
        jumlahPegawaiSekarang++
    }

    fun printSemuaGaji() {
        for (i in 0 until jumlahPegawaiSekarang) {
            print(listPegawai[i].getNama().toString() + " mendapatkan gaji ")
            println(listPegawai[i].getGaji())
        }
    }
}