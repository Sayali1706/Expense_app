package com.example.expense;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class DatabaseHelper extends SQLiteOpenHelper {
        public static final String DATABASE_NAME = "Myfinal1.db";
        public static final int DATABASE_VERSION = 1;

        public static final String TABLE = "Final_table";
        public static final String ID = "fid";
        public static final String FOOD_NAME = "Food_Item";
        public static final String PER_PLATE = "Per_cost";

        public static final String DAILY_DATE = "daily_date";
        public static final String PLATE_COUNT = "Count";
        public static final String TOTAL_COST= "total";

        public static final String CREATE_TABLE = "create table " +TABLE+"("+
                ID+" integer primary key, "+
                FOOD_NAME+" text, "+
                PER_PLATE+" text, "+
                DAILY_DATE+" text, "+
                PLATE_COUNT+" text, "+
                TOTAL_COST+" text);";

    /*    public static final String MEDICAL_HISTORY_TABLE = "history_table";
        public static final String MH_ID = "mh_id";
        public static final String DOC_MH_ID = "mh_doc_id";
        public static final String MH_IMAGE_NAME = "image_name";
        public static final String MH_DATE = "mh_apnmt_date";
        public static final String CREATE_HISTORY_TABLE = "create table " +MEDICAL_HISTORY_TABLE+"("+
                MH_ID+" integer primary key, "+
                DOC_MH_ID+" integer, "+
                MH_IMAGE_NAME+" text, "+
                MH_DATE+" text);" */

        public DatabaseHelper(Context context) {
            super(context, DATABASE_NAME,  null, DATABASE_VERSION);
            SQLiteDatabase db = this.getWritableDatabase();
        }



    @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(CREATE_TABLE);
          //  db.execSQL(CREATE_HISTORY_TABLE);

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS Final_table");
          //  db.execSQL("drop table if exits"+MEDICAL_HISTORY_TABLE);
            onCreate(db);

        }
        /*public void clearDatabase(){

            SQLiteDatabase db = this.getWritableDatabase(); //get database
            //db.execSQL("DELETE FROM "+ DOCTOR_INFO_TABLE+""); //delete all rows in a table
            //db.execSQL("drop table if exits"+DOCTOR_INFO_TABLE);
            //db.execSQL("drop table if exits"+MEDICAL_HISTORY_TABLE);
            db.delete(DOCTOR_INFO_TABLE,null,null);
            db.delete(MEDICAL_HISTORY_TABLE,null,null);
            db.close();
        }*/
    }


