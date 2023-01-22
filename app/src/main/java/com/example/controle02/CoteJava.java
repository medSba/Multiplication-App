package com.example.controle02;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CoteJava extends AppCompatActivity {
    Button btn_reinitializer,btn_quitter,btn_afficher;
    EditText Number;

    Button colorW,colorP,colorPu;

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cote_xml);
        btn_reinitializer = findViewById(R.id.btn_rn);
        btn_quitter = findViewById(R.id.btn_qtt);
        Number = findViewById(R.id.number);
        tv1 = findViewById(R.id.tv);
        btn_afficher=findViewById(R.id.btn_aff);

        colorW=findViewById(R.id.btn_w);
        colorP=findViewById(R.id.btn_p);
        colorPu=findViewById(R.id.btn_pu);

        btn_reinitializer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number.setText(null);
                tv1.setText("? * 1 =?\n ? * 2 =?\n ? * 3 =?\n ? * 4 =?\n ? * 5 =?\n ? * 6 =?\n ? * 7 =?\n ? * 8 =?\n ? * 9 =?\n ? * 10 =?");
            }
        });

        btn_quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });

        Toast toast;
        toast=Toast.makeText(CoteJava.this,"veuillez saisir un entier !!",Toast.LENGTH_SHORT);

        btn_afficher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {


                    int Number1 = Integer.parseInt(Number.getText().toString());
                    String sh="";
                    for (int i=1;i<=10;i++) {
                        int re= Number1*i;
                        sh+=String.format(" %d*%d=%d \n",Number1,i,re);
                        re=0;

                    }
                    tv1.setText(sh);



                }catch (NumberFormatException e){
                    btn_reinitializer.callOnClick();

                    toast.show();
                }

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