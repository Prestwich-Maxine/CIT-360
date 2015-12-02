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
    private InventoryList survivalPoints;
    private Item[] gameItemList;
    private InventoryList[] itemsList;//can be an Enum or Array because it doesn't need to grow or shrink
    private InventoryList[]itemsNeeded;
    public InventoryList neededSurvivalPoints;

    public Game() {
        
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

    public InventoryList getSurvivalPoints() {
        return survivalPoints;
    }

    public void setSurvivalPoints(InventoryList survivalPoints) {
        this.survivalPoints = survivalPoints;
    }

    public InventoryList getNeededSurvivalPoints() {
        return neededSurvivalPoints;
    }

    public void setNeededSurvivalPoints(InventoryList neededSurvivalPoints) {
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
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.player);
        hash = 13 * hash + Objects.hashCode(this.survivalPoints);
        hash = 13 * hash + this.timeRemaining;
        hash = 13 * hash + this.numberOfPointsEarned;
        hash = 13 * hash + Arrays.deepHashCode(this.itemsList);
        hash = 13 * hash + Arrays.deepHashCode(this.itemsNeeded);
        hash = 13 * hash + Objects.hashCode(this.neededSurvivalPoints);
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
        if (!Objects.equals(this.survivalPoints, other.survivalPoints)) {
            return false;
        }
        if (this.timeRemaining != other.timeRemaining) {
            return false;
        }
        if (this.numberOfPointsEarned != other.numberOfPointsEarned) {
            return false;
        }
        if (!Arrays.deepEquals(this.itemsList, other.itemsList)) {
            return false;
        }
        if (!Arrays.deepEquals(this.itemsNeeded, other.itemsNeeded)) {
            return false;
        }
        if (!Objects.equals(this.neededSurvivalPoints, other.neededSurvivalPoints)) {
            return false;
        }
        return true;
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

