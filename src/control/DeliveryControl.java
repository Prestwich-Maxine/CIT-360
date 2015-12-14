/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Exception.DeliveryControlException;

/**
 *
 * @author maloriegomm
 */
public class DeliveryControl {

    public void checkDeliveries(int numberOfDeliveries) {

        for (int d = 10; d >= 0; d--) {
            int deliveries = d--;

            if (deliveries > 0) {

                System.out.println("You have this many deliveries available:"
                        + deliveries);
            } else {
                System.out.println("Currently, there are no deliveries to make.");
            }
        }

    }

    public int calcNewTimeAfterDelivery(boolean makeDeliveries, int timeRemaining)
            throws DeliveryControlException {

        if (!makeDeliveries) {
            return timeRemaining;
        } else if (makeDeliveries) {

            try {
                int deliveryTime = timeRemaining - 1; // deduct 2 hours from game every time a delivery is 
                return deliveryTime;
            } catch (NumberFormatException nfe) {
                System.out.println("You are out of time. Game over.");
            }

        }
        int deliveryTime = timeRemaining - 2;

        if (deliveryTime < 0) {
            throw new DeliveryControlException("You are out of delivery time.");
        }

        return deliveryTime;
    }

}
