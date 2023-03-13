package com.example.additiontable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mIncrement = 0;
    private int mIncrement2 = 0;
    private int mIncrement3 = 0;
    private int mIncrement4 = 0;
    private int mIncrement5 = 0;
    private int mIncrement6 = 0;
    private int mIncrement7 = 0;
    private int mIncrement8 = 0;
    private int mIncrement9 = 0;
    private TextView Showincrement;
    private TextView Showincrement2;
    private TextView Showincrement3;
    private TextView Showincrement4;
    private TextView Showincrement5;
    private TextView Showincrement6;
    private TextView Showincrement7;
    private TextView Showincrement8;
    private TextView Showincrement9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Showincrement = (TextView) findViewById(R.id.box1_1);
        Showincrement2 = (TextView) findViewById(R.id.box1_2);
        Showincrement3 = (TextView) findViewById(R.id.box1_3);
        Showincrement4 = (TextView) findViewById(R.id.box2_1);
        Showincrement5 = (TextView) findViewById(R.id.box2_2);
        Showincrement6 = (TextView) findViewById(R.id.box2_3);
        Showincrement7 = (TextView) findViewById(R.id.box3_1);
        Showincrement8 = (TextView) findViewById(R.id.box3_2);
        Showincrement9 = (TextView) findViewById(R.id.box3_3);

    }

    public void increment (View view){
        mIncrement++;
        if(Showincrement != null){
            Showincrement.setText(Integer.toString(mIncrement));
        }
    }
    public void increment2 (View view){
        mIncrement2++;
        if(Showincrement2 != null){
            Showincrement2.setText(Integer.toString(mIncrement2));
        }
    }
    public void increment3 (View view){
        mIncrement3++;
        if(Showincrement3 != null){
            Showincrement3.setText(Integer.toString(mIncrement3));
        }
    }
    public void increment4 (View view){
        mIncrement4++;
        if(Showincrement4 != null){
            Showincrement4.setText(Integer.toString(mIncrement4));
        }
    }
    public void increment5 (View view){
        mIncrement5++;
        if(Showincrement5 != null){
            Showincrement5.setText(Integer.toString(mIncrement5));
        }
    }
    public void increment6 (View view){
        mIncrement6++;
        if(Showincrement6 != null){
            Showincrement6.setText(Integer.toString(mIncrement6));
        }
    }
    public void increment7 (View view){
        mIncrement7++;
        if(Showincrement7 != null){
            Showincrement7.setText(Integer.toString(mIncrement7));
        }
    }
    public void increment8 (View view){
        mIncrement8++;
        if(Showincrement8 != null){
            Showincrement8.setText(Integer.toString(mIncrement8));
        }
    }
    public void increment9 (View view){
        mIncrement9++;
        if(Showincrement9 != null){
            Showincrement9.setText(Integer.toString(mIncrement9));
        }
    }


}