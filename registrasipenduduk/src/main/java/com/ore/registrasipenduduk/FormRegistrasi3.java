package com.ore.registrasipenduduk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ore.registrasipenduduk.utils.Constants;
import com.ore.registrasipenduduk.utils.RegistrasiPendudukModel;
import com.ore.registrasipenduduk.utils.Stack;

public class FormRegistrasi3 extends AppCompatActivity {
    private Context context = this;

    private Button registerSekarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_registrasi3);

        //init
        registerSekarang = findViewById(R.id.registerSekarang);
        registerSekarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selesaiProsesRegistrasi();
            }
        });
    }

    void selesaiProsesRegistrasi(){
        Stack.formRegistrasiPenduduk.finish();
        Stack.formRegistrasi2.finish();

        Intent result = new Intent();
//        result.putExtra(EXTRA_TITLE, title);
//        result.putExtra(EXTRA_DESCRIPTION, description);
//        result.putExtra(EXTRA_PRIORITY, priority);
        //tidak gunakan extra tapi panggil modelnya saja


        setResult(RESULT_OK, result);

        finish();
    }

}
