/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 * @author Maxine
 */
public class MainMap implements Serializable {

    private int NUM_ROWS = 5;
    private int NUM_COLS = 5;
    private Location[][] locations;
    private String names;

    public MainMap() {

        int numRows = NUM_ROWS;
        int numCols = NUM_COLS;

        this.locations = new Location[numRows][numCols];

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                Location location = new Location();
                location.setCol(col);
                location.setRow(row);
                location.setVisited(false);

                locations[row][col] = location;
            }
        }

        locations[1][0].setName(LocationName.HOUSE);

        locations[1][1].setName(LocationName.DELIVERY_CENTER);

        locations[4][4].setName(LocationName.MEGA_STORE);

        locations[0][3].setName(LocationName.CAMPING_STORE);

    }

    public Location getStartingLocation() {
        return locations[1][0];
    }
    
    public Location getLocation(int row, int col) {
        return locations[row][col];
    }
    
    public int getNUM_ROWS() {
        return NUM_ROWS;
    }

    public void setNUM_ROWS(int NUM_ROWS) {
        this.NUM_ROWS = NUM_ROWS;
    }

    public int getNUM_COLS() {
        return NUM_COLS;
    }

    public void setNUM_COLS(int NUM_COLS) {
        this.NUM_COLS = NUM_COLS;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    ////////////////////////////////////////
    // METHODS
    ///////////////////////////////////////

    public String toString() {
        String rtn = "";

        for (int row = 0; row < locations.length; row++) {
            for (int col = 0; col < locations[0].length; col++) {
                if (locations[row][col] == null) {
                    rtn += "x  ";
                } else {
                    if (locations[row][col].getName() == null) {
                        rtn += "x  ";
                    } else {
                        rtn += locations[row][col].getName().getMapKey() + "  ";
                    }
                }
            }
            rtn += "\n";
        }
        return rtn;
    }

    public void initialize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
