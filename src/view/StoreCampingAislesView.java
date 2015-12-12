/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**********************
 * The aisle views should display a list of items in that aisle.  So we will have to write a 
 * statement that checks which aisle they are in and then gets a list of the items in that 
 * aisle to display to the user and it's associated selection letter.
 **********************/

package view;

/**
 *
 * @author Maxine
 */
public class StoreCampingAislesView extends View {
    
    public StoreCampingAislesView() {
        super ("Camping Store Aisles:\n"
                + "T - Tents and canopies\n"
                + "L - Lighting\n"
                + "C - Cooking supplies\n"
                + "X - Return to Game Menu");
    }
    
    @Override
    public boolean doAction(char input) {
    
        switch(input) {
            case 'T':
                enterTentAisle();
                break;
            case 'L':
                enterLightingAisle();
                break;
            case 'C':
                enterCookingAisle();
                break;
            case 'X':
                return false;
            default:
                System.out.println("Please enter a valid input");
                break;
        }
        return true;
    }    

    private void enterTentAisle() {
        System.out.println("Please select an item and quantity for purchase.");
        
        
    }

    private void enterLightingAisle() {
        System.out.println("NOT YET IMPLEMENTED");
    }

    private void enterCookingAisle() {
        System.out.println("NOT YET IMPLEMENTED");
    }

   }
