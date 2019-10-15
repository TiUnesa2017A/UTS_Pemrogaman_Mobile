package com.example.gajipegawai

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity()


    fun main(args: Array<String>) {
        val s1 = Staf()
        s1.nama = "Putu"
        s1.setKehadiran(20)
        val d1 = Dosen()
        d1.nama = "Dharmadi"
        d1.setSKS(12)
        val p1 = Pegawai()
        p1.nama = "Kadek"
        val daftar_gaji = DaftarGaji(3)
        daftar_gaji.addPegawai(s1)
        daftar_gaji.addPegawai(d1)
        daftar_gaji.addPegawai(p1)
        daftar_gaji.printSemuaGaji()
    }
