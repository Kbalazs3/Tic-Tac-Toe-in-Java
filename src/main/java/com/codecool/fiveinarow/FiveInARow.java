package com.codecool.fiveinarow;

import java.util.Arrays;

public class FiveInARow {

    public static void main(String[] args) {
        Game game = new Game(11, 11);
        int [] c = game.getMove(1);
        game.enableAi(1);
        game.enableAi(2);
        game.play(5);
        // System.out.println(Arrays.toString(c));
        game.printBoard();
    }
}
