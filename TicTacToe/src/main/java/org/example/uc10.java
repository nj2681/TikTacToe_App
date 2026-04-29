package org.example;

public class uc10 {static char[][] board = new char[3][3];

    public static void main(String[] args) {

        board[0][0] = 'X';
        board[0][1] = 'O';
        board[0][2] = 'X';

        board[1][0] = 'O';
        board[1][1] = 'X';
        board[1][2] = 'O';

        board[2][0] = 'O';
        board[2][1] = 'X';
        board[2][2] = 'O';

        System.out.println(isDraw());
    }

    static boolean isDraw() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
