/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


/**
 *
 */
public class HouseView extends View{
    
    public HouseView() {
        super("K - Enter Kitchen\n"
                + "G - Enter Garage\n"
                + "B - Enter Bedroom\n"
                + "A - Enter Basement\n"
                + "X - Return to Game Menu\n");
    }

    @Override   
    public boolean doAction(char input) {
        
         switch(input) {
            case 'K' :
                System.out.println("You have beans, granola bars, crackers, tuna,\n"
                        + "and fruit, but you can use more of everything else.\n"
                        + "Purchase more food items to increase your survival points. ");
                break;
            case 'G' :
                System.out.println("Extra water is stored in the garage. After\n"
                        + "checking your supply, you find you have more than enough.");
                break;
            case 'B' :
                System.out.println("You check your bedroom closet and find that\n"
                        + "you have more than enough shoes. However, you can use\n"
                        + "a new sweatshirt and an extra jacket.");
                break;
            case 'A' :
                System.out.println("After checking the basement, you find that\n"
                        + "you need to replace your camping stove, tent, and are out\n"
                        + "of fuel. Your tarp is in good shape, but an extra one\n"
                        + "may come in handy. ");
                break;
            case 'X':
                return false;
            default:
                System.out.println("Please select a valid input.");
                break;
            }
            return true;
    }


    private void EnterKitchen() {
       System.out.println("NOT IMPLEMENTED YET"); 
                
    }
    
    private void EnterLivingRoom() {
        System.out.println("NOT IMPLEMENTED YET");     
    }

    private void EnterGarage() {
        System.out.println("NOT IMPLEMENTED YET");     
    }

    private void EnterBedroom() {
        System.out.println("NOT IMPLEMENTED YET");     
    }

    private void EnterBasement() {
        System.out.println("NOT IMPLEMENTED YET");     
    }
}
    

