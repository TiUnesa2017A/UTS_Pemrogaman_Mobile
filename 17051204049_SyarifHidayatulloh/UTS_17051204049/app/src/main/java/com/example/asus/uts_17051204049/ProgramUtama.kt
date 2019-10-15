package com.example.asus.uts_17051204049

class ProgramUtama {
    @JvmStatic
    fun main(args: Array<String>) {

        var s1 = Staf()
        s1.setNama("Putu")
        s1.setKehadiran(20)

        var d1 = Dosen()
        d1.setNama("Dharmadi")
        d1.setSKS(12)

        var p1 = Pegawai()
        p1.setNama("Kadek")

        var daftar_gaji = DaftarGaji(3)
        daftar_gaji.addPegawai(s1)
        daftar_gaji.addPegawai(d1)
        daftar_gaji.addPegawai(p1)
        daftar_gaji.printSemuaGaji()
    }
}