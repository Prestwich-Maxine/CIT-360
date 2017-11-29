package practicecollections;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Deque;
/**
 *
 * @author Maxine
 */
public class QCollections {
    
    public static void main(String args[] ) {
    
        // create a new queue
        Queue<String> food = new LinkedList<>();
        food.add("Turkey");
        food.add("garlic mashed potatoes");
        food.add("green beans");
        food.add("rolls");
        food.add("stuffing");
        food.add("gravy");
        food.add("sweet potatoes");
        food.add("junket Danish");
        food.add("dessert");
        
        
        /* When you declare the number of elements in a blocking queue, the output
           of the last element will be false because the blocking queue limit is 3 items.
           When adding items to a blocking queue, use the offer() method instead of add()
           because add() will throw an exception error when more items are added than allowed.*/
       Queue<String> foodList = new ArrayBlockingQueue<>(3);
       foodList.offer("apple pie");
       foodList.offer("pumpkin pie");
       foodList.offer("chocolate pie");
       foodList.offer("custard pie");
       
       // Use peek to get the head of the queue
       System.out.println("Use peek() to get the head of the queue: " + foodList.peek());
       
       // Iterate through the loop
       for (String foodItems: foodList) {
        System.out.println("Thanksgiving dinner: " + foodItems);
        }
       
       // Remove items from the queue
       String dessertItem;
       dessertItem = foodList.remove();
       System.out.println("The following was removed from the queue: " + foodList);
       
       // To add elements to the head and tail of the queue, use Dequeue or double ended queue
       Deque<String> foodList2 = new ArrayDeque<>(foodList);
       foodList2.addFirst("pumpkin chocolate chip cookies");
       foodList2.addLast("pumpkin spice bundt cake");
       System.out.println("Pumpkin chocolate chip cookies and pumpkin spice bundt cake"
               + " are added to the first and last of the list: " + foodList2);
       
       // Second queue
       Queue<String> noodles = new ArrayBlockingQueue<>(3);
       
       noodles.offer("chow fun");
       noodles.offer("ramen");
       noodles.offer("linguine");
       noodles.offer("spaghetti");
       
       if(noodles.offer("spaghetti") == false) {
           System.out.println("Spaghetti isn't printed because it exceeds the "
                   + "capacity of the queue. But there is no exception thrown "
                   + "because the offer() method is used to add items instead of add().");
       }
       for(String lines: noodles) {
           System.out.println("Type of noodles: " + lines);
       }
       // Poll is another way to remove items
       System.out.println("Polled items: " + noodles.poll());
       
       
    }
}
