/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*******************
 * I think that we need to make this class more of an outline of what the user would see when they enter one
 * of the stores.  We probably don't want a list of the two stores here.  
 * It might prompt them to choose and aisle to go down or view their money, ect.
 *******************/


package view;

/**
 *
 * @author Maxine
 */
public class StoreView extends View {
    
    public StoreView() {
        super("Select a store: \n"
                + "M - Mega Store\n"
                + "C - Camping Store\n"
                + "X - Return to Game Menu\n");
    }
    
    @Override
    public boolean doAction(char input) {
        
        switch (input){
        
            case 'M':
                megaStoreAisles();
                break;
            case 'C':
                campingStoreAisles();
                break;
            case 'X':
                return false;
            default:
                System.out.println("Please select a valid input");
                break;
        }
        return true;
        
    }
    private void megaStoreAisles() {
        StoreMegaAislesView megaAislesMenu = new StoreMegaAislesView();
        megaAislesMenu.display();
        }

    private void campingStoreAisles() {
        StoreCampingAislesView campingAislesMenu = new StoreCampingAislesView();
        campingAislesMenu.display();
    }
}
