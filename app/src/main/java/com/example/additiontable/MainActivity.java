package com.example.additiontable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mIncrement = 0;
    private TextView Showincrement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Showincrement = (TextView) findViewById(R.id.box1_1);

    }

    public void increment (View view){
        mIncrement++;
        if(Showincrement != null){
            Showincrement.setText(Integer.toString(mIncrement));
        }
    }


}