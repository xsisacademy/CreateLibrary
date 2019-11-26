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

public class FormRegistrasiPenduduk extends AppCompatActivity {
    private Context context = this;

    private EditText namaLengkap, tanggalLahir, tempatLahir;
    private Button lanjutForm2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_registrasi_penduduk);

        //init
        namaLengkap = findViewById(R.id.namaLengkap);
        tanggalLahir = findViewById(R.id.tanggalLahir);
        tempatLahir = findViewById(R.id.tempatLahir);

        lanjutForm2 = findViewById(R.id.lanjutForm2);
        lanjutForm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validasiInput();
            }
        });
    }

    void validasiInput(){
        String nama = namaLengkap.getText().toString().trim();
        String tanggal = tanggalLahir.getText().toString().trim();
        String tempat = tempatLahir.getText().toString().trim();

        if(nama.isEmpty() || tanggal.isEmpty() || tempat.isEmpty()){
            Toast.makeText(context, "Semua inputan wajib diisi!", Toast.LENGTH_SHORT).show();
        }
        else{
            DataModel dataModel = new DataModel();
            dataModel.setNama_lengkap(nama);
            dataModel.setTanggal_lahir(tanggal);
            dataModel.setTempat_lahir(tempat);

            RegistrasiPendudukModel.setRegistrasiPenduduk(dataModel);
            Intent intent = new Intent(context, FormRegistrasi2.class);
            startActivity(intent);

            Stack.formRegistrasiPenduduk = this;
        }
    }

    @Override
    public void onBackPressed() {
        //always clear data
        DataModel dataModel = new DataModel();
        RegistrasiPendudukModel.setRegistrasiPenduduk(dataModel);

        super.onBackPressed();
    }
}
