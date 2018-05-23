package com.example.zx.collinethanproject;

public class QuestionLibrary {

    //String for holding questions to be asked
    private String questions[] = {
            "When was Hanover College founded?",
        "When was there a tornado that struck our campus",
        "What's the name of our theater?",
        "What's the name of the Computer Science building?"
    };

    //String for holding choices for answering questions
    private String choices[][] = {
            {"1823","1911","1827","2003"},
            {"12 A.D.","1974","2011","There was no tornado"},
            {"Parker","Wiley","Katherine Parker","Faculty Office Building"},
            {"Ogle","Circle K at 3am","Phi Delta Theta","Lynn"}
    };

    //String of correct answers
    private String correct[] = {"1827","1974","Parker","Lynn"
    };

    //Function for getting questions
    public String getQuestion(int x){
        String q = questions[x];
        return q;
    }


    //Functions for getting question choices
    public String getChoice1(int x){
        String ans1 = choices[x][0];
        return ans1;
    }
    public String getChoice2(int x){
        String ans2 = choices[x][1];
        return ans2;
    }
    public String getChoice3(int x){
        String ans3 = choices[x][2];
        return ans3;
    }
    public String getChoice4(int x){
        String ans4 = choices[x][3];
        return ans4;
    }

    public String answer(int x){
        String answercorrect = correct[x];
        return answercorrect;
    }

    //array of drawables
    private int[] drawables = {
            R.drawable.question1draw,
            R.drawable.question2draw,
            R.drawable.question3draw,
            R.drawable.question4draw,
    };

    //gets drawables
    public int getdrawables(int x) {
        int draw = drawables[x];
        return draw;
    }

}
