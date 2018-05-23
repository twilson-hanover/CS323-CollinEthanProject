package com.example.zx.collinethanproject;

public class QuestionLibrary {

    private String questions[] = {
            "When was Hanover College founded?",
        "When was there a tornado that struck our campus",
        "What's the name of our theater?",
        "What's the name of the Computer Science building?"
    };

    private String choices[][] = {
            {"1823","1911","1827","2003"},
            {"12 A.D.","1974","2011","There was no tornado"},
            {"Parker","Wiley","Katherine Parker","Faculty Office Building"},
            {"Ogle","Circle K at 3am","Phi Delta Theta","Lynn"}
    };

    private String correct[] = {"1827","1974","Parker","Lynn"
    };

    public String getQuestion(int a){
        String q = questions[a];
        return q;
    }

    public String getChoice1(int a){
        String ans = choices[a][0];
        return ans;
    }
    public String getChoice2(int a){
        String ans = choices[a][1];
        return ans;
    }
    public String getChoice3(int a){
        String ans = choices[a][2];
        return ans;
    }
    public String getChoice4(int a){
        String ans = choices[a][3];
        return ans;
    }

    public String answer(int a){
        String answer = correct[a];
        return answer;
    }





}
