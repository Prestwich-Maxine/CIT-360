/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Exception.MapException;
import control.GameControl;
import java.util.Scanner;
import model.MainMap;

/**
 *
 * @author Maxine
 */
public class GameMenuView extends View{
    
     public GameMenuView() {
        super("M - Map of town\n"
              + "S - Supplies list\n"
              + "I - Inventory list\n"
              + "L - Move to a new location\n"
              + "D - View deliveries\n"
              + "V - View what location has\n"
              + "A - Money Accounts\n"
              + "P - Survival Points Earned\n"
              + "T - Time before hurricane\n"
              + "C - Enter Delivery Center\n"//This is just for me to test the DeliveryCenterView
              + "R - Enter House\n"
              + "H - Help Menu\n"
              + "X - Exit to Main Menu\n");
    }
    
    
     @Override
    public boolean doAction(char input) {
    
        switch (input) {
            case 'M':
                displayMap();
                break;
            case 'I':
                inventoryList();
                break;
            case 'L':
                moveToNewLocation();
                break;
            case 'D':
                viewDeliveries();
                break;
            case 'V':
                viewLocationItems();
                break;
            case 'A':
                moneyAccount();
            case 'P':
                survivalPointsEarned();
                break;
            case 'T':
                timeRemaining();
                break;
            case 'H':
                showHelpMenu();
                break;
            case 'C':
                showDeliveryCenter();
                break;
            case 'R':
                showHouse();
                break;
            case 'X':
                return false;
            default:
                System.out.println("Please select a valid input.");
                break;
            }
            return true;
        
        }

    private void displayMap() {
//        MainMap map = new MainMap();
//        map.toString();
//        
////        MapView viewMap = new MapView();
////        viewMap.display();
    }

    private void suppliesList() {
        System.out.println("NOT IMPLEMENTED YET");
        }

    private void inventoryList() {
        System.out.println("NOT IMPLEMENTED YET"); 
    }

    
    
    private void moveToNewLocation() {
    
        System.out.println("Every time you move location, 30 minutes will be duducted from your remaining time until the Hurricane.");
        //Display map graphic
        
        MapView mapView = new MapView();
        mapView.display();
    }

    private void deliverSupplies() {
        System.out.println("NOT IMPLEMENTED YET");
        
    }

    private void viewDeliveries() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void viewLocationItems() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void moneyAccount() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void survivalPointsEarned() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void timeRemaining() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void showHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
     private void showDeliveryCenter() {
        DeliveryCenterView deliveryCenter = new DeliveryCenterView();
        deliveryCenter.display();
    }
        
    private void displayGameMenu() {
        
    }   

    private void showHouse() {
       HouseView house = new HouseView();
       house.display(); 
    }
}
