package com.example.asus.uts_17051204049

open class Pegawai() {

    lateinit var nip : String
    lateinit var nama : String
    lateinit var alamat: String



    fun Pegawai(nip: String, nama: String, alamat: String) {
        this.nip = nip
        this.nama = nama
        this.alamat = alamat
    }

    fun setNama() {
        this.nama = nama
    }

    fun getNama(nama: String) {
         this.nama
    }

    open fun getGaji(): Int {
        return 1500000
    }


}