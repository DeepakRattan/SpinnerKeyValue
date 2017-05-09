package com.example.deepakrattan.spinnerkeyvalue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private City city;
    private ArrayList<City> cityArrayList;
    private Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        btnClick = (Button) findViewById(R.id.btnClick);

        //Data source
        cityArrayList = new ArrayList<>();
        cityArrayList.add(new City("dl", "Delhi"));
        cityArrayList.add(new City("hp", "Himachal"));
        cityArrayList.add(new City("am", "Ambala"));
        cityArrayList.add(new City("kl", "Kolkata"));

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, cityArrayList);
        spinner.setAdapter(adapter);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                City city = (City) spinner.getSelectedItem();
                Log.d("ID", city.getId());
            }
        });
    }
}
