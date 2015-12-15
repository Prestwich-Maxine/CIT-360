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
                + "T - Tent\n"
                + "A - Tarp\n"
                + "F - Fuel\n"
                + "C - Camp Stove\n"
                + "X - Return to Game Menu");
    }
    
    @Override
    public boolean doAction(char input) {
    
        switch(input) {
            case 'T':
                System.out.println("You selected a tent for purchase.");
                break;
            case 'A':
                System.out.println("You selected a tarp for purchase.");
                break;
            case 'F':
                System.out.println("You selected fuel for purchase.");
                break;
            case 'C':
                System.out.println("You selected a stove for purchase.");
            case 'X':
                return false;
            default:
                System.out.println("Please enter a valid input");
                break;
        }
        return true;
    }    

    

   }
