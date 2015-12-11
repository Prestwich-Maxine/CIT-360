/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author maloriegomm
 */
public class InventoryList implements Serializable{
    
    public String itemsCurrent [];
    private String itemsNeeded [];//can be an Enum or Array because it doesn't need to grow or shrink


    
    public InventoryList() {
        
    }

     public String[] getItemsCurrent() {
        return itemsCurrent;
    }

    public void setItemsCurrent(String[] itemsCurrent) {
        this.itemsCurrent = itemsCurrent;
    }

    public String[] getItemsNeeded() {
        return itemsNeeded;
    }

    public void setItemsNeeded(String[] itemsNeeded) {
        this.itemsNeeded = itemsNeeded;
    }

     @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Arrays.deepHashCode(this.itemsCurrent);
        hash = 17 * hash + Arrays.deepHashCode(this.itemsNeeded);
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
        final InventoryList other = (InventoryList) obj;
        if (!Arrays.deepEquals(this.itemsCurrent, other.itemsCurrent)) {
            return false;
        }
        if (!Arrays.deepEquals(this.itemsNeeded, other.itemsNeeded)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "InventoryList{" + "itemsCurrent=" + itemsCurrent + ", itemsNeeded=" + itemsNeeded + '}';
    }


    ////////////////////////////////////
    //METHODS
    ////////////////////////////////////

   
   
}
