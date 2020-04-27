package com.example.expense;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class UpdateData extends SQLiteOpenHelper {

    private static final String dbnameup = "updatecost.db";

    public UpdateData(@Nullable Context context) {
        super(context, dbnameup, null, 4);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String q = "create table update_cost(Pcost text, Scost text, Bcost text, Rcost text, Spdpcost text)";
        db.execSQL(q);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("DROP TABLE IF EXISTS update_cost");
        onCreate(db);
    }

    public String updaterecord(String c1, String c2, String c3, String c4, String c5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues uv = new ContentValues();
        uv.put("Pcost", c1);
        uv.put("Scost", c2);
        uv.put("Bcost", c3);
        uv.put("Rcost", c4);
        uv.put("Spdpcost", c5);

        long res = db.insert("update_cost", null, uv);
        if (res == -1)
            return "Failed";
        else
            return "Cost updated!";


    }
}
