package com.example.alex.rockpaperscissors;

import java.util.Random;

/**
 * Created by Alex on 21/03/2018.
 */

public enum Shape {
    ROCK,
    PAPER,
    SCISSORS,
    LIZARD,
    SPOCK;

    public static Shape getRandomShape() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
