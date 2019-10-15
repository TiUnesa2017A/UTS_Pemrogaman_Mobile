package com.example.uts

class DaftarGaji (){
    lateinit var listPegawai: Array<Pegawai>
    lateinit var jumlahPegawaiSekarang = 0

    fun DaftarGaji(jumlah_pegawai: Int) {
        listPegawai = arrayOfNulls(size = jumlah_pegawai)
    }

    fun addPegawai(p: Pegawai) {
        listPegawai[jumlahPegawaiSekarang] = p
        jumlahPegawaiSekarang++
    }

    fun printSemuaGaji() {
        for (i in 0 until jumlahPegawaiSekarang) {
            print(listPegawai[i].Name() + " mendapatkan gaji ")
            System.out.println(listPegawai[i].Pegawai())
        }
    }

}