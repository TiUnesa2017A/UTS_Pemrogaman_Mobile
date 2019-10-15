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
        var nip: String? = null
        var alamat: String? = null

        open val gaji: Int
            get() = 1500000


        fun pegawai(nama: String, nip: String, alamat: String) {
            this.nama = nama
            this.nip = nip
            this.alamat = alamat
        }

    }

    open class Staf : Pegawai() {

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

    class Dosen : Pegawai() {

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

        open fun addPegawai(p: Pegawai) {
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
            s1.nama = "Fahri Satu"
            s1.nip = 17051204029.toString()
            s1.alamat = "Surabaya satu"
            s1.setKehadiran(20)

            val d1 = Dosen()
            d1.nama = "Fahri Dua"
            d1.nip = 17051204029.toString()
            d1.alamat = "Surabaya Dua"
            d1.setSKS(12)

            val p1 = Pegawai()
            p1.nama = "Fahri Tiga"
            p1.nip = 17051204029.toString()
            p1.alamat= "Surabaya Tiga"

            val daftar_gaji = DaftarGaji(2)
            daftar_gaji.addPegawai(s1)
            daftar_gaji.addPegawai(d1)
            daftar_gaji.printSemuaGaji()
        }
    }
}
