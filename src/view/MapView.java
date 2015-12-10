/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Exception.MapException;
import control.MapControl;
import model.MainMap;
import model.Player;

/**
 *
 * @author maloriegomm
 */
public class MapView extends View {

    public MapView() {
        super("H - House\n"
                + "C - Camping Store\n"
                + "M - Mega Store\n"
                + "D - Delivery Center\n"
                + "X - Return to Game Menu\n");
    }

    @Override
    public boolean doAction(char input) {

        switch (input) {
            case 'H':
                movePlayerHouse();
                break;
            case 'C':
                movePlayerCampingStore();
                break;
            case 'M':
                movePlayerMegaStore();
                break;
            case 'D':
                movePlayerDeliveryCenter();
                break;
            case 'X':
                return false;
            default:
                System.out.println("Please select a valid location input.");
                break;
        }
        return true;

    }

    private void movePlayerHouse() {
//        try {
//            System.out.println("NOT FULLY IMPLEMENTED YET");
//            //set location corrdinants to house
//            MapControl mapControl = new MapControl(); //Create the instance of map control
//            mapControl.movePlayer(p, m);
//        } catch (MapException me) {
//            System.out.println(me.getMessage());
//        }
    }

    private void movePlayerCampingStore() {
//        try {
//            System.out.println("NOT FULLY IMPLEMENTED YET");
//            //set location corrdinants to house
//            MapControl mapControl = new MapControl(); //Create the instance of map control
//            mapControl.movePlayer(p, m);
//        } catch (MapException me) {
//            System.out.println(me.getMessage());
//        }
    }

    private void movePlayerMegaStore() {
//        try {
//            System.out.println("NOT FULLY IMPLEMENTED YET");
//            //set location corrdinants to house
//            MapControl mapControl = new MapControl(); //Create the instance of map control
//            mapControl.movePlayer(p, m);
//        } catch (MapException me) {
//            System.out.println(me.getMessage());
//        }
    }

    private void movePlayerDeliveryCenter() {
//        try {
//            System.out.println("NOT FULLY IMPLEMENTED YET");
//            //set location corrdinants to house
//            MapControl mapControl = new MapControl(); //Create the instance of map control
//            mapControl.movePlayer(p, m);
//        } catch (MapException me) {
//            System.out.println(me.getMessage());
//        }
    }
}
