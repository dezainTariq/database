package com.example.database;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class login2 extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

    }


//    public void Check (View view){
//
//        DatabaseHelper dbHelper = new DatabaseHelper(this);
//
//        SQLiteDatabase db = dbHelper.getReadableDatabase();
//        //ArrayList<String> Students = new ArrayList<String>();
//
//        String query = "select * from StudentTBL";
//
//        Cursor c = db.rawQuery(query, null);
//
//        if (c.moveToFirst()) {
//            do {
//                EditText et2 = (EditText) findViewById(R.id.email);
//                EditText et3 = (EditText) findViewById(R.id.password);
//
//                @SuppressLint("Range") String name = c.getString(c.getColumnIndex("StudentName"));
//                @SuppressLint("Range") String email = c.getString(c.getColumnIndex("StudentEmail"));
//                @SuppressLint("Range") String pass = c.getString(c.getColumnIndex("StudentPass"));
//
//                if (email.equals(et2.toString()) && pass.equals(et3.toString())) {
//                    Toast.makeText(this, name + " Logged in", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(this, "No user found", Toast.LENGTH_SHORT).show();
//                }
//            }
//            while (c.moveToNext());
//
//        } else {
//            Toast.makeText(this, "Database is empty", Toast.LENGTH_SHORT).show();
//        }
//
//        db.close();
//
//
//
//
//    }
}
