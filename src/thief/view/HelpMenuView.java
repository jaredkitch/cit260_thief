/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.view;

import exceptions.GameControlExceptions;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import thief.Thief;
import thief.control.GameControl;
import thief.model.Game;
import thief.model.InventoryItem;
import thief.model.Player;

/**
 *
 * @author Jon
 */
public class HelpMenuView extends View {
    
    
    public HelpMenuView() {
        super( 
        "\n.-------------------------------------------------------------------"
      + "\n| Help Menu"
      + "\n|-------------------------------------------------------------------"
      + "\n| G - What's the Goal of the Game?"
      + "\n| M - How do you move?"
      + "\n| S - How do I save the game?"
      + "\n| I - How do I steal Items?"
      + "\n| E - Print Supply Report"
      + "\n| Q - Quit"
      + "\n|-------------------------------------------------------------------");
    }

    


   @Override
    public boolean doAction(String choice) {
        
        switch (choice) {
            case "G":
                this.gameGoal();
                break;
            case "M":
                this.howToMove();
                break;
            case "S":
                this.howToSave();
                break;
            case "I":
                this.howToSteal();
                break;
            case "E":
                this.printSupplyReport();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                      "\n***************************************"
                    + "\n***** Invalid Selection Try Again *****"
                    + "\n***************************************");
                break;
        }
        return false;
    }

    private void gameGoal() {
        this.console.println(
        "\n.-------------------------------------------------------------------"
      + "\n| What's the Goal of the Game?"
      + "\n|-------------------------------------------------------------------"       
      + "\n| You are a master thief with your eye on the local museum as your"
      + "\n| big score. This is no small task. The museum is two stories with"
      + "\n| numerous different rooms and hidden walkways. Your job is to steal"
      + "\n| as many valuables as you can before the alarm sounds or security"
      + "\n| catches you."
      + "\n|"
      + "\n| The game starts with you in the van getting ready to go through"
      + "\n| the loading dock of the museum. Your job is to safely navigate the"
      + "\n| museum, steal the items and escape in your van before the cops"
      + "\n| arrive."
      + "\n|"
      + "\n| You have a set amount of turns to get out before getting caught."
      + "\n'-------------------------------------------------------------------"
        );
    }

    private void howToMove() {
        this.console.println(
        "\n.-------------------------------------------------------------------"
      + "\n| How do you move?"
      + "\n|-------------------------------------------------------------------"
      + "\n| From the Game Menu, select M to Move."
      + "\n|"
      + "\n| Next press N, S, E, W depending on which direction you would like"
      + "\n| to Move. In some cases, you may be able to select T for stairs."
      + "\n| The room that you moved to will then be displayed."
      + "\n'-------------------------------------------------------------------"
        );
    }

    private void howToSave() {
        this.console.println(
        "\n.-------------------------------------------------------------------"
      + "\n| How do I save the game?"
      + "\n|-------------------------------------------------------------------"
      + "\n| To save the current game go to Game Menu. Select S to save your"
      + "\n| game . Then you can return to it later if you wish."
      + "\n'-------------------------------------------------------------------"
        );
    }

    private void howToSteal() {
        this.console.println(
        "\n.-------------------------------------------------------------------"
      + "\n| How do I steal Items?"
      + "\n|-------------------------------------------------------------------"
      + "\n| Stealing items will require you to solve a problem. Depending on"
      + "\n| the item, you will need to Pick a Lock, Dodge a Laser, or even"
      + "\n| Blow Open a Safe. Have fun, and don't blow yourself up! You can"
      + "\n| always see what what items there are to steal by selecting I from"
      + "\n| the Game Menu."
      + "\n'-------------------------------------------------------------------"
        );
    }

    private void printSupplyReport() {
        Game game = Thief.getCurrentGame();
        Player player = game.getPlayer();
        InventoryItem[] inven = player.getPlayerinven();
        
        System.out.println("\n\nEnter the file path for file where the game is to be saved");
        String filePath = this.getFileInput();
        
      
    try (FileOutputStream fops = new FileOutputStream(filePath)) {
        PrintInventoryReportView report = new PrintInventoryReportView();
        report.printInventoryReportView(inven, filePath);
        
        } catch (Exception ex) {
            ErrorView.display("HelpMenuView", ex.getMessage());
        }
    
    
    }

 private String getFileInput() {
                
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