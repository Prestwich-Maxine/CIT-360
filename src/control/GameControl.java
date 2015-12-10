/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Exception.GameControlException;
import hurricane_game.Hurricane_game;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import model.InventoryList;
import java.io.IOException;
import java.io.ObjectInputStream;
import model.Game;
import model.Location;
import model.Location.LocationName;
import model.MainMap;
import model.Player;
import view.WelcomeView;

/**
 *
 * @author maloriegomm
 */
public class GameControl {
    
    public static void createNewGame(Player player) {
        
        Game game = new Game();// create new game
        
        WelcomeView welcomeView = new WelcomeView();
        welcomeView.displayBanner();
        
        player.setName(welcomeView.getPlayerName());// set players name in player class
        
        welcomeView.displayPlayerNameBanner(player);
        game.setPlayer(player);// save player in game
   
        //MainMap map = MapControl.createMap();
        //game.setMap(map);
        }

    
    public static void getSavedGame(String filePath)
                        throws GameControlException {
        Game game = null;
        Player player = null;
        
        try( FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream output = new ObjectInputStream(fips);
            
            game = (Game) output.readObject();// read the game object from file
            player = (Player) output.readObject();
            
        }catch (FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        }
        catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        //close output file
        Hurricane_game.setCurrentGame(game); // save Hurricane_game
        }
    
    
    public static void saveGame(Game currentGame, Player currentPlayer, String filePath)
                        throws GameControlException {
    
        try( FileOutPutStream fops = new FileOutPutStream(filePath)) {
            ObjectOutPutStream output = new ObjectOutPutStream(fops);
            
            output.writeObject(currentGame); // write the game object out to the file
            output.writeObject(currentPlayer); // write the player object out to the file
            
        }catch(IOException e) {
            throw new GameControlException(e.getMessage());
        }
    }      
    
    
    public static InventoryList[] createItemsCurrent() {
        System.out.println("***Items the player currently has***");
        //this.console.println(this.message);
        return null;
    }
    
    
    public static InventoryList[] createItemsNeeded() {
        System.out.println("***Items the player still needs***");
        //this.console.println(this.message);
        return null;
    }
    
    
    public void assignNamesToLocations(MainMap map) {
      Location[][] locations = map.getLocations();
      locations[1][1].setLocations(LocationName.HOUSE);      
      locations[2][1].setLocations(LocationName.MEGA_STORE);
      locations[3][4].setLocations(LocationName.CAMPING_STORE);
      locations[1][3].setLocations(LocationName.DELIVERY_CENTER);
    }

    
    public void createNewGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    public void initializeMap() {
        
        
    }
}
    // Come back and figure out list. Need to create in items.
    /*public static Item[] createGameItemsList() {
        Item[] gameItemsList = new Item[50];
        
        Item tuna = new Item();
        tuna.setDescription("Tuna");
    
    }*/