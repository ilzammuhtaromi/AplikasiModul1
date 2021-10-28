package com.example.aplikasimodul1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView l;
    String name_nim[]
            = { "Muhammad Ilzam Muhtaromi", "21120119120027",
            "Muhammad Haikal Ash Shidqi", "21120119130081",
            "Bagus Muhamad Iqbal", "21120119120013",
            "Muhammad Hanif Atthariq", "21120117140028" };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = findViewById(R.id.list);
        ArrayAdapter<String> arr;
        arr
                = new ArrayAdapter<String>(
                this,
                R.layout.support_simple_spinner_dropdown_item,
                name_nim);
        l.setAdapter(arr);
    }
}

