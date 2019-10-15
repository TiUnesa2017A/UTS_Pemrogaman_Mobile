package com.example.uts_setri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val s1 = Staf()
        s1.nama = "Setri"
        s1.setKehadiran(20)

        val d1 = Dosen()
        d1.nama = "Denada"
        d1.setSKS(12)

        val p1 = Pegawai()
        p1.nama = "Sunyi"

        val daftar_gaji = DaftarGaji(3)
        daftar_gaji.addPegawai(s1)
        daftar_gaji.addPegawai(d1)
        daftar_gaji.addPegawai(p1)
        daftar_gaji.printSemuaGaji()
    }
}
