package com.example.expense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Contact extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"Panipuri","Shevpuri","Bhel","Ragdapuri","SPDP","Contact : ","E-mail : "};
    String mDescription[] = {"Rs 20","Rs 30","Rs 35","Rs 30","Rs 40","8888241463","samarthsevafoodz@gmail.com"};
    int images[] = {R.drawable.panipuri_img, R.drawable.spdp_img, R.drawable.bhel_img, R.drawable.ragda_img, R.drawable.spdp_img,R.drawable.contact_img,R.drawable.email_img};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        listView = findViewById(R.id.listView);
        // now create an adapter class

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];


        MyAdapter (Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.layoutimg, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;

        }

        //   @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.layoutimg, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            // now set our resources on views


            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);




            return row;
        }
    }
}

