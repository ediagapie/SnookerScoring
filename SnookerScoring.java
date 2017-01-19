package com.example.android.snookerscoring;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scorePlayer1 = 0;
    int scorePlayer2 = 0;
    int framePlayer1 = 0;
    int framePlayer2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given frameScore for Player 1.
     */
    public void displayFramesForPlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_1_frame);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given frameScore for Player 1.
     */
    public void displayFramesForPlayer2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_2_frame);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player 1.
     */
    public void displayForPlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_1_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Player 1 by 1 point.
     */
    public void addRedFor1(View v) {
        scorePlayer1 = scorePlayer1 + 1;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Increase the score for Player 1 by 2 points.
     */
    public void addYellowFor1(View v) {
        scorePlayer1 = scorePlayer1 + 2;
        displayForPlayer1(scorePlayer1);
    }


    /**
     * Increase the score for Player 1 by 3 points.
     */
    public void addGreenFor1(View v) {
        scorePlayer1 = scorePlayer1 + 3;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Increase the score for Player 1 by 4 points.
     */
    public void addBrownFor1(View v) {
        scorePlayer1 = scorePlayer1 + 4;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Increase the score for Player 1 by 5 points.
     */
    public void addBlueFor1(View v) {
        scorePlayer1 = scorePlayer1 + 5;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Increase the score for Player 1 by 6 points.
     */
    public void addPinkFor1(View v) {
        scorePlayer1 = scorePlayer1 + 6;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Increase the score for Player 1 by 7 points.
     */
    public void addBlackFor1(View v) {
        scorePlayer1 = scorePlayer1 + 7;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Displays the given score for Player 2.
     */
    public void displayForPlayer2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_2_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Player 2 by 1 point.
     */
    public void addRedFor2(View v) {
        scorePlayer2 = scorePlayer2 + 1;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Increase the score for Player 2 by 2 points.
     */

    public void addYellowFor2(View v) {
        scorePlayer2 = scorePlayer2 + 2;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Increase the score for Player 2 by 3 points.
     */

    public void addGreenFor2(View v) {
        scorePlayer2 = scorePlayer2 + 3;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Increase the score for Player 2 by 4 points.
     */
    public void addBrownFor2(View v) {
        scorePlayer2 = scorePlayer2 + 4;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Increase the score for Player 2 by 5 points.
     */
    public void addBlueFor2(View v) {
        scorePlayer2 = scorePlayer2 + 5;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Increase the score for Player 2 by 6 points.
     */
    public void addPinkFor2(View v) {
        scorePlayer2 = scorePlayer2 + 6;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Increase the score for Player 2 by 7 points.
     */
    public void addBlackFor2(View v) {
        scorePlayer2 = scorePlayer2 + 7;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Reset score
     */
    public void resetScore(View v) {
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        displayForPlayer2(scorePlayer2);
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Reset frames
     */
    public void resetFrame(View v) {
        framePlayer2 = 0;
        framePlayer1 = 0;
        displayFramesForPlayer2(framePlayer2);
        displayFramesForPlayer1(framePlayer1);
    }

    /**
     * Increase the frameScore for Player 1 by 1.
     */
    public void addFrameFor1(View v) {
        framePlayer1 = framePlayer1 + 1;
        displayFramesForPlayer1(framePlayer1);
    }

    /**
     * Increase the frameScore for Player 2 by 1.
     */
    public void addFrameFor2(View v) {
        framePlayer2 = framePlayer2 + 1;
        displayFramesForPlayer2(framePlayer2);
    }
}

