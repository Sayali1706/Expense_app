package com.example.expense;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Table extends AppCompatActivity {
    DbManager db;
    private TextView totcost1;
    private TextView totcost2;
    private TextView totcost3;
    private TextView totcost4;
    private TextView totcost5;
    private TextView total;

    private Button submit;
    public int getpp;
    public int getsp;
    public int getbp;
    public int getrp;
    public int getdp;
    public int cost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        Intent intent=getIntent();
        getpp=intent.getIntExtra("PANIP",0);
        totcost1 = findViewById(R.id.tot_panipuri);
        getpp=getpp*Update.panipuri_upd;
        totcost1.setText(Integer.toString(getpp));

        getsp=intent.getIntExtra("SHEVP",0);
        totcost2 = findViewById(R.id.tot_shevpuri);
        getsp=getsp*Update.shev_upd;
        totcost2.setText(Integer.toString(getsp));

        getbp=intent.getIntExtra("BHELP",0);
        totcost3 = findViewById(R.id.tot_bhel);
        getbp=getbp*Update.bhel_upd;
        totcost3.setText(Integer.toString(getbp));

        getrp=intent.getIntExtra("RAGDAP",0);
        totcost4 = findViewById(R.id.tot_ragda);
        getrp=getrp*Update.ragda_upd;
        totcost4.setText(Integer.toString(getrp));

        getdp=intent.getIntExtra("DAHIP",0);
        totcost5 = findViewById(R.id.tot_spdp);
        getdp=getdp*Update.spdp_upd;
        totcost5.setText(Integer.toString(getdp));






        db = new DbManager(this);
        total=findViewById(R.id.total);
        submit=findViewById(R.id.show_val);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cost=(getsp+getpp+getbp+getrp+getdp);
                total.setText(Integer.toString(cost));

            }
        });

      //  viewAll();
    }
/*
    public void viewAll(){
        show.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Cursor res = db.getAllData();
                        if (res.getCount() == 0) {
                            showMessage("error", "nothing found");
                            return;
                        }
                        StringBuffer buffer = new StringBuffer();
                        int i = 0;
                        while (res.moveToNext()) {
                            // buffer.append("Id"+res.getString(0)+"\n");

                            buffer.append(res.getString(0) + "\n");
                           buffer.append("Scost"+res.getString(1)+"\n");
                          buffer.append("Bcost"+res.getString(2)+"\n");
                           buffer.append("Rcost"+res.getString(3)+"\n");
                            buffer.append("Spdpcost"+res.getString(4)+"\n");
                        }
                        //totcost1.setText(a+"");
                        //showMessage("data",buffer.toString());

                    }
                }
        );
    }
    public void showMessage(String title,String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }*/
                        }




