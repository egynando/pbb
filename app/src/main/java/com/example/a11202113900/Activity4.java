package com.example.a11202113900;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class Activity4 extends AppCompatActivity {
    EditText ntugas,ptugas;
    EditText nuts,puts;
    EditText nuas,puas;
    EditText na,nh,predik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        ntugas =findViewById(R.id.editTgs);
        ptugas=findViewById(R.id.editPTgs);

        nuts=findViewById(R.id.editUts);
        puts=findViewById(R.id.editPUts);

        nuas=findViewById(R.id.editUas);
        puas=findViewById(R.id.editPUas);

        na=findViewById(R.id.editAkhir);
        nh=findViewById(R.id.editHuruf);
        predik=findViewById(R.id.editPredikat);

        ntugas.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                float nilaitugas,pointugas;
                if(ntugas.getText().toString().isEmpty()){
                    nilaitugas=0;
                }else{
                    nilaitugas=Float.parseFloat(ntugas.getText().toString());
                }
                pointugas= (float) (0.3 * nilaitugas);
                puas.setText(Float.toString(pointugas));

                float tampungpion=pointugas+poinuts+poinuas;
                na.setText(Float.toString(tampungpion));

            }
        });
    }
}