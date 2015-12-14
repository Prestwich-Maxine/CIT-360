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
public class DeliveryTypeView extends View {

    public DeliveryTypeView() {
        super("Choose a delivery to earn money:\n"
                + "A - Deliver supplies to the nursing home. Payment: $15\n"
                + "B - Deliver supplies to the post office. Payment: $15\n"
                + "C - Deliver supplies to the prison. Payment: $20\n"
                + "D - Cancel. Return to previous menu.\n");

    }

    @Override
    public boolean doAction(char input) {

        switch (input) {
            case 'A':
                System.out.println("You earned $15 for delivering to the nursing home.");
                break;
            case 'B':
                System.out.println("You earned $15 for delivering to the post office.");
                break;
            case 'C':
                System.out.println("You earned $20 for delivering to the prison.");
                break;
            case 'D':
                return false;
            default:
                System.out.println("Please enter a valid input.");
                break;
            }
            return true;
    }

}
