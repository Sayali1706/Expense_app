package com.example.expense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {

    public static final String p_count = null;

    private FirebaseAuth firebaseAuth;


    private TextView countpanipuri;
    private Button incpanipuri;
    private Button decpanipuri;
    int counter1 = 0;

    private TextView countshevpuri;
    private Button incshevpuri;
    private Button decshevpuri;
    int counter2 = 0;

    private TextView countbhel;
    private Button incbhel;
    private Button decbhel;
    int counter3 = 0;

    private TextView countragda;
    private Button incragda;
    private Button decragda;
    int counter4 = 0;

    private TextView countspdp;
    private Button incspdp;
    private Button decspdp;
    int counter5 = 0;


    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //mydb=new DatabaseHelper(this);

        countpanipuri = findViewById(R.id.countpp);
        incpanipuri = findViewById(R.id.incpanipuri);
        decpanipuri = findViewById(R.id.decpanipuri);

        incpanipuri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter1++;

                System.out.println("Count--------->" + counter1);

                //
                //
                countpanipuri.setText(counter1 + "");
            }
        });

        decpanipuri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter1--;
                countpanipuri.setText(counter1 + "");
            }
        });

        countshevpuri = findViewById(R.id.countsp);
        incshevpuri = findViewById(R.id.incshevpuri);
        decshevpuri = findViewById(R.id.decshevpuri);

        incshevpuri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter2++;
                countshevpuri.setText(counter2 + "");
            }
        });

        decshevpuri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter2--;
                countshevpuri.setText(counter2 + "");
            }
        });

        countbhel = findViewById(R.id.countb);
        incbhel = findViewById(R.id.incbhel);
        decbhel = findViewById(R.id.decbhel);

        incbhel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter3++;
                countbhel.setText(counter3 + "");
            }
        });

        decbhel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter3--;
                countbhel.setText(counter3 + "");
            }
        });

        countragda = findViewById(R.id.countr);
        incragda = findViewById(R.id.incragda);
        decragda = findViewById(R.id.decragda);


        incragda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter4++;
                countragda.setText(counter4 + "");
            }
        });

        decragda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter4--;
                countragda.setText(counter4 + "");
            }
        });

        countspdp = findViewById(R.id.countd);
        incspdp = findViewById(R.id.incd);
        decspdp = findViewById(R.id.decd);

        incspdp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter5++;
                countspdp.setText(counter5 + "");
            }
        });

        decspdp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter5--;
                countspdp.setText(counter5 + "");
            }
        });

        submit = findViewById(R.id.tab_show);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(HomeActivity.this, Table.class);
                i.putExtra("PANIP", counter1);
                i.putExtra("SHEVP", counter2);
                i.putExtra("BHELP", counter3);
                i.putExtra("RAGDAP", counter4);
                i.putExtra("DAHIP", counter5);
                startActivity(i);


            }
        });


        firebaseAuth = FirebaseAuth.getInstance();


    }

    public void addrecord(View view) {
        DbManager db = new DbManager(this);
        String res = db.addrecord(countpanipuri.getText().toString(), countshevpuri.getText().toString(), countbhel.getText().toString(), countragda.getText().toString(), countspdp.getText().toString());

        Toast.makeText(this, res, Toast.LENGTH_LONG).show();

        countpanipuri.setText("");
        countshevpuri.setText("");
        countbhel.setText("");
        countragda.setText("");
        countspdp.setText("");


    }


    private void Logout() {
        firebaseAuth.signOut();
        finish();
        startActivity(new Intent(HomeActivity.this, MainActivity.class));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logoutMenu: {
                Logout();
                break;
            }
            /*case R.id.show_table:{
                startActivity(new Intent(HomeActivity.this, Table.class));
                break;
            }
            case R.id.update_table:{
                startActivity(new Intent(HomeActivity.this, Update.class));
            }*/
        }

                return super.onOptionsItemSelected(item);
            }

        }





