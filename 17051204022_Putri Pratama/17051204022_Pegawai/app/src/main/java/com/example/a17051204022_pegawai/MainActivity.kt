package com.example.a17051204022_pegawai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 *
 * @author putri_17051204022
 */
object ProgramUtama {

    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {

        val s1 = staf()
        s1.setNama("liza")
        s1.setKehadiran(20)

        val d1 = dosen()
        d1.setNama("sinta")
        d1.setSKS(12)

        val p1 = pegawai()
        p1.setNama("wahyu")

        val daftar_gaji = DaftarGaji(3)
        daftar_gaji.addPegawai(s1)
        daftar_gaji.addPegawai(d1)
        daftar_gaji.addPegawai(p1)
        daftar_gaji.printSemuaGaji()
    }
}