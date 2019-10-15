package com.example.gajipegawai

class Dosen : Pegawai {
    private var jumlahSKS = 0
    private val TARIF_SKS = 120000

    constructor() {}
    constructor(nip: String?, nama: String?, alamat: String?) : super(
        nip,
        nama,
        alamat
    ) {
    }

    fun setSKS(SKS: Int) {
        jumlahSKS = SKS
    }

    override val gaji: Int
        get() {
            val total_gaji = jumlahSKS * TARIF_SKS
            return total_gaji + super.gaji
        }
}