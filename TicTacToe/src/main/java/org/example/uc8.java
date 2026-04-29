package org.example;

public class uc8  {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human Turn");
            } else {
                System.out.println("Computer Turn");
            }

            isHumanTurn = !isHumanTurn;

            // Demo condition to stop game after some turns
            if (Math.random() > 0.8) {
                gameOver = true;
            }
        }

        System.out.println("Game Over");
    }
}

