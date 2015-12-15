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
public class ClothesAisleView extends View {

    public ClothesAisleView() {
        super("Clothes Aisle. Choose from:\n"
                + "J - Jacket\n"
                + "S - Sweatshirt\n"
                + "Z - Shoes\n"
                + "X - Return to previous menu");
    }

    @Override
    public boolean doAction(char input) {

        switch (input) {
            case 'J':
                System.out.println("You added a jacket for purchase.");
                break;
            case 'S':
                System.out.println("You added a sweatshirt for purchase.");
                break;
            case 'Z':
                System.out.println("You added shoes for purchase.");
                break;
            case 'X':
                return false;
            default:
                System.out.println("Pleae enter a valid input.");
        }
        return true;
    }

}
