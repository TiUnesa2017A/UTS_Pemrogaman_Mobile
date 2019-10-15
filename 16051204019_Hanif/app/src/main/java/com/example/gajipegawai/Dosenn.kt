package com.example.gajipegawai

class Dosenn {

    val setNama: Unit = Unit
    private var jumlahSKS: Int = 0

    fun Dosen(nip: String, nama: String, alamat: String) {
        this(nip, nama, alamat)
    }

    private operator fun invoke(nip: String, nama: String, alamat: String) {


    }

    fun setSKS(SKS: Int) {
        this.jumlahSKS = SKS
    }

    fun getGaji(): Int {
        var TARIF_SKS = 120000
        val total_gaji = jumlahSKS * TARIF_SKS
        return total_gaji + getGaji()
    }
}

private fun Any.getGaji(): Byte {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}
