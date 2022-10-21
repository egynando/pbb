package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lingkaran extends AppCompatActivity {
    private Button btn_keliling, btn_luas;
    private EditText txt_jari;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        txt_jari = (EditText) findViewById(R.id.txt_jari);
        btn_keliling = (Button) findViewById(R.id.btn_keliling);
        btn_luas = (Button) findViewById(R.id.btn_luas);
        hasil = (TextView) findViewById(R.id.hasil);
    }

    public void hitungLuas(View view) {
        try{
            int jarijari = Integer.parseInt(txt_jari.getText().toString());
            double phi = 3.14;
            double luas = phi * jarijari * jarijari;
            hasil.setText(String.valueOf(luas));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void hitungKeliling(View view) {
        try {
            int jarijari = Integer.parseInt(txt_jari.getText().toString());
            double phi = 3.14;
            double keliling = phi * 2 * jarijari;
            hasil.setText(String.valueOf(keliling));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void Menu(View view) {
        Intent intent = new Intent(Lingkaran.this,MainActivity.class);
        startActivity(intent);
    }
}