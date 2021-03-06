
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxine
 */

// Using thread pools to manage lots of threads at the same time

class Processor implements Runnable {
    
    private int id;
    
    public Processor(int id) {
        this.id = id;
    
    }
    
    public void run() {
        System.out.println("Starting: " + id);
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Processor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Ending: " + id);
    }
}
public class App5 {
    
    public static void main(String[] args) {
        
        // ExecutorService manages multiple tasks it's given
        ExecutorService executor = Executors.newFixedThreadPool(2);
    
        for(int i=0; i<5; i++) {
            executor.submit(new Processor(i));
        }
        
        executor.shutdown();
        
        System.out.println("All tasks submitted.");
        
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException ex) {
            Logger.getLogger(App5.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("All tasks finished.");
    }
        
}
