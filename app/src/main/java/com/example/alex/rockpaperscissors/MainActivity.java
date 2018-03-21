package com.example.alex.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Game game;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = new Game();
        resultText = findViewById(R.id.result);
    }

    public void onRockButtonClicked(View button) {
        String result = game.play(Shape.ROCK, Shape.getRandomShape());
        resultText.setText(result);
    }

    public void onPaperButtonClicked(View button) {
        String result = game.play(Shape.PAPER, Shape.getRandomShape());
        resultText.setText(result);
    }

    public void onScissorsButtonClicked(View button) {
        String result = game.play(Shape.SCISSORS, Shape.getRandomShape());
        resultText.setText(result);
    }
}
