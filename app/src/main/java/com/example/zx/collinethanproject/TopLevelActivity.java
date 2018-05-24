package com.example.zx.collinethanproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

public class TopLevelActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

    }

    public void startGame(View v){
        Intent intent = new Intent(TopLevelActivity.this, QuestionActivity1.class);
        startActivity(intent);
    }




}
