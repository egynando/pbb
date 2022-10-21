package com.example.a11202113900;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity implements View.OnClickListener{

    Button btntambah,btnbagi,btnkali,btnkurang;
    EditText angka1,angka2;
    TextView hasiloperasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        angka1=findViewById(R.id.angka1);
        angka2=findViewById(R.id.angka2);
        hasiloperasi=findViewById(R.id.hasiloperasi);

        btntambah=findViewById(R.id.tbtambah);
        btnkali=findViewById(R.id.tbkali);
        btnbagi=findViewById(R.id.tbbagi);
        btnkurang=findViewById(R.id.tbkurang);

        btntambah.setOnClickListener(this);
        btnkali.setOnClickListener(this);
        btnbagi.setOnClickListener(this);
        btnkurang.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId())
        {
            case R.id.tbtambah:
                tambah();
                break;
            case R.id.tbbagi:
                bagi();
                break;
            case R.id.tbkali:
                kali();
                break;
            case R.id.tbkurang:
                kurang();
                break;
        }
    }

    private void kurang() {
        if (angka1.getText().toString().trim().isEmpty() || angka2.getText().toString().trim().isEmpty())
        {
            Toast.makeText(this, "Data masih ada yang kosong", Toast.LENGTH_SHORT).show();
        } else {
            Float ang1 = Float.parseFloat(String.valueOf(angka1.getText()));
            Float ang2 = Float.parseFloat(String.valueOf(angka2.getText()));

            float hasil = (ang1-ang2);
            hasiloperasi.setText(" " + hasil);
        }
    }
    private void kali() {
        if (angka1.getText().toString().trim().isEmpty() || angka2.getText().toString().trim().isEmpty())
        {
            Toast.makeText(this, "Data masih ada yang kosong", Toast.LENGTH_SHORT).show();
        } else {
            Float ang1 = Float.parseFloat(String.valueOf(angka1.getText()));
            Float ang2 = Float.parseFloat(String.valueOf(angka2.getText()));

            float hasil = (ang1*ang2);
            hasiloperasi.setText(" " + hasil);
        }
    }
    private void bagi() {
        if (angka1.getText().toString().trim().isEmpty() || angka2.getText().toString().trim().isEmpty())
        {
            Toast.makeText(this, "Data masih ada yang kosong", Toast.LENGTH_SHORT).show();
        } else {
            Float ang1 = Float.parseFloat(String.valueOf(angka1.getText()));
            Float ang2 = Float.parseFloat(String.valueOf(angka2.getText()));

            float hasil = (ang1/ang2);
            hasiloperasi.setText(" " + hasil);
        }
    }
    private void tambah() {
        if (angka1.getText().toString().trim().isEmpty() || angka2.getText().toString().trim().isEmpty())
        {
            Toast.makeText(this, "Data masih ada yang kosong", Toast.LENGTH_SHORT).show();
        } else {
            Float ang1 = Float.parseFloat(String.valueOf(angka1.getText()));
            Float ang2 = Float.parseFloat(String.valueOf(angka2.getText()));

            float hasil = (ang1+ang2);
            hasiloperasi.setText(" " + hasil);
        }
    }


}