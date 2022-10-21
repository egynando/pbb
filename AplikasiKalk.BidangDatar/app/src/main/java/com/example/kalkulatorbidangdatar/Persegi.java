package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Persegi extends AppCompatActivity {
    private EditText txt_sisi;
    private Button btn_keliling, btn_luas;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        txt_sisi = (EditText) findViewById(R.id.txt_sisi);
        btn_keliling = (Button) findViewById(R.id.btn_keliling);
        btn_luas = (Button) findViewById(R.id.btn_luas);
        hasil = (TextView) findViewById(R.id.hasil);
    }

    public void hitungKeliling(View view) {
        try {
            int sisi = Integer.parseInt(txt_sisi.getText().toString());
            int keliling = 4 * sisi;
            hasil.setText(String.valueOf(keliling));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void hitungLuas(View view) {
        try {
            int sisi = Integer.parseInt(txt_sisi.getText().toString());
            int luas = sisi * sisi;
            hasil.setText(String.valueOf(luas));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void Menu(View view) {
        Intent intent = new Intent(Persegi.this,MainActivity.class);
        startActivity(intent);
    }
}