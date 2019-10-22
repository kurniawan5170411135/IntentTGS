package com.example.intent2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_proses.setOnClickListener(){
            intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("nim", edtnim.text)
            intent.putExtra("nama", edtnama.text)
            intent.putExtra("nilai", edtnilai.text)
            if (edtnilai.text.toString().toInt()>=80) {
                intent.putExtra("Keterangan", "A")
            }
            else if (edtnilai.text.toString().toInt()>=60) {
                intent.putExtra("Keterangan", "B")
            }
            else if (edtnilai.text.toString().toInt()>=40) {
                intent.putExtra("Keterangan", "C")
            }
            else if (edtnilai.text.toString().toInt()>=20) {
                intent.putExtra("Keterangan", "D")
            }
            else if (edtnilai.text.toString().toInt()>=0) {
                intent.putExtra("Keterangan", "E")
            }
            startActivity(intent)}
    }
}
