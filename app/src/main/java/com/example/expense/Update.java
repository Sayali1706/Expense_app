package com.example.expense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Update extends AppCompatActivity {

    EditText updpp;
    EditText updsp;
    EditText updbh;
    EditText updrag;
    EditText updspdp;
    Button updateb;


    public static int panipuri_upd;
    public static int shev_upd;
    public static int bhel_upd;
    public static int ragda_upd;
    public static int spdp_upd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        updpp = findViewById(R.id.upd_pp);
        updsp = findViewById(R.id.upd_sp);
        updbh = findViewById(R.id.upd_bh);
        updrag = findViewById(R.id.upd_rag);
        updspdp = findViewById(R.id.upd_spdp);
        updateb = findViewById(R.id.upd);



        updateb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                panipuri_upd = Integer.parseInt(updpp.getText().toString());
                shev_upd = Integer.parseInt(updsp.getText().toString());
                bhel_upd = Integer.parseInt(updbh.getText().toString());
                ragda_upd = Integer.parseInt(updrag.getText().toString());
                spdp_upd = Integer.parseInt(updspdp.getText().toString());

                Toast.makeText(Update.this, "Cost Updated", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public static int getmyint1(){
        return panipuri_upd;

    }
    public static int getmyint2() {
        return shev_upd;
    }
    public static int getmyint3() {
        return bhel_upd;
    }
    public static int getmyint4() {
        return ragda_upd;
    }
    public static int getmyint5() {
        return spdp_upd;
    }



}



