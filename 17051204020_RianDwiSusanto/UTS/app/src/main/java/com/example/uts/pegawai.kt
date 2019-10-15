package com.example.uts

open class pegawai {
    private lateinit var nip: String
    private lateinit var nama: String
    private lateinit var alamat: String

    fun pegawai(){

    }

    fun pegawai(nip: String, nama: String, alamat: String){
        this.nip = nip
        this.nama = nama
        this.alamat = alamat
    }

    fun setNm(nama: String){
        this.nama = nama
    }

    fun getNm(): String{
        return this.nama
    }

    open fun getGaji(): Int{
        return 1500000
    }

}