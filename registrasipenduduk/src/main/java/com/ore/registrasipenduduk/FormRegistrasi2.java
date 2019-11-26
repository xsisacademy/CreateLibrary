package com.ore.registrasipenduduk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ore.registrasipenduduk.utils.DataModel;
import com.ore.registrasipenduduk.utils.RegistrasiPendudukModel;
import com.ore.registrasipenduduk.utils.Stack;

public class FormRegistrasi2 extends AppCompatActivity {
    private Context context = this;

    private EditText alamat, kelurahan, kecamatan, kotamadya;
    private Button lanjutForm3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_registrasi2);

        //init
        alamat = findViewById(R.id.alamat);
        kelurahan = findViewById(R.id.kelurahan);
        kecamatan = findViewById(R.id.kecamatan);
        kotamadya = findViewById(R.id.kotamadya);

        lanjutForm3 = findViewById(R.id.lanjutForm3);
        lanjutForm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validasiInput();
            }
        });
    }

    void validasiInput(){
        String alamatVal = alamat.getText().toString().trim();
        String kelurahanVal = kelurahan.getText().toString().trim();
        String kecamatanVal = kecamatan.getText().toString().trim();
        String kotamadyaVal = kotamadya.getText().toString().trim();

        if(alamatVal.isEmpty() || kelurahanVal.isEmpty() || kecamatanVal.isEmpty() || kotamadyaVal.isEmpty()){
            Toast.makeText(context, "Semua inputan wajib diisi!", Toast.LENGTH_SHORT).show();
        }
        else{
            DataModel dataModel = RegistrasiPendudukModel.getRegistrasiPenduduk();
            dataModel.setAlamat(alamatVal);
            dataModel.setKelurahan(kelurahanVal);
            dataModel.setKecamatan(kecamatanVal);
            dataModel.setKotamadya(kotamadyaVal);

            RegistrasiPendudukModel.setRegistrasiPenduduk(dataModel);
            Intent intent = new Intent(context, FormRegistrasi3.class);
            startActivity(intent);

            Stack.formRegistrasi2 = this;
        }
    }
}
