package com.example.uts

class staf: pegawai() {
    var jml_kehadiran: Int = 0

    fun staf(){

    }

    fun staf(nip: String, nama: String, alamat: String){
        super.pegawai(nip,nama,alamat)
    }

    fun setKehadiran(jml_kehadiran: Int){
        this.jml_kehadiran = jml_kehadiran
    }

    override fun getGaji(): Int {
        val total_gaji = jml_kehadiran*50000
        return total_gaji+super.getGaji()
    }
}