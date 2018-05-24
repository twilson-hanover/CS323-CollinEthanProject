package com.example.zx.collinethanproject;

import android.media.Image;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class QuestionActivity1 extends Activity {

    private QuestionLibrary quesLib = new QuestionLibrary();

    private TextView hint;
    private boolean difficultyEasy;
    private TextView questionView;
    private Button choice1;
    private Button choice2;
    private Button choice3;
    private Button choice4;
    private String ans;
    public int scoreView = 0;
    private int questionNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        questionView = (TextView)findViewById(R.id.question);
        choice1 = (Button)findViewById(R.id.choice1);
        choice2 = (Button)findViewById(R.id.choice2);
        choice3 = (Button)findViewById(R.id.choice3);
        choice4 = (Button)findViewById(R.id.choice4);
        Intent intent = getIntent();
        difficultyEasy = intent.getBooleanExtra("Easy",false);
        hint = (TextView)findViewById(R.id.questionHint);

        updateQuestion();

        //Button Listener for Button 1
        choice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (choice1.getText() == ans){
                    scoreView+=1;
                    Toast.makeText(QuestionActivity1.this, "Correct!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuestionActivity1.this, "Wrong!", Toast.LENGTH_SHORT).show();
                }
                updateQuestion();
            }

        });


        //Button Listener for Button 2
        choice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (choice2.getText() == ans){
                    scoreView+=1;
                    Toast.makeText(QuestionActivity1.this, "Correct!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuestionActivity1.this, "Wrong!", Toast.LENGTH_SHORT).show();
                }
                updateQuestion();
            }

        });

        //Button Listener for Button 3
        choice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (choice3.getText() == ans){
                    scoreView+=1;
                    Toast.makeText(QuestionActivity1.this, "Correct!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuestionActivity1.this, "Wrong!", Toast.LENGTH_SHORT).show();
                }
                updateQuestion();
            }

        });

        //Button Listener for Button 4
        choice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (choice4.getText() == ans){
                    scoreView+=1;
                    Toast.makeText(QuestionActivity1.this, "Correct!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuestionActivity1.this, "Wrong!", Toast.LENGTH_SHORT).show();
                }
                updateQuestion();
            }

        });


    }


    // Updates question and answers
    private void updateQuestion() {
        if (questionNum == 4) {
            Intent intent = new Intent(QuestionActivity1.this, FinalActivity.class);
            intent.putExtra("scoreView",scoreView);
            startActivity(intent);
            QuestionActivity1.this.finish();
        } else {

            if (difficultyEasy) {
                hint.setText(quesLib.getHint(questionNum));
            }
            else {
                hint.setText("");
            }

            ImageView image = (ImageView)findViewById(R.id.questionimage);
            image.setImageResource(quesLib.getdrawables(questionNum));

            questionView.setText(quesLib.getQuestion(questionNum));
            choice1.setText(quesLib.getChoice1(questionNum));
            choice2.setText(quesLib.getChoice2(questionNum));
            choice3.setText(quesLib.getChoice3(questionNum));
            choice4.setText(quesLib.getChoice4(questionNum));

            ans = quesLib.answer(questionNum);
            questionNum++;
        }
    }

    public int getScoreView(){
        return scoreView;
    }

}
