/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Exception.MapException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author maloriegomm
 */
public class Game implements Serializable {

    private Player player;
    private MainMap map;
    private Item[] gameItemList;
    private InventoryList[] itemsList;//can be an Enum or Array because it doesn't need to grow or shrink
    private InventoryList[]itemsNeeded;
    public int neededSurvivalPoints;

    
    private static Game instance;
    
    private Game() {
        
    }
    
    public static Game getInstance() {
        if(instance == null) {
            instance = new Game();
        }
        
        return instance;
    }
    
    public static void setInstance(Game loadedGame) {
        instance = loadedGame;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public MainMap getMap() {
        return map;
    }

    public void setMap(MainMap map) {
        this.map = map;
    }

    public Item[] getGameItemList() {
        return gameItemList;
    }

    public void setGameItemList(Item[] gameItemList) {
        this.gameItemList = gameItemList;
    }

    public int getNeededSurvivalPoints() {
        return neededSurvivalPoints;
    }

    public void setNeededSurvivalPoints(int neededSurvivalPoints) {
        this.neededSurvivalPoints = neededSurvivalPoints;
    }
    

    public InventoryList[] getItemsList() {
        return itemsList;
    }

    public void setItemsList(InventoryList[] itemsList) {
        this.itemsList = itemsList;
    }
       
    public InventoryList[] getItemsNeeded() {
        return itemsNeeded;
    }

    public void setItemsNeeded(InventoryList[] itemsNeeded) {
        this.itemsNeeded = itemsNeeded;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.player);
        hash = 61 * hash + Objects.hashCode(this.map);
        hash = 61 * hash + Arrays.deepHashCode(this.gameItemList);
        hash = 61 * hash + Arrays.deepHashCode(this.itemsList);
        hash = 61 * hash + Arrays.deepHashCode(this.itemsNeeded);
        hash = 61 * hash + this.neededSurvivalPoints;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Arrays.deepEquals(this.gameItemList, other.gameItemList)) {
            return false;
        }
        if (!Arrays.deepEquals(this.itemsList, other.itemsList)) {
            return false;
        }
        if (!Arrays.deepEquals(this.itemsNeeded, other.itemsNeeded)) {
            return false;
        }
        if (this.neededSurvivalPoints != other.neededSurvivalPoints) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "player=" + player + ", map=" + map + ", gameItemList=" + gameItemList + ", itemsList=" + itemsList + ", itemsNeeded=" + itemsNeeded + ", neededSurvivalPoints=" + neededSurvivalPoints + '}';
    }
    
   
    ///////////////////////////////////////////////
    // METHODS
    ///////////////////////////////////////////////
    /* Need to set survival points, budget, calculate earned money, remaining time,
     and points earned
     */
    
    
   public int calcTimeRemaining(int timeRemaining, int timeToDeduct, int deliveryTime) throws MapException {
        
        if(timeRemaining < 0) {
		throw new MapException("Time is less than 0");
        }
                
	if((deliveryTime + timeToDeduct > timeRemaining) || (deliveryTime + timeToDeduct < 0)){
		throw new MapException("You do not have enough time left");
        }
        
	timeRemaining = timeRemaining - (deliveryTime + timeToDeduct);
        
	return timeRemaining;
    }
    
   
}

