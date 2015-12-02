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
    
    private int NUM_ROWS = 2;
    private int NUM_COLS = 2;
    private Location[][] locations;
    private String names;

    public MainMap() {
//        locations = new Location[NUM_ROWS][NUM_COLS];
    }

    public MainMap(int NUM_ROWS, int NUM_COLS) {
        
        if (NUM_ROWS < 1 || NUM_COLS < 1) {
            System.out.println("The number of rows and columns must be greater than 0");
            return;
        }
     
        this.NUM_ROWS = NUM_ROWS;
        this.NUM_COLS = NUM_COLS;
        
        this.locations = new Location[NUM_ROWS][NUM_COLS];
        
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                Location location  = new Location();
                location.setCol(NUM_COLS);
                location.setRow(NUM_ROWS);
                location.setVisited(false);
                
                locations[NUM_ROWS][NUM_COLS] = location;
            }
        }
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
    
//    public String toString() {
//        String rtn = "";
//        
//        for(int row = 0; row < NUM_ROWS; row++) {
//           for(int col = 0; col < NUM_COLS; col++) {
//               if (locations[row][col] == null) {
//                   System.out.println("x ");
//               }
//           }
//        }
//        return null;
//    }
    
    
    //this is just me trying to get something to show up it's just 12 "x " when you run the 
    //Hurricane_game file
    public String toString() {
        String rtn = "";
        
        for(int row = 0; row < NUM_ROWS; row++) {
            for(int col = 0; col < NUM_COLS; col++) {
                if(locations[row][col] == null) {
                    rtn += "x  ";
                }
                else{
                   rtn += "x  "; 
                }
            }
            rtn += "\n";
        }
        return rtn + "this worked";
    }
    
    
//    public void initialize() {
//      
//        for(int row = 0; row < NUM_ROWS; row++) {
//            for(int col = 0; col < NUM_COLS; col++) {
//                Location locations = new Location();
//                locations.setCol(col);
//                locations.setRow(row);
//                
//                locations[row][col] = locations;
//            }
//        }
//        
//    }

    public void initialize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}