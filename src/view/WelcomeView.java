/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import model.Player;

/**
 *
 * @author maloriegomm
 */
public class WelcomeView {
   
    public WelcomeView(){
        
    }
    
    public void displayBanner(){
        
        System.out.println("*********************************");
        System.out.println("The tropical storm in the news has just been upgraded to Hurricane Patty.");
        System.out.println("It is expected to reach your city in 72 hours.");
        System.out.println("you need to make sure you have enough food and supplies");
        System.out.println("to survive the hurricane and it's after math.");
        System.out.println("See what you have at home, and then proceed to the stores");
        System.out.println("to purchase what you need.");
        System.out.println("Remember, you are in a race against time. It will");
        System.out.println("It will cost you half an hour of your time everytime you move location, so use your time wisely!");
        System.out.println("Good luck!");
        System.out.println("************************************");
        
    }
    
    public String getPlayerName(){
        
        //Scanner in = new Scanner(System.in);
        String name = "";
        
        while(name.length() < 2) {
            System.out.println("Please Enter Your Name:");
            //name = keyboard.readLine();
            
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
