package com.raykibul.androidbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity3 extends AppCompatActivity {

    ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        myListView=findViewById(R.id.listView);

        ArrayAdapter<CharSequence>myarrayAdapter = ArrayAdapter.createFromResource(this,R.array.countryName,android.R.layout.simple_list_item_1);
        myListView.setAdapter(myarrayAdapter);
    }
}