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

import java.util.Scanner;

/**
 *
 * @author Maxine
 */
public class StoreMegaAislesView extends View {

    private double number;
    
    public StoreMegaAislesView() {
        super ("Store aisles:\n"
                + "F - Food\n"
                + "C - Clothes\n" 
                + "P - Personal Care\n"
                + "X - Game Menu");
    }
    
    public int getQuantity (){
        int number;
        int total = 0;
        int quantity;
        
        System.out.println("Please enter a quantity: ");
        
        Scanner in = new Scanner(System.in);
        //number = keyboard.read();
        number = in.nextInt();
        
        while (number <1 && number > 5) {
            try {
            return -1;
            } catch (NumberFormatException nf) {
                System.out.println("Please enter a valid number between 1 and 5."
                        + " Please try again.");
            }
        }
        for (int n = 1; n <= 5; n++)
            total += n++;
        
        quantity = number * total;
        
        return quantity;
    }
       
   @Override
    public boolean doAction(char input) {
        
        switch(input) {
            case 'F':
                enterFoodAisle();
                break;
            case 'C':
                enterClothesAisle();
                break;
            case 'P':
                enterPersonalCareAisle();
                break;
            case 'X':
                return false;
            default:
                System.out.println("Please enter a valid input");
            }
        return true;
    }

    private void enterFoodAisle() {
        
        FoodAisleView foodAisle = new FoodAisleView();
        foodAisle.display();
    }

    private void enterClothesAisle() {
        
        ClothesAisleView clothesAisle = new ClothesAisleView();
        clothesAisle.display();
    }

    private void enterPersonalCareAisle() {
        PersonalCareAisleView personalCareAisle = new PersonalCareAisleView();
        personalCareAisle.display();
    }
    
    
    
}
