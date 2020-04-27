package com.example.expense;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.Editable;

import androidx.annotation.Nullable;

public class DbManager extends SQLiteOpenHelper {

    private static final String dbname = "mydata.db";

    public DbManager(@Nullable Context context) {
        super(context, dbname, null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String qry = "create table count_table(Panipuri text, Shevpuri text, Bhel text, Ragdapuri text, Spdp text)";
        db.execSQL(qry);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS count_table");
        onCreate(db);

    }

    public String addrecord(String p1, String p2, String p3, String p4, String p5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("Panipuri", p1);
        cv.put("Shevpuri", p2);
        cv.put("Bhel", p3);
        cv.put("Ragdapuri", p4);
        cv.put("Spdp", p5);

        long res = db.insert("count_table", null, cv);
        if (res == -1)
            return "Failed";
        else
            return "Today's data saved!";


    }



}


