package com.example.gajiuts

fun main(srgs: Array<String>) {

        val s1 = Staf()
        s1.setNama("Rofi")
        s1.setKehadiran(20)

        val d1 = Dosen()
        d1.setNama("Dina")
        d1.setSKS(12)

        val p1 = Pegawai()
        p1.setNama("Farras")

        val daftar_gaji = DaftarGaji(3)
        daftar_gaji.addPegawai(s1)
        daftar_gaji.addPegawai(d1)
        daftar_gaji.addPegawai(p1)
        daftar_gaji.printSemuaGaji()
    }