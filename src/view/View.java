/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import hurricane_game.Hurricane_game;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Maxine
 */
public abstract class View implements ViewInterface {
    
    private String menu;
    
    protected final BufferedReader keyboard = Hurricane_game.getInFile();
    protected final PrintWriter console = Hurricane_game.getOutFile();
    
    public View(String menuString) {
       menu = menuString; 
    }
    
    @Override
    public void display() {
        boolean cont;
        
        do {
        
            System.out.println(menu);
        
            char in = getInput();
        
            cont = doAction(in);
        } while (cont);
    
    }
        
    @Override
     public char getInput() {
     
        //Scanner in = new Scanner(System.in);
        
        String input = "";
        char rtn = 0;
        try {
        while(input.length() < 1){
            input = keyboard.readLine();
            
            if(input.length() < 1){
                System.out.println("Please select an option");
            } else {
                rtn = input.toUpperCase().charAt(0);
            }
        }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        
        return rtn;
     }
}
