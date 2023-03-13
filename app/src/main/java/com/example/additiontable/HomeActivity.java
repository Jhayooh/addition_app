package com.example.additiontable;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


public class HomeActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    static final String extra_message = "com.example.android.additiontable.extra.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Spinner spinner = findViewById(R.id.time);
        if (spinner != null){
            spinner.setOnItemSelectedListener(this);

            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.timer, android.R.layout.simple_spinner_item);

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinner.setAdapter(adapter);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String spinnerLabel = adapterView.getItemAtPosition(i).toString();
        // displayToast(spinnerLabel);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void launchMainActivity(View view){
        Intent intent = new Intent(this, MainActivity.class);
        Spinner spin = findViewById(R.id.time);
        String string = spin.getSelectedItem().toString();
        intent.putExtra(extra_message, string);
        startActivity(intent);
    }


}