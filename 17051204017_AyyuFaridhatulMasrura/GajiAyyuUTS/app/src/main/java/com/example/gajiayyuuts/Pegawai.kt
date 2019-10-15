package com.example.gajiayyuuts

open class Pegawai {

    private lateinit var alamat: String
    private lateinit var nama: String
    private lateinit var nip: String

    fun Pegawai(nip: String, nama: String, alamat: String) {
        this.nip = nip
        this.nama = nama
        this.alamat = alamat
    }
    fun setNama(nama: String) {
        this.nama = nama
    }
    fun getNama(): String {
        return this.nama
    }
    open fun getGaji(): Int {
        return 1500000
    }
}