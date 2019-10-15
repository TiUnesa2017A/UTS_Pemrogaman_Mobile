package com.example.a17051204037_gajipegawai

/**
 *
 *
 */
class dosen : pegawai(){

    private var jumlahSKS: Int = 0

    fun Dosen(nip: String, nama: String, alamat: String) {
        this(nip, nama, alamat)
    }

    private operator fun invoke(nip: String, nama: String, alamat: String) {


    }

    fun setSKS(SKS: Int) {
        this.jumlahSKS = SKS
    }

    override fun getGaji(): Int {
        var TARIF_SKS = 120000
        val total_gaji = jumlahSKS * TARIF_SKS
        return total_gaji + super.getGaji()
    }
}