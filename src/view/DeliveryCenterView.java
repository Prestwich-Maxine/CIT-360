/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.DeliveryControl;
import model.Deliveries;

/**
 *
 * @author maloriegomm
 */
public class DeliveryCenterView extends View {

    public DeliveryCenterView() {
        super("C - Choose a Delivery\n"
                + "V - View Deliveries\n"
                + "X - Return to Game Menu\n");
    }

    @Override
    public boolean doAction(char input) {

        switch (input) {
            case 'C':
                chooseDelivery();
                break;
            case 'V':
                viewDeliveries();
                break;
            case 'X':
                return false;
            default:
                System.out.println("Please select a valid input.");
                break;
        }
        return true;
    }

    private void chooseDelivery() {
        DeliveryTypeView deliveryMenu = new DeliveryTypeView();
        deliveryMenu.display();

    }

    private void viewDeliveries() {
        DeliveryControl deliveryControl = new DeliveryControl();
        deliveryControl.checkDeliveries(10);
    }
}
