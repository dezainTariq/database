package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //lv= (LList)




    }

    public void save(View view)
    {
        EditText et1 = (EditText) findViewById(R.id.name);
        EditText et2 = (EditText) findViewById(R.id.email);
        EditText et3 = (EditText) findViewById(R.id.password);

        DatabaseHelper dbHelper;
        SQLiteDatabase db;

        dbHelper = new DatabaseHelper(this);
        db = dbHelper.getWritableDatabase();

        ContentValues cv = new ContentValues();
//
//        "(StudentId INTEGER PRIMARY KEY AUTOINCREMENT,"+
//                " StudentName TEXT," +
//                "StudentEmail TEXT," +
//                "StudentPass TEXT" +

        cv.put("StudentName",et1.getText().toString());

        cv.put("StudentEmail",et2.getText().toString());

        cv.put("StudentPass",et3.getText().toString());


        long rowID = db.insert("StudentTBL","StudentId", cv);

        Toast.makeText(this, rowID+"", Toast.LENGTH_SHORT).show();


    }


    public void flogin(View view) {
        Intent i = new Intent(getApplicationContext(),login.class);
        //Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show();
        startActivity(i);
        }
}