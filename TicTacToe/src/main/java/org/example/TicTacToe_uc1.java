package org.example;

public class TicTacToe_uc1{
    static char[][] board = new char[3][3];

    public static void main(String[]  args){
        initializationBoard();
        printBoard();
    }
    static void initializationBoard(){
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                board[row][col] ='-';
            }
        }
    }

    static void printBoard(){
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }

}

