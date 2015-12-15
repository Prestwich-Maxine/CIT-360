/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Maxine
 */
public class FoodAisleView extends View {

    public FoodAisleView() {
        super("Food Aisle. Choose from: \n"
                + "T - Tuna\n"
                + "P - Protein Bar\n"
                + "L - Beans\n"
                + "W - Water\n"
                + "B - Bread\n"
                + "C - Crackers\n"
                + "G - Granola Bars\n"
                + "V - Vegetables\n"
                + "F - Fruit\n"
                + "H - Chocolate\n"
                + "O - Cookies\n"
                + "A - Candy\n"
                + "X - Return to previous menu\n");

    }

    @Override
    public boolean doAction(char input) {

        switch (input) {
            case 'T':
                System.out.println("You bought tuna.");
                break;
            case 'P':
                System.out.println("You bought a protein bar.");
                break;
            case 'L':
                System.out.println("You bought beans.");
                break;
            case 'W':
                System.out.println("You bought water.");
                break;
            case 'B':
                System.out.println("You bought bread.");
                break;
            case 'C':
                System.out.println("You bought crackers.");
                break;
            case 'G':
                System.out.println("You bought granola bars");
                break;
            case 'V':
                System.out.println("You bought vegetables.");
                break;
            case 'F':
                System.out.println("You bought fruit.");
                break;
            case 'H':
                System.out.println("You bought chocolate.");
                break;
            case 'O':
                System.out.println("You bought cookies.");
                break;
            case 'A':
                System.out.println("You bought candy.");
                break;
            case 'X':
                return false;
            default:
                System.out.println("Please enter a valid input.");

        }
        
        return true;

    }

}
