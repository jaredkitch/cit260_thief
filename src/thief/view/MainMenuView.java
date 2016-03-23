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
        gameMenu.display();
        
    }

    private void startExistingGame() {
         
        System.out.println("\n\nEnter the file path for the file where the game is saved");
        
        String filePath = this.getGameInput();
        
        try{
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
            
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
         
        System.out.println("\n\nEnter the file path for file where the game is to be saved");
        String filePath = this.getGameInput();
        
        try{
            GameControl.saveGame(Thief.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
                
    }

    private String getGameInput() {
                
        String value = "";
        boolean valid = false; //set flag to invalid value entered
try {
        while(!valid) { // while a valid name has not been retrieved
        
            
            //prompt for the player's na
        

            value = this.keyboard.readLine();//get the name from the keyboard
            value = value.trim(); //trim off the excess blanks
            value = value.toUpperCase(); // converts to upper case letter  
            
 // and repeat again
            
            if (value.length() < 1) {
               ErrorView.display(this.getClass().getName(),
                       "\n*****************************************************"
                     + "\n***** Invalid value - the value cannot be blank *****"
                     + "\n*****************************************************");
              continue; // and repeat again
}             
            valid = true; // set flag to end repetition
}
} catch(Exception e) { 
            ErrorView.display(this.getClass().getName(), "Error Reading Input: " + e.getMessage());
            
            }
            
            
            return value; // return the value
        }
    
    }

           

       
 
    

    

