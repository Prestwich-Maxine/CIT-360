/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.DeliveryControl;
import model.Game;
import model.Player;

/**
 *
 * @author Maxine
 */
public class DeliveryTypeView extends View {

    public DeliveryTypeView() {
        super("Choose a delivery to earn money:\n"
                + "* Remember that it will take you 1 hour to make a delivery and earn the money.\n"
                + "A - Deliver supplies to the nursing home. Payment: $20\n"
                + "B - Deliver supplies to the post office. Payment: $20\n"
                + "C - Deliver supplies to the prison. Payment: $20\n"
                + "X - Cancel. Return to previous menu.\n");

    }

    @Override
    public boolean doAction(char input) {

        switch (input) {
            case 'A':
                System.out.println("You have earned $20 for delivering to the nursing home.\n");
                deductTime();
                addMoney();
                
                 //Display remaining Time and current Money to user
                displayMoney();
                displayTime();

                break;
            case 'B':
                System.out.println("You have earned $20 for delivering to the post office.\n");
                deductTime();
                addMoney();
                
                //Display remaining Time and current Money to user
                displayMoney();
                displayTime();

                break;
            case 'C':
                System.out.println("You have earned $20 for delivering to the prison.\n");
                deductTime();
                addMoney();
                
                 //Display remaining Time and current Money to user
                displayMoney();
                displayTime();
           
                break;
            case 'X':
                return false;
            default:
                System.out.println("Please enter a valid input.");
                break;
            }
            return true;
    }
    
    
      // a set time deduction for everytime the player moves ( - 30 minutes)
    public void deductTime() {

        int deduction = 1;
        int timeRemaining = Game.getInstance().getPlayer().getTimeRemaining();
            
        int newTimeRemaining = timeRemaining - deduction;

        Game.getInstance().getPlayer().setTimeRemaining(newTimeRemaining);
    }

    private void addMoney() {
        int earnedMoney = 20;
        int currentMoney = Game.getInstance().getPlayer().getMoney();
        
        int newMoney = currentMoney + earnedMoney;
        
        Game.getInstance().getPlayer().setMoney(newMoney);
    }

    private void displayMoney() {
       int currentMoney = Game.getInstance().getPlayer().getMoney();
       System.out.println("You now have $" + currentMoney + " in your money account.");

    
    }

    private void displayTime() {
        int timeRemaining = Game.getInstance().getPlayer().getTimeRemaining();
        System.out.println("You now have " + timeRemaining + " hours remaining before the Hurricane!.\n"
                + "You had better hurry!");
    }

}
