package com.example.uts_setri

object ProgramUtama {

    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {

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