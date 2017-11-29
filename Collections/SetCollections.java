package practicecollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


/**
 *
 * @author Maxine
 */
public class SetCollections {
    
    public static void main(String args[]) {
    
        // The use of HashSet doesn't print the list based on the way it was written
        Set<String> names = new HashSet<String>();
        /* Set<String> names = new HashLinkedSet<>(); - Use this method if you want
          to maintain the order in which you've written the list*/
        // Use Set<String> names = new TreeSet<String>(); if you want the Set alphabetized or in numeric order
        // Check the Set to see if it's empy. Putting it before list so isEmpty is valid
        if(names.isEmpty()) {
            System.out.println("The names Set is empty.");
        }
        names.add("Jason");
        names.add("Xine/Sini");
        names.add("Cameron");
        names.add("Daney"); 
        System.out.println("The following are names in the set: " + names);
        System.out.println("As you can see, using HashSet does not maintain the"
                + " order of names.");
        System.out.println("If you want to maintain the order in which you've written"
                + " the list, use Set<String> names = new HashLinkedSet<>();");
        System.out.println("If you want to alphabetize your list, use"
                + " Set<String> names = new TreeSet<String>(); because TreeSet "
                + "automatically sorts numerically or alphabetically.");
                      
        // Sets do not accept duplicate items:
        names.add("Jason");
        names.add("Xine/Sini");
        System.out.println("Jason and Xine/Sini were not added to the list "
                + "because Set does not duplicate items" + names);
        
        // Sets only contain unique items
        names.add("Prestwich");
        System.out.println("A set contains only unique items. Because Prestwich"
                + " was not on the previous list, it can be added to the set: " + names);
        
        // You can iterate through the set
        names.forEach((element) -> {
            System.out.println(element);
        });
        
        // You can use set to search for an item
        // You can find an item quicker with Set than with List by using the
        //     contains method
        if (names.contains("Prestwich")) {
            System.out.println("Prestwich is found in the list.");
        }
        
        // Intersection
        Set<String> names1 = new HashSet<>();
        names1.add("Jason");
        names1.add("Xine/Sini");
        names1.add("Glen");
        names1.add("Lulu"); 
        names1.add("Prestwich");
        
        // Create a copy of the original set
        Set<String> intersection = new HashSet<>(names);
            System.out.println(intersection);
        
        // To see what elements intersect between the two sets use the retains method
        intersection.retainAll(names1);
        System.out.println("The elements common to both sets are: " + intersection);
        
        // You can also find the difference between the two by using removeAll()
        Set<String> difference = new HashSet<>(names);
        
        difference.removeAll(names1);
        System.out.println("This is the difference between the two sets: " + difference);
        
        
    }
    
}
