package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0, scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    /**
     * Displays the given score for Team A.
     */
    public void freeThrowA(View view)
    {
        scoreA+=1;
        displayForTeamA(scoreA);
    }
    public void pointTwoA(View view)
    {
        scoreA+=2;
        displayForTeamA(scoreA);
    }
    public void pointThreeA(View view)
    {
        scoreA+=3;
        displayForTeamA(scoreA);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void freeThrowB(View view)
    {
        scoreB+=1;
        displayForTeamB(scoreB);
    }
    public void pointTwoB(View view)
    {
        scoreB+=2;
        displayForTeamB(scoreB);
    }
    public void reset(View view)
    {
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
    public void pointThreeB(View view)
    {
        scoreB+=3;
        displayForTeamB(scoreB);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}
