package com.ore.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Context context = this;

    private Button buttonRegister;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init
        buttonRegister = findViewById(R.id.buttonRegister);
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                panggilFormRegistrasi();
            }
        });

        result = findViewById(R.id.result);
    }

    void panggilFormRegistrasi(){
//        Intent intent = new Intent(context, FormRegistrasiPenduduk);
    }
}
