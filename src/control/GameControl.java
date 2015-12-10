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
import java.io.FileOutputStream;
import model.InventoryList;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import model.Game;
import model.MainMap;
import model.Player;
import view.WelcomeView;

/**
 *
 * @author maloriegomm
 */
public class GameControl {

    public static void createNewGame() {

        Game.setInstance(null);
        Game game = Game.getInstance();
        Player player = new Player();
        player.setTimeRemaining(120);
        game.setPlayer(player);

        WelcomeView welcomeView = new WelcomeView();
        welcomeView.displayBanner();

        player.setName(welcomeView.getPlayerName());// set players name in player class

        welcomeView.displayPlayerNameBanner(player);
        game.setPlayer(player);// save player in game

        MainMap map = new MainMap();
        game.setMap(map);
        
        player.setLocation(map.getStartingLocation());
    }

    public static void getSavedGame(String filePath)
            throws GameControlException {
        Game game = null;
        Player player = null;

        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream output = new ObjectInputStream(fips);

            game = (Game) output.readObject();// read the game object from file
            player = (Player) output.readObject();

        } catch (FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        //close output file
        Hurricane_game.setCurrentGame(game); // save Hurricane_game
    }

    public static void saveGame(Game currentGame, Player currentPlayer, String filePath)
            throws GameControlException {

        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(currentGame); // write the game object out to the file
            output.writeObject(currentPlayer); // write the player object out to the file

        } catch (IOException e) {
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

    public void initializeMap() {

    }
}
    // Come back and figure out list. Need to create in items.
    /*public static Item[] createGameItemsList() {
 Item[] gameItemsList = new Item[50];
        
 Item tuna = new Item();
 tuna.setDescription("Tuna");
    
 }*/
