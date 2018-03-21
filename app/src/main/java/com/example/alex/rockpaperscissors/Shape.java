package com.example.alex.rockpaperscissors;

import java.util.Random;

/**
 * Created by Alex on 21/03/2018.
 */

public enum Shape {
    ROCK(R.id.rock_button),
    PAPER(R.id.paper_button),
    SCISSORS(R.id.scissors_button),
    LIZARD(R.id.lizard_button),
    SPOCK(R.id.spock_button);

    private int id;

    Shape(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static Shape getRandomShape() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

}
