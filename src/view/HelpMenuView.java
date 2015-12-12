/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author maloriegomm
 */
public class HelpMenuView extends View{
    
    public HelpMenuView() {
        super("G - What is the goal of the game?\n"
                + "V - view inventory and resources\n"
                + "M - How to move locations\n"
                + "A - How to make money\n"
                + "B - How to buy supplies\n"
                + "X - Close Help Menu\n");
    }

    /**
     * This just calls a method based on the input
     *
     * @param input
     */
    @Override
     public boolean doAction(char input) {
        
         switch(input) {
            case 'G' :
                GameGoal();
                break;
            case 'V' :
                ViewInventory();
                break;
            case 'M' :
                MoveLocations();
                break;
            case 'A' :
                MakeMoney();
                break;
            case 'B' :
                BuySupplies();
                break;
            case 'X':
                return false;
            default:
                System.out.println("Please select a valid input.");
                break;
            }
            return true;
        }
     
    
     private void GameGoal() {
        System.out.println("The goal of the game is to gather all your supplies\n"
                + "before your time runs out. Remember, you start with 72 hours,\n"
                + "some supplies, and some funds to purchase needed items. You will\n"
                + "be able to earn more money as needed. However, as you move\n"
                + "from one location to another or make deliveries, time will be\n"
                + "deducted from your game.\n"); 
    }
    
    private void ViewInventory() {
        System.out.println("To view your inventory list, you will need to go to\n"
                + "the Game Menu and select 'I' for View Inventory. This list\n"
                + "displays the items you start the game with. You will be able"
                + "to keep track of items you need since they will be added to this"
                + "list as purchases are made.\n"); 
    }

    private void MoveLocations() {
        System.out.println("To move locations on the map, determine where you want\n "
                + "to move. Then, go to the Game Menu and select 'L' for Move to\n"
                + "a New Location.\n");  
    }

    private void MakeMoney() {
        System.out.println("To make money, you will need to go to the delivery\n"
                + "center, choose a delivery,and then make that delivery in the\n"
                + "delivery center.\n"); 
    }

    private void BuySupplies() {
        System.out.println("To purchase supplies you will need to go to the Mega\n"
                + "Store and the Camping Store. You will be able to select\n"
                + "an aisle and then purchase items in the store aisles.\n");   
    }
}
