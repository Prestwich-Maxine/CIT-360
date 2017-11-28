/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maxine
 */

/* 2nd of 2 basic ways to create a thread:
    Using implements Runnable and passing it to a constructor of the thread class
*/ 
class Runner implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

public class App2 {
    
    public static void main(String[] args) {
        
        // Shows concurrency; will see two sets of numbers
        Thread t1= new Thread(new Runner()); // pass instance of Runner class to constructor
        Thread t2= new Thread(new Runner());
        
        t1.start();
        t2.start();

    }
    
}
