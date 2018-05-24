package com.example.zx.collinethanproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.MenuItem;
import android.widget.RadioButton;

public class TopLevelActivity extends Activity {

    public RadioButton easy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        easy = (RadioButton)findViewById(R.id.easy_mode);

    }

    public void startGame(View v){
        Intent intent = new Intent(TopLevelActivity.this, QuestionActivity1.class);

        intent.putExtra("Easy",easy.isChecked());
        startActivity(intent);
    }


    //Inflate the menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
