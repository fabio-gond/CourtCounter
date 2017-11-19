package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.Console;

public class MainActivity extends AppCompatActivity {
    int pointsA=0;
    int pointsB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void add1PointA(View view){
        pointsA++ ;
        displayForTeamA();
    }
    public void add2PointsA(View view){pointsA+=2; displayForTeamA();}
    public void add3PointsA(View view){pointsA+=3; displayForTeamA();}

    public void add1PointB(View view){
        pointsB++ ;
        displayForTeamB();
    }
    public void add2PointsB(View view){pointsB+=2; displayForTeamB();}
    public void add3PointsB(View view){pointsB+=3; displayForTeamB();}

    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(pointsA));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(pointsB));
    }
    /**
     * Reset the scores
     */
    public void resetScore(View view){pointsA=0; pointsB=0; displayForTeamA();displayForTeamB();}
}
