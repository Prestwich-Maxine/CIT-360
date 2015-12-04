/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import hurricane_game.Hurricane_game;
import java.io.PrintWriter;

/**
 *
 * @author Maxine
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = Hurricane_game.getOutFile();
    private static final PrintWriter logFile = Hurricane_game.getLogFile();
    
    public static void display(String className, String errorMessage) {
    
        errorFile.println(
                    "--------------------------------------------------"
                  + "\n- ERROR - " + errorMessage
                  + "\n--------------------------------------------------");
        
        // log error
        logFile.println(className + " - " + errorMessage);
    }
    
}
