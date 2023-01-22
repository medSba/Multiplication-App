package com.example.controle02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CoteJava extends AppCompatActivity {
    Button btn_reinitializer,btn_quitter;
    EditText Number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cote_xml);
        btn_reinitializer = findViewById(R.id.btn_rn);
        btn_quitter = findViewById(R.id.btn_qtt);
        Number = findViewById(R.id.number);

        btn_reinitializer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number.setText(null);
            }
        });

        btn_quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
    }
}