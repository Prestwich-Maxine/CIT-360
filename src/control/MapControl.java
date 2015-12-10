/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Exception.MapException;
import model.Game;
import model.Location;
import model.MainMap;
import model.Player;

/**
 *
 * @author maloriegomm
 */
public class MapControl {

    // a set time deduction for everytime the player moves ( - 30 minutes)
    public void deductTime(Player p) {

        int deduction = 30;
        int newTimeRemaining = p.getTimeRemaining() - deduction;

        p.setTimeRemaining(newTimeRemaining);
    }

    public boolean movePlayer(Player p, MainMap m, int newRow, int newCol) throws MapException {

        if (p.getLocation() == null) {
            throw new MapException("Player has not been set to a location yet");
        }
        
        if(newRow > m.getLocations().length || newRow < 0) {
            throw new MapException("Cannot move to that row - it is outside of the city");
        }
        
        if(newCol > m.getLocations()[0].length || newCol < 0) {
            throw new MapException("Cannot move to that col - it is outside of the city");
        }
        
        Location currentLocation = p.getLocation();
        Location newLocation = m.getLocation(newRow, newCol);
        
        //TODO calculate distance
        deductTime(p);

        p.setLocation(newLocation);
        
        if(p.getTimeRemaining() <= 0) {
            return false;
        }
        
        return true;
    }

//    private int row;
//    private int col;
//    private Location[][] locations;
//    
//    public static MainMap createMap(Player player) {
//        
//        MainMap map = new MainMap(3, 4);
//        
//        map.initialize();
//        
//        player.setLocation(map.getLocations()[1][1]);
//        
//        return map;
//        
//        Location location = createLocation();
//        
//        //Scene[] scenes = createScenes();
//        GameControl gameControl = new GameControl();
//        gameControl.assignNamesToLocations(map);
//        return map;
//    }
//
//    
//    private static Location createLocation() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    /*public Map() {
        
     }
     //public MainMap (int row, int col) {
    
        
     }*/
}
