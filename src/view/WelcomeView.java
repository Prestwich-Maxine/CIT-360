/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import hurricane_game.Hurricane_game;
import java.io.BufferedReader;
import java.util.Scanner;
import model.Player;

/**
 *
 * @author maloriegomm
 */
public class WelcomeView {
   
    protected final BufferedReader keyboard = Hurricane_game.getInFile();
    
    public WelcomeView(){
        
    }
    
    public void displayBanner(){
        
        System.out.println("*********************************");
        System.out.println("The tropical storm in the news has just been upgraded to Hurricane Patty.");
        System.out.println("It is expected to reach your city in 3 days or 72 hours.");
        System.out.println("You need to make sure you have enough food and supplies");
        System.out.println("to survive the hurricane and its after math.");
        System.out.println("See what you have at home, and then proceed to the stores");
        System.out.println("to purchase what you need. Remember, you are in a race against");
        System.out.println("time. It will cost you one hour each time you move locations,");
        System.out.println("so use your time wisely!");
        System.out.println("Good luck!");
        System.out.println("************************************");
        
    }
    
    public String getPlayerName(){
        
        Scanner in = new Scanner(System.in);
        String name = "";
        
        while(name.length() < 2) {
            System.out.println("Please Enter Your Name:");
//          I know that we need to make this class extend the view class
//          but I don't know how to set it up without more errors'
            try {
                name = keyboard.readLine();
            } catch (java.io.IOException ioe) {
                ioe.printStackTrace();
            }
            
            if(name.length() < 2){
                System.out.println("Please Enter a name with at least 2 characters.");
            }
        }
               
        
        return name;
    }
    
    public void displayPlayerNameBanner(Player player){
     
        System.out.println("************************************");
        System.out.println("Welcome " + player.getName() + "!");
        System.out.println("Enjoy the Game!");
        System.out.println("************************************");
    }
     
}
