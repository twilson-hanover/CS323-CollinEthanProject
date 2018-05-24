package com.example.zx.collinethanproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class FinalActivity extends Activity {

    private TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        int finalScore = intent.getIntExtra("scoreView",0);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        score = (TextView)findViewById(R.id.score);
        score.setText("You got "+finalScore+" out of 4 correct!");

    }

}
