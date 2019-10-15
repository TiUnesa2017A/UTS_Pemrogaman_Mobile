package com.example.a17051204037_gajipegawai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


 */
object ProgramUtama {

    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {

        val s1 = staf()
        s1.setNama("tazki")
        s1.setKehadiran(20)

        val d1 = dosen()
        d1.setNama("siska")
        d1.setSKS(12)

        val p1 = pegawai()
        p1.setNama("hanif")

        val daftar_gaji = DaftarGaji(3)
        daftar_gaji.addPegawai(s1)
        daftar_gaji.addPegawai(d1)
        daftar_gaji.addPegawai(p1)
        daftar_gaji.printSemuaGaji()
    }
}