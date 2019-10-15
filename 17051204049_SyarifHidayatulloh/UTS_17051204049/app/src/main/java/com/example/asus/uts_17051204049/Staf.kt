package com.example.asus.uts_17051204049

class Staf : Pegawai() {
    private var jumlah_kehadiran: Int = 0
    private var TARIF_HARIAN = 50000

    fun Staf(){

    }

    fun Staf(nip: String, nama: String, alamat: String){
        super.nip
        super.nama
        super.alamat
    }

    fun setKehadiran(jumlah_kehadiran: Int) {
        this.jumlah_kehadiran = jumlah_kehadiran
    }

     override fun getGaji(): Int {
        var total_gaji = jumlah_kehadiran * TARIF_HARIAN
        return total_gaji + super.getGaji()
    }
}