/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import hurricane_game.Hurricane_game;
import java.io.IOException;
import model.Game;
import model.MainMap;
import model.Player;

/**
 *
 * @author maloriegomm
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("Please select an option:\n"
                + "N - Begin new game\n"
                + "L - Load saved game\n"
                + "H - View help menu\n"
                + "S - Save Game\n"
                + "X - Exit game\n");
    }

    /**
     * This calls a method based on the input
     *
     * @param input
     * @return
     */
    @Override
    public boolean doAction(char input) {

        switch (input) {
            case 'N':
                startNewGame();
                break;
            case 'L':
                loadGame();
                break;
            case 'H':
                showHelpMenu();
                break;
            case 'S':
                saveGame();
                break;
            case 'X':
                return false;
            default:
                ErrorView.display("MainMenuView", "*** Invalid Selection *** "
                        + "Try Again");
                break;
        }

        return true;

    }

    public void startNewGame() {

        GameControl gameControl = new GameControl(); //Create the instance of game control
        gameControl.createNewGame();

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void loadGame() {
        // prompt for and get the name of the file to save the gamein
        System.out.println("\n\nEnter the name of your game to be retrieved.");
        
        String filePath = "";

        try {
            filePath = keyboard.readLine();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        try {
            // start a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception e) {
            ErrorView.display("MainMenuView", e.getMessage());
        }
        // display the Game Menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void showHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        // Prompt for and get the name of the file to save the game
        System.out.println("To save your game, enter a name that will be\n "
                + "used to retrieve it later.");

        String filePath = "";

        try {
            filePath = keyboard.readLine();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        try {
            // save the game to the specified file
            GameControl.saveGame(Hurricane_game.getCurrentGame(), Hurricane_game.getCurrentGame().getPlayer(), filePath);
        } catch (Exception e) {
            ErrorView.display("MainMenuView", e.getMessage());
        }
        
        System.out.println(filePath + " has been saved.");
    }
}
