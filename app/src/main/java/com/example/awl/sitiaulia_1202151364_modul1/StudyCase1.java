package com.example.awl.sitiaulia_1202151364_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class StudyCase1 extends AppCompatActivity {

    EditText jumlah;
    EditText menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_case1);
    }

    public void eatbus(View view) {
        Intent intent = new Intent(this, Activity2.class);
        menu = (EditText) findViewById(R.id.edNama);
        String namaMenu = menu.getText().toString();
        jumlah = (EditText) findViewById(R.id.edJumlah);
        String jml = jumlah.getText().toString();
        intent.putExtra("tempat", "Eatbus");
        intent.putExtra("menu", namaMenu);
        intent.putExtra("jumlah", jml);
        intent.putExtra("harga", "50000");
        startActivity(intent);
    }


    public void abnormal(View view) {
        Intent intent = new Intent(this, Activity2.class);
        menu = (EditText) findViewById(R.id.edNama);
        String namaMenu = menu.getText().toString();
        jumlah = (EditText) findViewById(R.id.edJumlah);
        String jml = jumlah.getText().toString();
        intent.putExtra("tempat","Abnormal");
        intent.putExtra("menu",namaMenu);
        intent.putExtra("jumlah",jml);
        intent.putExtra("harga","30000");
        startActivity(intent);

    }
}
