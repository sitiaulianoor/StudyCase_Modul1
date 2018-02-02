package com.example.awl.sitiaulia_1202151364_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    TextView jumlah;
    TextView tempat;
    TextView menu;
    TextView harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String tJumlah = intent.getStringExtra("jumlah");
        String tTempat = intent.getStringExtra("tempat");
        String tMenu = intent.getStringExtra("menu");
        String tHarga = intent.getStringExtra("harga");
        int jmlHarga = Integer.valueOf(tHarga)*Integer.valueOf(tJumlah);

        jumlah = (TextView) findViewById(R.id.etPorsi);
        jumlah.setText(tJumlah);
        tempat = (TextView) findViewById(R.id.etTempat);
        tempat.setText(tTempat);
        menu = (TextView) findViewById(R.id.etMenu);
        menu.setText(tMenu);


        harga = (TextView) findViewById(R.id.etHarga);
        harga.setText(String.valueOf(jmlHarga));


        if (jmlHarga > 65000) {
            Toast toast = Toast.makeText(this, "Jangan Disini Makan Malamnya!! Uang Kamu Tidak Cukup", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG);
            toast.show();
        }

    }
}