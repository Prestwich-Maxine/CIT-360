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
import view.DeliveryCenterView;

/**
 *
 * @author maloriegomm
 */
public class MapControl {

    // a set time deduction for everytime the player moves ( - 30 minutes)
    public void deductTime(Player p) {

        int deduction = 1;
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
        
       
       
        if(p.getTimeRemaining() <= 0) {
            System.out.println("You are out of TIME!"
                    + "The hurricane is about to hit and you will be move to the House to see if you survived the Hurricane.");
           
            p.setLocation(m.getStartingLocation());
            //check to see is player won
                int currentSP = Game.getInstance().getPlayer().getCurrentSurvivalPoints();
                int neededSP = Game.getInstance().getNeededSurvivalPoints();
                int remainingSP = neededSP - currentSP;

                if (currentSP < 800) {
                    System.out.println("You currently have: "
                            + "" + currentSP + " Survival Points");
                    System.out.println("You needed to have at least 800 Survival Points to survive the hurricane..."
                            + "Unfortunatly you did NOT survive the hurricane!"
                            + "GAME OVER");
                } else {
                    System.out.println("You currently have: "
                            + "" + currentSP + " Survival Points");
                    System.out.println("You needed at least 800 Survival Points to survive the hurricane..."
                            + "It looks like you SURVIVED the hurricane!!!"
                            + "CONGRATULATIONS!  YOU'VE WON.");
                }
            return false;
            
            // How do we actually end the game??
            
        } else{
            //TODO calculate distance
            deductTime(p);

            p.setLocation(newLocation);
            
              if(newRow == 4 && newCol == 4) {
            //Do all the mega store stuff HERE!!!
                  
            }
         
            if(newRow == 1 && newCol == 1) {
            //Do all the Delivery Center stuff HERE!!!
                
                System.out.println("You are now in the DELVIERY CENTER!!");

                DeliveryCenterView deliveryMenu = new DeliveryCenterView();
                deliveryMenu.display();
            }
           if(newRow == 0 && newCol == 3) {
            //Do all the Camping store stuff HERE!!!
            }
            if(newRow == 1 && newCol == 0) {
            //Do all the House stuff HERE!!!
            }  
            
            return true;
        }
        
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
