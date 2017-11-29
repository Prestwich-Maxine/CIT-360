    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicecollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Maxine
 */
class Puppies{
    private int age;
    private String name;
    
    public Puppies(int age, String name){
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "(Puppy age is: " + age + "; Puppy is " + name + ")";
    }
// Add hashCode and equals as Comparators if you think there are duplicates
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.age;
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Puppies other = (Puppies) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
}
public class MapCollections {
    
    public static void main(String args[]){
        /* Using HashMap does not retain the order in which the map was written
           Use LinkedHashMap or TreeMap */
        Puppies pup1 = new Puppies(11, "Sole");
        Puppies pup2 = new Puppies(1, "Sopo");
        Puppies pup3 = new Puppies(10, "Sid");
        Puppies pup4 = new Puppies(2, "Blackie");
        Puppies pup5 = new Puppies(8, "Coco");
        Puppies pup6 = new Puppies(9, "Tiger");
        Puppies pup7 = new Puppies(10, "Sid");
        
        Map<Puppies, Integer> map = new LinkedHashMap<>();
        // Use put to add to the map
        map.put(pup1, 1);
        map.put(pup2, 2);
        map.put(pup3, 3);
        map.put(pup4, 4);
        map.put(pup5, 5);
        map.put(pup6 ,6);
        map.put(pup3, 3); // Shows that map keys are not unique and  will not include a duplicate item
        
        // iterate through the map
        for(Puppies key: map.keySet()) { 
            System.out.println(key + ": " + map.get(key));
        }
        Set<Puppies> set = new LinkedHashSet<>();
        // Add items to the set
        set.add(pup1);
        set.add(pup2);
        set.add(pup3);
        set.add(pup4);
        set.add(pup5);
        set.add(pup6);
        System.out.println(set);
    }
    
}
