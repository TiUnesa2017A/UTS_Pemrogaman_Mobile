package com.example.a17051204022_pegawai

/**
 *
 * @author 17051204022_putri
 */
class DaftarGaji(jumlah_pegawai: Int) {

    private lateinit var listPegawai: Array<pegawai>
    private var jumlahPegawaiSekarang = 0

    fun DaftarGaji(jumlah_pegawai: Int) {
        listPegawai = array(jumlah_pegawai)
    }

    private fun array(jumlahPegawai: Int): Array<pegawai> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun addPegawai(p: pegawai) {
        listPegawai[jumlahPegawaiSekarang] = p
        jumlahPegawaiSekarang++
    }

    fun printSemuaGaji() {
        for (i in 0 until jumlahPegawaiSekarang) {
            System.out.print(listPegawai[i].getNama() + " mendapatkan gaji ")
            System.out.println(listPegawai[i].getGaji())
        }
    }
}