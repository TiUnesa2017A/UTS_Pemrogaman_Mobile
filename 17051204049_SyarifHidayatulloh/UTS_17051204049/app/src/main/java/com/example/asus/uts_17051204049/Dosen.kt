package com.example.asus.uts_17051204049

class Dosen : Pegawai(){
    private var jumlahSKS: Int = 0
    private var TARIF_SKS = 120000

    fun Dosen(){

    }

    fun Dosen(nip: String, nama: String, alamat: String) {
        super.nip
        super.nama
        super.alamat
    }

    fun setSKS(SKS: Int) {
        this.jumlahSKS = SKS
    }

    override fun getGaji(): Int {
        val total_gaji = jumlahSKS * TARIF_SKS
        return total_gaji + super.getGaji()
    }
}