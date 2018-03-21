package com.example.alex.rockpaperscissors;

import java.util.HashMap;

/**
 * Created by Alex on 21/03/2018.
 */

public class Game {

    private Shape playerHand;
    private Shape computerHand;
    private int playerScore;
    private int computerScore;

    public Game() {
        this.playerHand = null;
        this.computerHand = null;
        this.playerScore = 0;
        this.computerScore = 0;
    }

    public String play(Shape playerHand, Shape computerHand) {

        HashMap<Shape, Shape> combinations = new HashMap<>();

        combinations.put(Shape.PAPER, Shape.ROCK);
        combinations.put(Shape.SCISSORS, Shape.PAPER);
        combinations.put(Shape.ROCK, Shape.SCISSORS);

        if (combinations.get(playerHand) == computerHand) {
            addToPlayerScore();
            return "You win!\nThe computer played " + computerHand;
        } else if (combinations.get(computerHand) == playerHand) {
            addToComputerScore();
            return "You lose!\nThe computer played " + computerHand;
        } else {
            return "It's a draw!\nThe computer played " + computerHand;
        }
    }
    
    private void addToPlayerScore() {
        playerScore ++;
    }
    
    private void addToComputerScore() {
        computerScore ++;
    }
    
    public void resetScores() {
        playerScore = 0;
        computerScore = 0;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }
}