package com.example.additiontable;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String string = getIntent().getStringExtra(HomeActivity.extra_message);
        TextView textView = findViewById(R.id.timer);
        textView.setText(string);

    }

    public void incrementNum (View view) {
        Log.d(TAG, "working1");
        TextView textView = (TextView) findViewById(view.getId());
        String viewText = textView.getText().toString();
        if (viewText.equals("")){
            Log.d(TAG, "working2");
            textView.setText("0");
        } else {
            Log.d(TAG, "working3");
            int viewNum = Integer.parseInt(viewText)+1;
            if (viewNum > 9) {
                viewNum = 0;
            }
            textView.setText(Integer.toString(viewNum));
        }
//        if (mIncrement > 9) {
//            mIncrement = 0;
//        }
//        if (textView != null) {
//            textView.setText(Integer.toString(mIncrement));
//        }
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