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

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    public static final String s_timer = "timer";
    public static String m_timer;
    public static final String s_tile = "tile";
    public static String m_tile;
    public static final String s_pName = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m_tile = getIntent().getStringExtra(s_tile);
        if (Objects.equals(m_tile, getString(R.string.tilex3))) {
            setContentView(R.layout.activity_main);
        } else if (Objects.equals(m_tile, getString(R.string.tilex4))) {
            setContentView(R.layout.activity_main4x4);
        }

        m_timer = getIntent().getStringExtra(s_timer);
        TextView textView = findViewById(R.id.timer);
        if (m_timer.equals(R.string.timer))
        textView.setText(m_timer);

    }

    public void incrementNum (View view) {
        TextView textView = (TextView) findViewById(view.getId());
        String viewText = textView.getText().toString();
        if (viewText.equals("")){
            textView.setText("0");
        } else {
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
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }

    public void restartButton(View view) {
        Toast.makeText(getApplicationContext(), R.string.restart_message, Toast.LENGTH_SHORT).show();
        recreate();
    }

    public void launchSummary (View view){
        Intent intent = new Intent(this, Summary.class);
        intent.putExtra(Summary.sum_pName, getIntent().getStringExtra(s_pName));
        intent.putExtra(Summary.sum_tile, getIntent().getStringExtra(s_tile));
        intent.putExtra(Summary.sum_time, m_timer);
        startActivity(intent);
    }

}