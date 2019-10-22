package com.example.intent2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras
        val nim = bundle?.get("nim")
        val nama = bundle?.get("nama")
        val nilai = bundle?.get("nilai")
        val keterangan = bundle?.get("Keterangan")
        nim2.text=nim.toString()
        nama2.text=nama.toString()
        nilai2.text=nilai.toString()
        keterangan2.text=keterangan.toString()
    }
}
