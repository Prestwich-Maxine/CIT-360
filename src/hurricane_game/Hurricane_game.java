/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hurricane_game;

import model.Player;
import view.MainMenuView;
import view.WelcomeView;
import model.StoreAislesCamping;
import model.StoreCamping;
import view.StoreMegaAislesView;
import control.GameControl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author maloriegomm
 */
public class Hurricane_game {

    private static GameControl createNewGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;
    
    public static void main(String[] args) {
        
        try {
            
            // open character stream files for end user input and output
            Hurricane_game.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            
            Hurricane_game.outFile = new PrintWriter(System.out, true);
        
        try {
            // open log file
            String filePath = "log.txt";
            Hurricane_game.logFile = new PrintWriter(filePath);
            
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString() +
                    "\nCause: " + e.getCause() +
                    "\nMessage: " + e.getMessage());
        }
               
//        Player player = new Player();
//        
//        WelcomeView welcomeView = new WelcomeView();
//        welcomeView.displayBanner();
//        
//        player.setName(welcomeView.getPlayerName());
//        
//        welcomeView.displayPlayerNameBanner(player);
//        
         MainMenuView mainView = new MainMenuView();
         mainView.display();
         return;
         
        } catch (Throwable e) {
             System.out.println("Exception: " + e.toString() +
                     "\nCause: " + e.getCause() +
                     "\nMessage: " + e.getMessage());
             e.printStackTrace();;
        }
        
        finally {
            try {
                if (Hurricane_game.inFile != null)
                    Hurricane_game.inFile.close();
                
                if (Hurricane_game.outFile != null)
                    Hurricane_game.outFile.close();
                
                if (Hurricane_game.logFile != null)
                    Hurricane_game.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
            
        }
         
//        char in = mainView.getInput();
//        
//        System.out.println("YOU ENTERED " + in);

        }
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Hurricane_game.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Hurricane_game.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Hurricane_game.logFile = logFile;
    }
    
}
    
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//      Player playerOne = new Player(); 
//      
//      // This is just a test to see if the Player function works
//      playerOne.setName("Fred Flintstone");
//      
//      String playerInfo = playerOne. toString();
//      System.out.println(playerInfo);
//      
//      MainMap mainMap = new MainMap();
//        mainMap.initialize();
//        
//        System.out.println(mainMap.toString());
//      
//    }
    

