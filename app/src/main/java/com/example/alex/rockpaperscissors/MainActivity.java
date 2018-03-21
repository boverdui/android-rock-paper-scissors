package com.example.alex.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Game game;
    TextView resultText;
    TextView scores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = new Game();
        resultText = findViewById(R.id.result);
        scores = findViewById(R.id.scores);
        scores.setText("Player: " + game.getPlayerScore() + "   Computer: " + game.getComputerScore());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_activity, menu);
        return true;
    }

    public void onRockButtonClicked(View button) {
        String result = game.play(Shape.ROCK, Shape.getRandomShape());
        resultText.setText(result);
        scores.setText("Player: " + game.getPlayerScore() + "   Computer: " + game.getComputerScore());
    }

    public void onPaperButtonClicked(View button) {
        String result = game.play(Shape.PAPER, Shape.getRandomShape());
        resultText.setText(result);
        scores.setText("Player: " + game.getPlayerScore() + "   Computer: " + game.getComputerScore());
    }

    public void onScissorsButtonClicked(View button) {
        String result = game.play(Shape.SCISSORS, Shape.getRandomShape());
        resultText.setText(result);
        scores.setText("Player: " + game.getPlayerScore() + "   Computer: " + game.getComputerScore());
    }

    public void onLizardButtonClicked(View button) {
        String result = game.play(Shape.LIZARD, Shape.getRandomShape());
        resultText.setText(result);
        scores.setText("Player: " + game.getPlayerScore() + "   Computer: " + game.getComputerScore());
    }

    public void onSpockButtonClicked(View button) {
        String result = game.play(Shape.SPOCK, Shape.getRandomShape());
        resultText.setText(result);
        scores.setText("Player: " + game.getPlayerScore() + "   Computer: " + game.getComputerScore());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_reset_scores) {
            game.resetScores();
            scores.setText("Player: " + game.getPlayerScore() + "   Computer: " + game.getComputerScore());
        }
        if (item.getItemId() == R.id.action_rules) {
            Intent intent = new Intent(this, RulesActivity.class);
            startActivity(intent);
        }
        return true;
    }

}
