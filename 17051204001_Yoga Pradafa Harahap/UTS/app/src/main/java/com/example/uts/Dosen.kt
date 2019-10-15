package com.example.uts

class Dosen {
    var jumlahSKS: Int = 0
    val TARIF_SKS = 120000



    fun Dosen(nip: String, nama: String, alamat: String) {
        super.toString()
        super.toString()
        super.toString()


    }

    fun setSKS(SKS: Int) {
        this.jumlahSKS = SKS
    }

    fun Gaji(gaji : Int): Int {
        val total_gaji = jumlahSKS * TARIF_SKS
        return total_gaji + super.Gaji()
    }
}