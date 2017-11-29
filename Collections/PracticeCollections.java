
package practicecollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Maxine
 */
public class PracticeCollections {
    
    public static void main(String[] args) {
        // Create a list and add elements to it
        List<String> food = new ArrayList<>();
        food.add("Turkey");
        food.add("Green beans");
        food.add("Potatoes");
        food.add("Garlic");
        food.add("Heavy whipping cream");
        food.add("Parmesan");
        food.add("Bread crumbs");
        food.add("Spicy Italian sausage");
        food.add("Vegies - celery, carrots, onions");
        food.add("Cranberries");
        food.add("Hamburger");
        System.out.println("Original Thanksgiving grocery list:");
        System.out.println("\t" + food);
        
        // Delete an element from the list at a specific element
        food.remove(10);
        System.out.println("Thanksgiving grocery list with removed item (hamburger):");
        System.out.println("\t" + food);
        
        // Check to see that the element was removed
        if(food.remove("Hamburger")) {
            System.out.println("Removed");
        } else {
            System.out.println("Hamburger is not found");
        }
        
        // Add an element at a specific index
        food.add(6, "rolls");
        System.out.println("Thanksgiving grocery list with added item(rolls) :");
        System.out.println("\t" + food);
        
        // Update elements at specific indices
        food.set(1, "green beans");
        food.set(2, "potatoes");
        food.set(3,"garlic");
        food.set(4, "heavy whipping cream");
        food.add(5, "parmesan");
        food.add(7, "spicy Italian sausage");
        System.out.println("Thanksgiving grocery list with lower case list:");
        System.out.println("\t" + food);
        
        // Iterate through the list using Java8's forEach() method
        food.forEach(s->System.out.println(s));
        
        // Sort the list
        Collections.sort(food);
        System.out.println("Sorted Thanksgiving grocery list: " + food);
        
        // Search for elements in a list
        if(food.contains("hamburger")) {
            System.out.println("Hamburger is on the list");
        } else {
            System.out.println("Hamburger is not on the list");
        }
        
        // find an element based on index
        int firstIndex = food.indexOf("Garlic");
        int lastIndex = food.indexOf("Cranberries");
        System.out.println("Garlic is not found but garlic is,"
                + " so firstIndex is false and gives us: " + firstIndex);
                
        System.out.println("Cranberries is found,"
                + " so lastIndex is true and gives us: " + lastIndex);
        
        // Copy a list from the source list to a destination list
        List<String> food2 = new ArrayList<String>();
        Collections.copy(food, food2);
        System.out.println("This is a copy of the food list into the food2 list: " + food);
        
        // Use the Collections.shuffle() method to shuffle the list
        Collections.shuffle(food);
        System.out.println("The grocery list after it has been shuffled: " + food);
        
        // A list can also be reversed
        Collections.reverse(food);
        System.out.println("The grocery list in reverse: " + food);
        
      
       
       
    }
    
}
