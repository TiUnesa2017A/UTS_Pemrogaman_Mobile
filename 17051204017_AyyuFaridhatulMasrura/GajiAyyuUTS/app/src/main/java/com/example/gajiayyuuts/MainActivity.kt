package com.example.gajiayyuuts

class Staf : Pegawai() {

    private var jumlah_kehadiran: Int = 0

    fun Staff(nip: String, nama: String, alamat: String) {
        this(nip, nama, alamat)
    }

    private operator fun invoke(nip: String, nama: String, alamat: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun setKehadiran(jumlah_kehadiran: Int) {
        this.jumlah_kehadiran = jumlah_kehadiran
    }

    override fun getGaji(): Int {
        var TARIF_HARIAN = 50000
        val total_gaji = jumlah_kehadiran * TARIF_HARIAN
        return total_gaji + super.getGaji()
    }
}