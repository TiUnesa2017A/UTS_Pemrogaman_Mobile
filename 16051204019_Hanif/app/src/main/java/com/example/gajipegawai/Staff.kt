package com.example.gajipegawai

val Any.gaji: Byte
    get() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

class Staff {

        private var jumlah_kehadiran: Int = 0
        private val TARIF_HARIAN = 50000

        val gaji: Int
            get() {
                val total_gaji = jumlah_kehadiran * TARIF_HARIAN
                return total_gaji + gaji
            }

        constructor() {

        }

    fun setKehadiran(jumlah_kehadiran: Int) {
            this.jumlah_kehadiran = jumlah_kehadiran
        }

    fun setNama(s: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

private fun Any.getgaji(): Byte {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}
