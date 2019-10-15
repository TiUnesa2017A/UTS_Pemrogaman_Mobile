package com.example.uts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val s1 = Staff()
        s1.setNama("Putu")
        s1.setKehadiran(20)

        val d1 = Dosen()
        d1.setNama("Dharmadi")
        d1.setSKS(12)

        val p1 = Pegawai()
        p1.setNama("Kadek")

        val daftar_gaji = DaftarGaji(3)
        daftar_gaji.addPegawai(s1)
        daftar_gaji.addPegawai(d1)
        daftar_gaji.addPegawai(p1)
        daftar_gaji.printSemuaGaji()
    }

    private fun Pegawai(): Pegawai {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}