package com.example.uts

class Pegawai() {
    var nip : String = ""
    var nama  : String = ""
    var alamat : String = ""


    fun Pegawai(nip : String, nama : String, alamat : String) {
        this.nip = nip
        this.nama = nama
        this.alamat = alamat
    }

    fun Name(nama : String){
        this.nama = nama
    }

    fun Namenambah(nama : String){
        this.nama
    }

    fun Gaji(gaji : Int): Int {
        return 1500000
    }

}