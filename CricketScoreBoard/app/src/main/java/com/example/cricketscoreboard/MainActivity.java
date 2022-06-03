package com.example.cricketscoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ScoreTeamA=0;
    int ScoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayscoreA(int score){
        TextView scoreView = (TextView) findViewById(R.id.score);
        scoreView.setText(String.valueOf(score));
    }

    public void One_Run(View v){
        ScoreTeamA = ScoreTeamA+1;
        displayscoreA(ScoreTeamA);
    }

    public void Two_Run(View v){
        ScoreTeamA = ScoreTeamA+2;
        displayscoreA(ScoreTeamA);
    }

    public void Three_Run(View v){
        ScoreTeamA = ScoreTeamA+3;
        displayscoreA(ScoreTeamA);
    }

    public void Four_Run(View v){
        ScoreTeamA = ScoreTeamA+4;
        displayscoreA(ScoreTeamA);
    }

    public void Six_Run(View v){
        ScoreTeamA = ScoreTeamA+6;
        displayscoreA(ScoreTeamA);
    }

    // Score Display-B

    public void displayscoreB(int score){
        TextView scoreView = (TextView) findViewById(R.id.scoreb);
        scoreView.setText(String.valueOf(score));
    }

    public void One_Runb(View v){
        ScoreTeamB = ScoreTeamB+1;
        displayscoreB(ScoreTeamB);
    }

    public void Two_Runb(View v){
        ScoreTeamB = ScoreTeamB+2;
        displayscoreB(ScoreTeamB);
    }

    public void Three_Runb(View v){
        ScoreTeamB = ScoreTeamB+3;
        displayscoreB(ScoreTeamB);
    }

    public void Four_Runb(View v){
        ScoreTeamB = ScoreTeamB+4;
        displayscoreB(ScoreTeamB);
    }

    public void Six_Runb(View v){
        ScoreTeamB = ScoreTeamB+6;
        displayscoreB(ScoreTeamB);
    }

    public void  Reset(View v){
        ScoreTeamA=0;
        ScoreTeamB=0;
        displayscoreA(0);
        displayscoreB(0);
    }
}