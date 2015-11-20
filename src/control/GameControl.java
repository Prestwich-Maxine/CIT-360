/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Scanner;
import model.Game;
import model.InventoryList;
import model.Location;
import model.MainMap;
import model.Player;
import view.MainMenuView;
import view.WelcomeView;

/**
 *
 * @author maloriegomm
 */
public class GameControl {
    
    public void createNewGame() {
        
        Game game = new Game();// create new game
        Player player = new Player();// create new player
        
        WelcomeView welcomeView = new WelcomeView();
        welcomeView.displayBanner();
        
        player.setName(welcomeView.getPlayerName());// set players name in player class
        
        welcomeView.displayPlayerNameBanner(player);
        game.setPlayer(player);// save player in game
   
        MainMap map = MapControl.createMap();
        game.setMap(map);
        
        
        
        
       
        
    }
    
    public void initializeMap() {
        
        
    }
    
    public void saveGame() {
    
    }
    
    public void retrieveGame() {
    
    }
    
    public void createItemsList() {
            
    }  
    
    public enum LocationNames{
        house,
        mega_store, 
        camping_store,
        delivery_center; 
    }
    
    
    private void assignNamesToLocations(MainMap map, LocationNames[] names){
      Location[][]  locations = map.getLocations();
      
      locations[1][1].setName(names[LocationNames.house.ordinal()]);
      locations[2][1].setName(names[LocationNames.mega_store.ordinal()]);
      locations[3][4].setName(names[LocationNames.camping_store.ordinal()]);
      locations[1][3].setName(names[LocationNames.delivery_center.ordinal()]);
    }
}
