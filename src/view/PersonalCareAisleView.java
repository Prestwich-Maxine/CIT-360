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
public class PersonalCareAisleView extends View {

    public PersonalCareAisleView() {
        super("Peronal Care. Choose from:\n"
                + "H - Hygiene Kit\n"
                + "T - Toilet Paper\n"
                + "M - Medicine\n"
                + "X - Return to previous menu");
    }

    @Override
    public boolean doAction(char input) {

        switch (input) {
            case 'H':
                System.out.println("You selected a hygiene kit.");
                break;
            case 'T':
                System.out.println("You selected toilet paper.");
                break;
            case 'M':
                System.out.println("You selected medicine");
                break;
            case 'X':
                return false;
            default:
                System.out.println("Please enter a valid input.");

        }
        return true;
    }
}
