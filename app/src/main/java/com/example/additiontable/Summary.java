package com.example.additiontable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Summary extends AppCompatActivity {

    public static final String sum_pName = "name";
    public static final String sum_tile = "tile";
    public static final String sum_time = "time";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);;
        TextView text_name = findViewById(R.id.playername);
        TextView text_tile = findViewById(R.id.tileSelected);
        TextView text_time = findViewById(R.id.TimeF);
        text_name.setText(getIntent().getStringExtra(sum_pName));
        text_tile.setText(getIntent().getStringExtra(sum_tile));
        text_time.setText(getIntent().getStringExtra(sum_time));
    }

    public void launchMainActivity(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(MainActivity.s_timer, getIntent().getStringExtra(sum_time));
        intent.putExtra(MainActivity.s_tile, getIntent().getStringExtra(sum_tile));
        startActivity(intent);
        finish();
    }
}