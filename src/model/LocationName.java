/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Daniel
 */
public enum LocationName {

    HOUSE("House"),
    MEGA_STORE("Mega Store"),
    CAMPING_STORE("Camping Store"),
    DELIVERY_CENTER("Delivery Center");

    private final String positionName;
    private String getName;

    LocationName(String name) {
        this.positionName = name;
    }

    public String getName() {
        return this.positionName;
    }
    
    public String getMapKey() {
        return this.positionName.substring(0, 1);
    }

    @Override
    public String toString() {
        return this.getName;
    }
}
