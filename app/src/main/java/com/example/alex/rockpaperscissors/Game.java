package com.example.alex.rockpaperscissors;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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

        HashMap<Shape, List<Shape>> combinations = new HashMap<>();

        combinations.put(Shape.PAPER, Arrays.asList(Shape.ROCK, Shape.SPOCK));
        combinations.put(Shape.SCISSORS, Arrays.asList(Shape.PAPER, Shape.LIZARD));
        combinations.put(Shape.ROCK, Arrays.asList(Shape.SCISSORS, Shape.LIZARD));
        combinations.put(Shape.LIZARD, Arrays.asList(Shape.PAPER, Shape.SPOCK));
        combinations.put(Shape.SPOCK, Arrays.asList(Shape.SCISSORS, Shape.ROCK));

        if (combinations.get(playerHand).contains(computerHand) ) {
            addToPlayerScore();
            return "You win!\nThe computer played " + computerHand;
        } else if (combinations.get(computerHand).contains(playerHand)) {
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