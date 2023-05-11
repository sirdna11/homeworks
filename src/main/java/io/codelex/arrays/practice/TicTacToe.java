package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        initBoard();
        displayBoard();

        boolean x = true;
        boolean gameContinues = true;
        while (gameContinues) {
            if (x) {
                System.out.println("'O', choose your location (row, column): ");
                int row = input.nextInt();
                int column = input.nextInt();
                board[row][column] = '0';
                displayBoard();
                x = false;
            } else {
                System.out.println("'x', choose your location (row, column): ");
                int row = input.nextInt();
                int column = input.nextInt();
                board[row][column] = 'x';
                displayBoard();
                x = true;
            }
            String result = checkWinner();
            if (!result.equals("The game is a tie.") && !result.isEmpty()) {
                System.out.println(result);
                gameContinues = false;
            }

        }

    }

    public static String checkWinner() {
        for (int r = 0; r < 3; r++) {

            if (board[r][0] == board[r][1] && board[r][1] == board[r][2] && board[r][0] != ' ') {
                return board[r][0] + " wins!";
            }


            if (board[0][r] == board[1][r] && board[1][r] == board[2][r] && board[0][r] != ' ') {
                return board[0][r] + " wins!";
            }
        }


        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            return board[0][0] + " wins!";
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
            return board[0][2] + " wins!";
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return "";
                }
            }
        }

        return "The game is a tie.";
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }
}