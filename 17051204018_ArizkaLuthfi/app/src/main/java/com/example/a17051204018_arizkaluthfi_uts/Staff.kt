package com.example.a17051204018_arizkaluthfi_uts

class Staf : Pegawai
{
    private var jumlah_kehadiran = 0
    private val TARIF_HARIAN = 50000

    constructor() {}
    constructor(nip: String?, nama: String?, alamat: String?) : super(
        nip,
        nama,
        alamat
    ) {
    }

    fun setKehadiran(jumlah_kehadiran: Int)
    {
        this.jumlah_kehadiran = jumlah_kehadiran
    }

    override val gaji: Int
        get()
        {
            val total_gaji = jumlah_kehadiran * TARIF_HARIAN
            return total_gaji + super.gaji
        }
}