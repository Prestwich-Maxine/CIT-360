/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import hurricane_game.Hurricane_game;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import model.Game;
import model.InventoryList;
import model.Item;
import model.Items;
import model.Location;
import model.Location.LocationName;
import model.MainMap;
import model.Player;
import view.MainMenuView;
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
   
        MainMap map = MapControl.createMap();
        game.setMap(map);
        }

    public static void getLoadGame(String filePath) {
        throws GameControlException {
        
        Game game = null;
        
        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream output = new ObjectInputStream(fips);
            
            game = (Game) output.readObject(); // read the game object from file
        }
        catch (FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        }
        catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        //close output file
        Hurricane_game.setCurrentGame(game); // save Hurricane_game
    }
    }
    
    public void static saveGame(Game game, String filePath) {
        throws GameControlException {
    
        try (FileOutPutStream fops = new FileOutPutStream(filePath)) {
            ObjectOutPutStream output = new ObjectOutPutStream(fops);
            
            output.writeObject(game); // write the game object out to the file
        
        } catch (IOException e) {
            throw new GameControlException(e.getMessage());
        }
    }  
    
    }
    
    /*
    Playing around with createItemList method. I think I want to put the items 
    in their appropriate stores
    */
    public static Items[] createItemList() {
        Items[] itemList = new Items[26];
        
        Items tuna = new Items();
        tuna.setName("Tuna");
        tuna.setItemCost(1);
        tuna.setSurvivalPoints(10);
        tuna.setCategoryName("Protein");
        itemList[0] = tuna;
        
        Items protein_bar = new Items();
        protein_bar.setName("Protein Bar");
        protein_bar.setItemCost(1);
        protein_bar.setSurvivalPoints(10);
        protein_bar.setCategoryName("Protein");
        itemList[1] = protein_bar;
        
        Items beans = new Items();
        beans.setName("Beans");
        beans.setItemCost(1);
        beans.setSurvivalPoints(10);
        beans.setCategoryName("Protein");
        itemList[2] = beans;
         
        Items chocolate = new Items();
        chocolate.setName("Chocolate");
        chocolate.setItemCost(2);
        chocolate.setSurvivalPoints(10);
        chocolate.setCategoryName("Sweets and Sugars");
        itemList[3] = chocolate;
        
        Items cookies = new Items();
        cookies.setName("Cookies");
        cookies.setItemCost(3);
        cookies.setSurvivalPoints(10);
        cookies.setCategoryName("Sweets and Sugars");
        itemList[4] = cookies;
        
        Items candy = new Items();
        candy.setName("Sweets and Sugars");
        candy.setItemCost(1);
        candy.setSurvivalPoints(10);
        candy.setCategoryName("Kitchen");
        itemList[5] = candy;
        
        Items crackers = new Items();
        crackers.setName("Crackers");
        crackers.setItemCost(3);
        crackers.setSurvivalPoints(5);
        crackers.setCategoryName("Carbohydrates");
        itemList[6] = crackers;
        
        Items chips = new Items();
        chips.setName("Chips");
        chips.setItemCost(3);
        chips.setSurvivalPoints(5);
        chips.setCategoryName("Carbohydrates");
        itemList[7] = chips;
        
        Items jacket = new Items();
        jacket.setName("Jacket");
        jacket.setItemCost(20);
        jacket.setSurvivalPoints(50);
        jacket.setCategoryName("Apparel");
        itemList[8] = jacket;
        
        Items sweatshirt = new Items();
        sweatshirt.setName("Sweatshirt");
        sweatshirt.setItemCost(25);
        sweatshirt.setSurvivalPoints(50);
        sweatshirt.setCategoryName("Apparel");
        itemList[9] = sweatshirt;
        
        Items shoes = new Items();
        shoes.setName("Shoes");
        shoes.setItemCost(20);
        shoes.setSurvivalPoints(50);
        shoes.setCategoryName("Apparel");
        itemList[10] = shoes;
        
        Items hygiene_kit = new Items();
        hygiene_kit.setName("Hygiene kit");
        hygiene_kit.setItemCost(10);
        hygiene_kit.setSurvivalPoints(30);
        hygiene_kit.setCategoryName("Toiletries");
        itemList[11] = hygiene_kit;
        
        Items toilet_paper = new Items();
        toilet_paper.setName("Toilet paper");
        toilet_paper.setItemCost(5);
        toilet_paper.setSurvivalPoints(20);
        toilet_paper.setCategoryName("Toiletries");
        itemList[12] = toilet_paper;
        
        Items medicine = new Items();
        medicine.setName("Medicine");
        medicine.setItemCost(5);
        medicine.setSurvivalPoints(30);
        medicine.setCategoryName("Toiletries");
        itemList[13] = medicine;
        
        Items tent = new Items();
        tent.setName("Tent");
        tent.setItemCost(50);
        tent.setSurvivalPoints(100);
        tent.setCategoryName("Tent");
        itemList[14] = tent;
        
        Items canopy = new Items();
        canopy.setName("Canopy");
        canopy.setItemCost(30);
        canopy.setSurvivalPoints(100);
        canopy.setCategoryName("Tent");
        itemList[15] = canopy;
        
        Items flashlight = new Items();
        flashlight.setName("Flashlight");
        flashlight.setItemCost(10);
        flashlight.setSurvivalPoints(20);
        flashlight.setCategoryName("Lighting");
        itemList[16] = flashlight;
        
        Items lantern = new Items();
        lantern.setName("Lighting");
        lantern.setItemCost(15);
        lantern.setSurvivalPoints(25);
        lantern.setCategoryName("Lighting");
        itemList[17] = lantern;
        
        Items candles = new Items();
        candles.setName("Candles");
        candles.setItemCost(5);
        candles.setSurvivalPoints(10);
        candles.setCategoryName("Lighting");
        itemList[18] = candles;
        
        Items matches = new Items();
        matches.setName("Matches");
        matches.setItemCost(1);
        matches.setSurvivalPoints(10);
        matches.setCategoryName("Lighting");
        itemList[19] = matches;
        
        Items batteries = new Items();
        batteries.setName("Batteries");
        batteries.setItemCost(10);
        batteries.setSurvivalPoints(20);
        batteries.setCategoryName("Lighting");
        itemList[20] = batteries;
        
        Items stove = new Items();
        stove.setName("Stove");
        stove.setItemCost(25);
        stove.setSurvivalPoints(60);
        stove.setCategoryName("Cooking Supplies");
        itemList[21] = stove;
        
        Items grill = new Items();
        grill.setName("Grill");
        grill.setItemCost(20);
        grill.setSurvivalPoints(50);
        grill.setCategoryName("Cooking Supplies");
        itemList[22] = grill;
        
        Items propane = new Items();
        propane.setName("Propane");
        propane.setItemCost(10);
        propane.setSurvivalPoints(20);
        propane.setCategoryName("Cooking Supplies");
        itemList[23] = propane;
        
        Items charcoal = new Items();
        charcoal.setName("Charcoal");
        charcoal.setItemCost(10);
        charcoal.setSurvivalPoints(20);
        charcoal.setCategoryName("Cooking Supplies");
        itemList[24] = charcoal;
        
        Items water = new Items();
        water.setName("Water");
        water.setItemCost(5);
        water.setSurvivalPoints(15);
        water.setCategoryName("Water");
        itemList[25] = water;
        
        return itemList;
    }
    
    public void initializeMap() {
        
        
    }
    
    public void saveGame() {
    
    }
    
    public void getCurrentGame() {
    
    }
    // Come back and figure out list. Need to create in items.
    /*public static Item[] createGameItemsList() {
        Item[] gameItemsList = new Item[50];
        
        Item tuna = new Item();
        tuna.setDescription("Tuna");
    
    }*/
    
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
    
    
    
    
    /*public enum LocationNames{ // delete, it's in location
        house,
        mega_store, 
        camping_store,
        delivery_center; 
    }*/
    
    
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
}
