package com.example.a17051204018_arizkaluthfi_uts

open class Pegawai
{

    private var nip: String? = null
    var nama: String? = null
    private var alamat: String? = null

    constructor() {}
    constructor(nip: String?, nama: String?, alamat: String?)
    {
        this.nip = nip
        this.nama = nama
        this.alamat = alamat
    }
    open val gaji: Int
        get() = 1500000
}