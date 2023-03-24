package com.example.additiontable;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

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
        Intent intent = new Intent(HistoryActivity.this, Summary.class);
        LinearLayout linear = findViewById(view.getId());
        View child = linear.getChildAt(1);
        TextView textView = findViewById(child.getId());
        String p_name = textView.getText().toString();
        intent.putExtra(Summary.sum_pName, p_name);
        intent.putExtra("isHistory", true);
        startActivity(intent);
        finish();
    }
}