package com.example.gaji

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    open class Pegawai {

        var nama: String? = null
        open var nip: String? = null
        var alamat: String? = null

        open val gaji: Int
            get() = 1500000


        fun pegawai(nama: String) {
            this.nama = nama
        }

    }

    open class Staf() : Pegawai() {

        private var jumlah_kehadiran: Int = 0
        private val TARIF_HARIAN = 50000

        override val gaji: Int
            get() {
                val total_gaji = jumlah_kehadiran * TARIF_HARIAN
                return total_gaji + super.gaji
            }


        fun setKehadiran(jumlah_kehadiran: Int) {
            this.jumlah_kehadiran = jumlah_kehadiran
        }
    }

    class Dosen() : Pegawai() {

        private var jumlahSKS: Int = 0
        private val TARIF_SKS = 120000

        override val gaji: Int
            get() {
                val total_gaji = jumlahSKS * TARIF_SKS
                return total_gaji + super.gaji
            }


        fun setSKS(SKS: Int) {
            this.jumlahSKS = SKS
        }
    }

    class DaftarGaji(jumlah_pegawai: Int) {

        private val listPegawai: Array<Pegawai>
        private var jumlahPegawaiSekarang = 0

        init {
            listPegawai = arrayOf()
        }

        fun addPegawai(p: Pegawai) {
            listPegawai[jumlahPegawaiSekarang] = p
            jumlahPegawaiSekarang++
        }

        fun printSemuaGaji() {
            for (i in 0 until jumlahPegawaiSekarang) {
                print(listPegawai[i].nama!! + " mendapatkan gaji ")
                println(listPegawai[i].gaji)
            }
        }
    }

    object ProgramUtama {

        /**
         * @param args the command line arguments
         */
        @JvmStatic
        fun main(args: Array<String>) {

            val s1 =  Staf()
            s1.nama = "Agung"
            s1.setKehadiran(15)
            s1.nip="1234"
            s1.alamat="surabaya"

            val s2 =  Staf()
            s2.nama = "Husni Mubarok"
            s2.setKehadiran(16)
            s2.nip="17051204033"
            s2.alamat="surabaya"

            val d1 = Dosen()
            d1.nama = "Jaya"
            s1.nip=="123"
            s1.alamat="surabaya"
            d1.setSKS(16)



            val daftar_gaji = DaftarGaji(3)
            daftar_gaji.printSemuaGaji()
        }
    }
}
