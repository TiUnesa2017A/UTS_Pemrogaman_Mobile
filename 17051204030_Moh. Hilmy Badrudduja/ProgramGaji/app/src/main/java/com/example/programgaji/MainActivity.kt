package com.example.programgaji

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    internal var gajiST:Int = 0
    internal var gajiTmbh:Int = 0
    lateinit var p1: RadioButton
    lateinit var p2:RadioButton
    lateinit var p3:RadioButton
    lateinit var p4:RadioButton
    lateinit var JamKerja: RadioGroup
    lateinit var hitung: Button
    lateinit var jeke: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun hitung(v: View) {
        val nama = findViewById(R.id.nama) as EditText
        val outputNama = findViewById(R.id.outputNama) as TextView
        val name = nama.getText().toString()
        outputNama.setText("Total Gaji " + name)
        jeke = findViewById(R.id.laki) as CheckBox
        if (jeke.isChecked())
        {
            gajiST = 1500000
        }
        JamKerja = findViewById(R.id.rgGolongan) as RadioGroup
        val p = JamKerja.getCheckedRadioButtonId()
        if (p == R.id.rbGolongan1)
        {
            gajiTmbh = 70000
        }
        else if (p == R.id.rbGolongan2)
        {
            gajiTmbh = 140000
        }
        else if (p == R.id.rbGolongan3)
        {
            gajiTmbh = 210000
        }
        else if (p == R.id.rbGolongan4)
        {
            gajiTmbh = 280000
        }
        val totalGaji = gajiST + gajiTmbh
        val total = findViewById(R.id.outputGaji) as TextView
        total.setText((totalGaji).toString())
    }
}
