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
/**
 * @author maloriegomm
 */
public class Hurricane_game {

    private static GameControl createNewGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
               
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
         try {
         mainView.display();
         } catch (Throwable te) {
             System.out.println(te.getMessage());
             te.printStackTrace();
             mainView.display();
         }
        
//        char in = mainView.getInput();
//        
//        System.out.println("YOU ENTERED " + in);

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
    

