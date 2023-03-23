package com.example.additiontable;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
        RadioGroup tile_count = findViewById(R.id.radioGroup);
        EditText pName = findViewById(R.id.username_edit);
        String string_tile = "";
        int string_tiles = tile_count.getCheckedRadioButtonId();
        RadioButton rb = findViewById(string_tiles);
        switch(rb.getId()) {
            case R.id.tile3:
                string_tile = getString(R.string.tilex3);
                break;
            case R.id.tile4:
                string_tile = getString(R.string.tilex4);
                break;
        }
        String string_pName = pName.getText().toString();

        if (string_pName.equals("")){
                intent.putExtra(MainActivity.s_pName, getString(R.string.no_name));
        } else {
                intent.putExtra(MainActivity.s_pName, string_pName);
        }
        String string_timer = spin.getSelectedItem().toString();
        intent.putExtra(MainActivity.s_tile, string_tile);
        intent.putExtra(MainActivity.s_timer, string_timer);
        startActivity(intent);

    }
    public void onClickHistory(View view) {
        startActivity(new Intent(this, HistoryActivity.class)); finish();
    }

}