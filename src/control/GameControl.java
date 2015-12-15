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
import model.Item;
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
        player.setTimeRemaining(72);
        player.setMoney(500);
        game.setNeededSurvivalPoints(800);
        game.setPlayer(player);

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

    public static Item[] getAllItems() {

        /*for (Item product : Item.values()) {
            System.out.println(product);
        }*/

        System.out.println("Food:");
        
        System.out.println(Item.BEANS.getItemDescription() + " $"
                + Item.BEANS.getItemCost() + " " + Item.BEANS.getSurvivalPoints());
        
        System.out.println(Item.BREAD.getItemDescription() + " $" +
                Item.BREAD.getItemCost() + " " + Item.BREAD.getSurvivalPoints());
        
        System.out.println(Item.CANDY.getItemDescription() +" $" +
                Item.CANDY.getItemCost() + " " + Item.CANDY.getSurvivalPoints());
        
        System.out.println(Item.FRUIT.getItemDescription() +" $" +
                Item.FRUIT.getItemCost() + " " + Item.FRUIT.getSurvivalPoints());
        
        System.out.println(Item.TUNA.getItemDescription() +" $" +
                Item.TUNA.getItemCost() + " " + Item.TUNA.getSurvivalPoints());
        
        System.out.println(Item.VEGETABLES.getItemDescription() +" $" +
                Item.VEGETABLES.getItemCost() + " " + Item.VEGETABLES.getSurvivalPoints());
        
        System.out.println(Item.CHOCOLATE.getItemDescription() +" $" +
                Item.CHOCOLATE.getItemCost() + " " + Item.CHOCOLATE.getSurvivalPoints());
        
        System.out.println(Item.COOKIES.getItemDescription() +" $" +
                Item.COOKIES.getItemCost() + " " + Item.COOKIES.getSurvivalPoints());
        
        System.out.println(Item.CRACKERS.getItemDescription() +" $" +
                Item.CRACKERS.getItemCost() + " " + Item.CRACKERS.getSurvivalPoints());
        
        System.out.println(Item.GRANOLA_BARS.getItemDescription() +" $" +
                Item.GRANOLA_BARS.getItemCost() + " " + Item.GRANOLA_BARS.getSurvivalPoints());
        
        System.out.println(Item.PROTEIN_BAR.getItemDescription() +" $" +
                Item.PROTEIN_BAR.getItemCost() + " " + Item.PROTEIN_BAR.getSurvivalPoints());
        
        System.out.println(Item.WATER.getItemDescription() +" $" +
                Item.WATER.getItemCost() + " " + Item.WATER.getSurvivalPoints() + "\n");
        
        System.out.println("Clothes:");
        
        System.out.println(Item.JACKET.getItemDescription() +" $" +
                Item.JACKET.getItemCost() + " " + Item.JACKET.getSurvivalPoints());
        
        System.out.println(Item.SHOES.getItemDescription() +" $" +
                Item.SHOES.getItemCost() + " " + Item.SHOES.getSurvivalPoints());
        
        System.out.println(Item.CANDY.getItemDescription() +" $" +
                Item.CANDY.getItemCost() + " " + Item.CANDY.getSurvivalPoints());

        System.out.println(Item.SWEATSHIRT.getItemDescription() +" $" +
                Item.SWEATSHIRT.getItemCost() + " " + Item.SWEATSHIRT.getSurvivalPoints() + "\n");
        
        System.out.println("Camping/Survival:");
        
        System.out.println(Item.TARP.getItemDescription() +" $" +
                Item.TARP.getItemCost() + " " + Item.TARP.getSurvivalPoints());

        System.out.println(Item.TENT.getItemDescription() +" $" +
                Item.TENT.getItemCost() + " " + Item.TENT.getSurvivalPoints());

        System.out.println(Item.CAMP_STOVE.getItemDescription() +" $" +
                Item.CAMP_STOVE.getItemCost() + " " + Item.CAMP_STOVE.getSurvivalPoints());
        
        System.out.println(Item.FUEL.getItemDescription() +" $" +
                Item.FUEL.getItemCost() + " " + Item.FUEL.getSurvivalPoints());
        
        System.out.println(Item.HYGIENE_KIT.getItemDescription() +" $" +
                Item.HYGIENE_KIT.getItemCost() + " " + Item.HYGIENE_KIT.getSurvivalPoints() +"\n");
        
        System.out.println("Personal Care:");
        
        System.out.println(Item.MEDICINE.getItemDescription() +" $" +
                Item.MEDICINE.getItemCost() + " " + Item.MEDICINE.getSurvivalPoints());

        System.out.println(Item.TOILET_PAPER.getItemDescription() +" $" +
                Item.TOILET_PAPER.getItemCost() + " " + Item.TOILET_PAPER.getSurvivalPoints());

        return null;
    }

    public static InventoryList[] createItemsCurrent() {

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
