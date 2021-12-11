package com.example.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.database.R;

class DatabaseHelper extends SQLiteOpenHelper {
    EditText email;

    public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

    }

    private static final String DATABASE_NAME= "Zain_Db";
    private static final int DATABASE_VERSION = 1;

    private static final String CREATE_TABLE=
            "CREATE TABLE StudentTBL" +
                    "(StudentId INTEGER PRIMARY KEY AUTOINCREMENT,"+
                    " StudentName TEXT," +
                    "StudentEmail TEXT," +
                    "StudentPass TEXT" + " )";
    public DatabaseHelper(@Nullable Context context)
    {
        super(context, DATABASE_NAME,null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
            }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }
}
