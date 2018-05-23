package com.example.zx.collinethanproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class FinalActivity extends Activity {
    private QuestionActivity1 ques1 = new QuestionActivity1();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        int score = ques1.getScoreView();
        TextView text = new TextView(this);
        text.setText(Integer.toString(score));
    }
}
