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
    
    public int checkDeliveries(boolean makeDeliveries, int numberOfDeliveries) {
    
        int returnValue;
        
        if (!makeDeliveries) {
            
            returnValue = 0;
        }
        
	else {
            for (int d = 10; d <= 10; d--) // need to rewrite this code; not working
                
                numberOfDeliveries = 10 - d--;
            
            returnValue = numberOfDeliveries;

            }
        return returnValue;
        }
    
    
    public int calcNewTimeAfterDelivery(boolean makeDeliveries, int timeRemaining) 
            throws DeliveryControlException {
        
        if (!makeDeliveries) {
		return timeRemaining;
        }
        else {
            if (makeDeliveries) {
                
                try {
                int deliveryTime = timeRemaining - 2; // deduct 2 hours from game every time a delivery is 
                return deliveryTime;
                } catch (NumberFormatException nfe) {
                    System.out.println("Your time must be greater than 0.");
                }
                
            }
        }
        int deliveryTime = timeRemaining - 2;
               
	if (deliveryTime < 0) {
		throw new DeliveryControlException("You are out of delivery time.");
        }
	
	return deliveryTime;
    }

    }

