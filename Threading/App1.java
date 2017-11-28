/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maxine
 */

/* 1st of 2 basic ways to create a thread:
    Using extends Thread class to create a thread
*/
class Runner extends Thread {

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

public class App1 {

    public static void main(String[] args) {

        /* Show that both loops run concurrently
          *  You should see two loops 
         */
        Runner runner1 = new Runner();
        runner1.start();

        Runner runner2 = new Runner();
        runner2.start();
    }

}
