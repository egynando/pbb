package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {

    private Button btn_keliling, btn_luas;
    private EditText txt_alas, txt_tinggi;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        txt_alas = (EditText) findViewById(R.id.txt_alas);
        txt_tinggi = (EditText) findViewById(R.id.txt_tinggi);
        btn_keliling = (Button) findViewById(R.id.btn_keliling);
        btn_luas = (Button) findViewById(R.id.btn_luas);
        hasil = (TextView) findViewById(R.id.hasil);
    }

    public void hitungKeliling(View view) {
        try {
            int alas = Integer.parseInt(txt_alas.getText().toString());
            int keliling = alas + alas + alas;
            hasil.setText(String.valueOf(keliling));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void hitungLuas(View view) {
        try {
            int alas = Integer.parseInt(txt_alas.getText().toString());
            int tinggi = Integer.parseInt(txt_tinggi.getText().toString());
            int luas = (alas * tinggi) / 2;
            hasil.setText(String.valueOf(luas));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void Menu(View view) {
        Intent intent = new Intent(Segitiga.this,MainActivity.class);
        startActivity(intent);
    }
}