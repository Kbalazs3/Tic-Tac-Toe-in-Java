package com.codecool.fiveinarow;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class Game implements GameInterface {

    private int[][] board;

    public Game(int nRows, int nCols) {
        int [][] fullBoard = new int[nRows][nCols];
        for (int rowNum = 0; rowNum< nRows; rowNum++) {
            for (int colsNum = 0; colsNum<nCols; colsNum++) {
                int [] cols = new int [nCols];
                cols[colsNum] = 0;
                fullBoard[colsNum] = cols;
            }
        }
        board = fullBoard;
    }

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }

    public int[] getMove(int player) {

        int[] coordinates = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter target coordinate f.e. 'C2': ");
        String moveCoordinate = scanner.nextLine().toUpperCase(Locale.ROOT);
        while (moveCoordinate.length() < 2 || moveCoordinate.length() > 3) {
            System.out.println("Too long or too short input!");
            moveCoordinate = scanner.nextLine().toUpperCase(Locale.ROOT);
        }
        char [] rowsLetters = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M'};
        char rowCoordinateLetter = moveCoordinate.charAt(0);
        char colCoordinateLetter = moveCoordinate.charAt(1);
        int colCoordNum = Character.getNumericValue(colCoordinateLetter);
        int rowIndex = 0;
        for (char c : rowsLetters) {
            if (c == rowCoordinateLetter) {
                coordinates[0] = rowIndex;
            }
            rowIndex += 1;
        }
        coordinates[1] = colCoordNum;
        while(colCoordNum < 1 || colCoordNum > 3) {
            System.out.println("The column num is not correct!");
            moveCoordinate = scanner.nextLine().toUpperCase(Locale.ROOT);
        }
        while(Character.isLetter(rowCoordinateLetter) != true) {
            System.out.println("The row has tobe a letter!");
            moveCoordinate = scanner.nextLine().toUpperCase(Locale.ROOT);
        }
        while(!Character.isDigit(colCoordinateLetter)) {
            System.out.println("The col has tobe a number!");
            moveCoordinate = scanner.nextLine().toUpperCase(Locale.ROOT);
        }
        return coordinates;
    }


    public boolean coordinateValidator() {
        boolean okCoordinates = false;


        return true;
    }


    public int[] getAiMove(int player) {
        return null;
    }

    public void mark(int player, int row, int col) {

    }

    public boolean hasWon(int player, int howMany) {
        return false;
    }


    public boolean isFull() {
        return false;
    }

    public void printBoard() {
        /*for (int i = 0; i<board.length; i++) {
            for (String s : board[i]) {

            }*/
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                // board[row][col] = row * col;
                System.out.print(board[row][col]);
            }

        }

public void printResult(int player) {
    }

    public void enableAi(int player) {
    }

    public void play(int howMany) {
    }
}
}
