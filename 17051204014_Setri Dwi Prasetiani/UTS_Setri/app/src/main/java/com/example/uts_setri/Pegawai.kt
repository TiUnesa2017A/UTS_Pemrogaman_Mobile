package com.example.uts_setri

open class Pegawai {

    private var nip: String? = null
    var nama: String? = null
    private var alamat: String? = null



    constructor() {}
    constructor(nip: String?, nama: String?, alamat: String?) {
        this.nip = nip
        this.nama = nama
        this.alamat = alamat
    }
    open val gaji: Int
        get() = 1500000
}