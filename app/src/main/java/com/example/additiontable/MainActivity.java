package com.example.additiontable;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mIncrement = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt = findViewById(R.id.timer);
        String time = getIntent().getStringExtra(HomeActivity.extra_message);
        if (time != null) {
            txt.setText(time);
        }
    }

    public void incrementNum (View view) {
        TextView textView = (TextView) findViewById(view.getId());
        mIncrement++;
        if(mIncrement > 9) {
            mIncrement=0;
        }
        if (textView != null) {
            textView.setText(Integer.toString(mIncrement));
        }
    }
//    @SuppressLint("SetTextI18n")
//    public void increment (View view){
//        mIncrement++;
//        if(Showincrement != null){
//            Showincrement.setText(Integer.toString(mIncrement));
//        }
//    }

    public void backButton(View view) {
        finish();
    }

    public void restartButton(View view) {
        Toast.makeText(getApplicationContext(), R.string.restart_message, Toast.LENGTH_SHORT).show();
        recreate();
    }

}