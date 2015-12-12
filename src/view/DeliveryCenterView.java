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
public class DeliveryCenterView extends View{
    
    public DeliveryCenterView() {
        super("C - Choose a Delivery\n"
                + "M - Make a Delivery\n"
                + "V - View Deliveries\n"
                + "X - Return to Game Menu\n");
    }

    @Override   
    public boolean doAction(char input) {
        
         switch(input) {
            case 'C' :
                ChooseDelivery();
                break;
            case 'M' :
                MakeDelivery();
                break;
            case 'V' :
                ViewDeliveries();
                break;
            case 'X':
                return false;
            default:
                System.out.println("Please select a valid input.");
                break;
            }
            return true;
    }


    private void ChooseDelivery() {
        System.out.println("You Selected 'Choose a Delivery'. /n");
        System.out.println("Each delivery will take one hour off your time./n");
        System.out.println("Which type of delivery would you like to make?");
        
        deliveryOptions();
                
    }
    
    private void MakeDelivery() {
         
    }

    private void ViewDeliveries() {
        DeliveryControl deliveryControl = new DeliveryControl();
        deliveryControl.checkDeliveries(10);
    }

    private void ReturnGameMenu() {
        System.out.println("NOT IMPLEMENTED YET"); 
    }   

    
    
    public void deliveryOptions() {
        // create 3 new deliveries instances
//        Deliveries deliveryOne = new Deliveries();
//        deliveryOne.setType("Deliver supplies to the nursing home");
//        
//        Deliveries deliveryTwo = new Deliveries();
//        deliveryTwo.setType("Deliver supplies to the post office");
//        
//        Deliveries deliveryThree = new Deliveries();
//        deliveryThree.setType("Deliver supplies to the prison");
        
        System.out.println("Please select the type of delivery you would like to accept");
        System.out.println("A - Deliver supplies to the nursing home");
        System.out.println("B - Deliver supplies to the post office");
        System.out.println("C - Deliver supplies to the prison");
        System.out.println("X - Cancel");  
        
         
//        public boolean doAction(char input) {
//        
//         switch(input) {
//            case 'A' :
//                AssignDelivery(char A);
//                break;
//            case 'B' :
//                MakeDelivery();
//                break;
//            case 'C' :
//                ViewDeliveries();
//                break;
//            case 'X':
//                return false;
//            default:
//                System.out.println("Please select a valid input.");
//                break;
//            }
//            return true;
//        }
        
    }
}
