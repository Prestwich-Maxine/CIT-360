/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author maloriegomm
 */
public class Player implements Serializable{
    
    private String name;
    private List<Item> inventory;
    private int money;
    private List<Deliveries> deliveries;
    public String itemsCurrent [];
    public int timeRemaining;
    public int currentSurvivalPoints;
    public int remainingSurvivalPoints;
    private Location location; 
    
    
    public Player() {
        inventory = new ArrayList<>();
        deliveries = new ArrayList<>();
    }

    public void addItemToInventory(Item i) {
        inventory.add(i);
    }
    
    public void addDelivery(Deliveries d) {
        deliveries.add(d);
    }
    
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
    public List<Deliveries> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Deliveries> deliveries) {
        this.deliveries = deliveries;
    }

    public String[] getItemsCurrent() {
        return itemsCurrent;
    }

    public void setItemsCurrent(String[] itemsCurrent) {
        this.itemsCurrent = itemsCurrent;
    }

    public int getCurrentSurvivalPoints() {
        return currentSurvivalPoints;
    }

    public void setCurrentSurvivalPoints(int currentSurvivalPoints) {
        this.currentSurvivalPoints = currentSurvivalPoints;
    }

    public int getRemainingSurvivalPoints() {
        return remainingSurvivalPoints;
    }

    public void setRemainingSurvivalPoints(int remainingSurvivalPoints) {
        this.remainingSurvivalPoints = remainingSurvivalPoints;
    }

    public int getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(int timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

  
    
    
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.name);
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + '}';
    }

    
    
}
