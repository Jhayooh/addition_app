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
        String string = getIntent().getStringExtra(HomeActivity.extra_message);
        TextView textView = findViewById(R.id.timer);
        textView.setText(string);

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

    public void launchSummary (View view){
        Intent intent = new Intent(this, Summary.class);
        startActivity(intent);
    }

}