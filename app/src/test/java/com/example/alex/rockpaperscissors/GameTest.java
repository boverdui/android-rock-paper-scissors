package com.example.alex.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alex on 21/03/2018.
 */

public class GameTest {
    Game game;

    @Before
    public void before() {
        game = new Game();
    }

    @Test
    public void playerWinsRockVsScissors() {
        assertEquals("You win!\nThe computer played SCISSORS", game.play(Shape.ROCK, Shape.SCISSORS));
    }

    @Test
    public void computerWinsPaperVsRock() {
        assertEquals("You lose!\nThe computer played PAPER", game.play(Shape.ROCK, Shape.PAPER));
    }

    @Test
    public void nobodywinsPaperVsPaper() {
        assertEquals("It's a draw!\nThe computer played PAPER", game.play(Shape.PAPER, Shape.PAPER));
    }

    @Test
    public void playerScoreStartsAtZero() {
        assertEquals(0, game.getPlayerScore());
    }

    @Test
    public void  computerScoreStartsAtZero() {
        assertEquals(0, game.getComputerScore());
    }

    @Test
    public void canAddToPlayerScore() {
        game.play(Shape.ROCK, Shape.SCISSORS);
        assertEquals(1, game.getPlayerScore());
    }

    @Test
    public void canAddToComputerScore() {
        game.play(Shape.ROCK, Shape.PAPER);
        assertEquals(1, game.getComputerScore());
    }

}
