/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.view;

import java.util.Scanner;
import thief.Thief;
import thief.control.GameControl;

/**
 *
 * @author Tish
 */
public class MainMenuView extends View {

    public MainMenuView() {
       super(
        "\n.-------------------------------------------------------------------"
      + "\n| Main Menu"
      + "\n|-------------------------------------------------------------------"
      + "\n| N - Start new game"
      + "\n| G - Get and start saved game"
      + "\n| H - Get help on how to play the game"
      + "\n| S - Save game"
      + "\n| Q - Quit"
      + "\n|-------------------------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        
        switch (choice) {
            case "N":
                this.startNewGame();
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println(
                                     "\n***************************************"
                                   + "\n***** Invalid Selection Try Again *****"
                                   + "\n***************************************");
                break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(Thief.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        
    }

    private void startExistingGame() {
         System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void saveGame() {
         System.out.println("*** saveGame function called ***");
    }
           
}
       
 
    

    

