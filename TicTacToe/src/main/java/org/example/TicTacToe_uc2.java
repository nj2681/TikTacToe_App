package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TicTacToe_uc2 {
     static boolean isHumanTurn;
     static char humanSymbol;
     static char computerSymbol

 public static void main(string[] args){
         tossAndAssignSymbol();
         displayTossResult();
 }

 static void tossAndAssignSymbol(){
         Random random = new Random ();
         int toss = random.nextInt(2);
         if (toss == 0){
             isHumanSymbol = 'X';
             humanSymbol ='o';
         }else {
             isHumanTurn = false;
             humanSymbol = 'o';
             computerSymbol = 'X';
         }
 }
 static void displayTossResult (){
         if (isHumanTurn){
             system.out.println("Human won the toss and plays first")
         }else {
             system.out.println("computer won the toss and palys first")
         }
      system.out.println("Human Symbol : " + human symbol);
         system.out.println("computer symbol");
 }
}
