package com.example.expense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Profit extends AppCompatActivity {

    EditText enter_expense;
    TextView revenue;
    TextView profit;
    TextView loss;
    Button button_submit;

    public int rev;
    public int exp;
    public int pro;
    public int los;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profit);

        enter_expense=findViewById(R.id.expense);
        revenue = findViewById(R.id.rev_val);
        profit = findViewById(R.id.pro_amt);
        loss = findViewById(R.id.loss_amt);
        button_submit = findViewById(R.id.show);


        button_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int reve = Integer.parseInt(revenue.getText().toString());
                int expe = Integer.parseInt(enter_expense.getText().toString());
                if(reve>expe) {
                    int prof = reve - expe;
                    profit.setText("Rs: "+Integer.toString(prof));


                }else
                {
                    int los = expe - reve;
                    loss.setText("Rs: "+Integer.toString(los));
                }
            }
        });

    }
}