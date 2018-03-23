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
        setScores();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_activity, menu);
        return true;
    }

    private void setScores() {
        scores.setText("Player: " + game.getPlayerScore() + "   Computer: " + game.getComputerScore());
    }

    public void onButtonClicked(View button) {
        for (Shape shape : Shape.values()) {
            if (button.getId() == shape.getId()) {
                String result = game.play(shape, Shape.getRandomShape());
                resultText.setText(result);
            }
            setScores();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_reset_scores) {
            game.resetScores();
            setScores();
            resultText.setText("");
        }
        if (item.getItemId() == R.id.action_rules) {
            Intent intent = new Intent(this, RulesActivity.class);
            startActivity(intent);
        }
        return true;
    }

}
