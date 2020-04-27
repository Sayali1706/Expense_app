package com.example.expense;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class dashboard extends AppCompatActivity implements View.OnClickListener {

    public CardView auser, gbill, grec, conu, allres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        auser = (CardView) findViewById(R.id.menu);
        gbill = (CardView) findViewById(R.id.money);
        grec = (CardView) findViewById(R.id.profit);
        conu = (CardView) findViewById(R.id.loc);
        allres = (CardView) findViewById(R.id.con);


        auser.setOnClickListener(this);
        gbill.setOnClickListener(this);
        grec.setOnClickListener(this);
        conu.setOnClickListener(this);
        allres.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        Intent i;

        switch (v.getId()) {

            case R.id.menu:
                i = new Intent(this, HomeActivity.class);
                startActivity(i);
                break;

            case R.id.money:
                i = new Intent(this, Update.class);
                i.putExtra("user_name", "");
                startActivity(i);
                break;

            case R.id.profit:
                i = new Intent(this, Profit.class);
                startActivity(i);
                break;

            case R.id.loc:
                i = new Intent(this, MapsActivity.class);
                startActivity(i);
                break;

            case R.id.con:
                i = new Intent(this, Contact.class);
                startActivity(i);
                break;

            default:
                break;

        }
    }}



