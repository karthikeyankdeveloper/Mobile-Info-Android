package com.developer.mobileinfoad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private boolean a = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listview1);
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            arrayList.add("(MODEL) : "+ Build.MODEL);
            arrayList.add("(SERIAL) : "+Build.SERIAL);
            arrayList.add("(ID) : "+Build.ID);
            arrayList.add("(MANUFACTURER) : "+Build.MANUFACTURER);
            arrayList.add("(BRAND) : "+Build.BRAND);
            arrayList.add("(TYPE) : "+Build.TYPE);
            arrayList.add("(USER) : "+Build.USER);
            arrayList.add("(BASE) : "+Build.VERSION_CODES.BASE);
            arrayList.add("(INCREMENTAL) : "+Build.VERSION.INCREMENTAL);
            arrayList.add("(BOARD) : "+Build.BOARD);
            arrayList.add("(SDK) : "+Build.VERSION.SDK);
            arrayList.add("(HOST) : "+Build.HOST);
            arrayList.add("(FINGERPRINT) : "+Build.FINGERPRINT);
            arrayList.add("(VERSION CODE) : "+Build.VERSION.RELEASE);
        }
        catch (Exception e){
            Log.d("TAG", "onCreate: ");
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);
    }

    @Override
    public void onBackPressed() {
        if (a){
            super.onBackPressed();
        }
        else {
            Toast.makeText(this, "press again to exit", Toast.LENGTH_SHORT).show();
            a=true;
        }
        
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                a=false;
            }
        },3000);
        
    }
}