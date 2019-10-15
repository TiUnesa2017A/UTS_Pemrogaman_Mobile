package com.example.uts

class Staff (){
    var jumlah_kehadiran : Int = 0
    var TARIF_HARIAN : Int = 50000



    fun Staf(String nip, String nama, String alamat) {
        super(nip, nama, alamat)
    }

    fun  Kehadiran(jumlah_kehadiran : Int){
        this.jumlah_kehadiran = jumlah_kehadiran
    }

    @Override
    fun  getGaji(total_gaji : Int){

        var total_gaji = jumlah_kehadiran*TARIF_HARIAN
        return total_gaji+super.Gaji()
    }

}