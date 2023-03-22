package com.example.additiontable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }
    public void backButton(View view) {
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }
    public void launchSummary (View view){
        Intent intent = new Intent(this, Summary.class);
        startActivity(intent);
        finish();
    }
}