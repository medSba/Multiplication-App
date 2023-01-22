package com.example.controle02;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CoteJava extends AppCompatActivity {
    Button btn_reinitializer,btn_quitter;
    EditText Number;
    Button colorW,colorP,colorPu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cote_xml);
        btn_reinitializer = findViewById(R.id.btn_rn);
        btn_quitter = findViewById(R.id.btn_qtt);
        Number = findViewById(R.id.number);

        colorW=findViewById(R.id.btn_w);
        colorP=findViewById(R.id.btn_p);
        colorPu=findViewById(R.id.btn_pu);

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
        colorW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreenColor(Color.WHITE);
            }
        });
        colorP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreenColor(Color.rgb(244,152,173));
            }
        });
        colorPu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreenColor(Color.rgb(255,219,88));
            }
        });


    }
    public void setMyScreenColor(int color){
        View v=this.getWindow().getDecorView();
        v.setBackgroundColor(color);
    }
}