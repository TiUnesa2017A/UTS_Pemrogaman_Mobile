package com.example.gajipegawai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        class MainActivity : AppCompatActivity() {


            fun main(args: Array<String>) {
                val s1 = Staf()
                s1.nama = "Siska"
                s1.setKehadiran(20)
                val d1 = Dosen()
                d1.nama = "dan"
                d1.setSKS(12)
                val p1 = Pegawai()
                p1.nama = "Rifa"
                val daftar_gaji = DaftarGaji(3)
                daftar_gaji.addPegawai(s1)
                daftar_gaji.addPegawai(d1)
                daftar_gaji.addPegawai(p1)
                daftar_gaji.printSemuaGaji()
            }
        }


    }
}
