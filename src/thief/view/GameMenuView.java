/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.view;

import java.util.Scanner;
import thief.control.*;

/**
 *
 * @author Jon
 */
public class GameMenuView {

    private String menu;
    private String promptMessage = 
          "| Please Enter Your Selection: "
      + "\n'-------------------------------------------------------------------";
    
    public GameMenuView() {
        menu =
        "\n.------------------------------------------------- )xxxxx[;;;;;;;;;>"
      + "\n| Game Menu"
      + "\n|-------------------------------------------------------------------"
      + "\n| M - Move Location"
      + "\n| S - Search Room"
      + "\n| R - List Current Inventory"
      + "\n| I - Items to Steal"
      + "\n| C - Items Stolen"
      + "\n| B - Blow Open Safe"
      + "\n| L - Pick Lock"         
      + "\n| K - Sneak"
      + "\n| D - Avoid Lasers"          
      + "\n| P - Security Keypad Equation"          
      + "\n| V - View Map"
      + "\n| H - Help"             
      + "\n| A - Save and Quit"          
      + "\n| Q - Quit"
      + "\n|-------------------------------------------------------------------";
    }

    
    public void displayMenu() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done);
        
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
    String value = "";
    
    boolean valid = false; //set flag to invalid value entered
    while(!valid) { // while a valid name has not been retrieved
        
        //prompt for the player's name
        System.out.println(this.menu);
        System.out.println(this.promptMessage);
        
        value = keyboard.nextLine(); //get the name from the keyboard
        value = value.trim(); //trim off the excess blanks
        value = value.toUpperCase(); // converts to upper case letter
        
        // if the name is invalid (less than one character in length))
        if (value.length() >= 2) {
            System.out.println(
               "\n*************************************************************"
             + "\n***** Invalid value - the value cannot be more than one *****"
             + "\n*************************************************************");
            continue; // and repeat again
        }
        if (value.length() < 1) {
            System.out.println(
                       "\n*****************************************************"
                     + "\n***** Invalid value - the value cannot be blank *****"
                     + "\n*****************************************************");
            continue; // and repeat again
        }
        valid = true; // set flag to end repetition
    }
    
    return value; // return the value
        
    }
 
    private boolean doAction(String choice) {
        
        switch (choice) {
            case "M":
                this.moveLocation();
                break;
            case "S":
                this.searchRoom();
                break;
            case "R":
                this.listCurrentInventory();
                break;
            case "I":
                this.itemsToSteal();
                break;
            case "C":
                this.itemsStolen();
                break;
            case "B":
                this.blowUpSafe();
                break;
            case "L":
                this.pickLock();
                break;
            case "K":
                this.sneak();
                break;
            case "D":
                this.dodgeLasers();
                break;  
            case "P":
                this.keypadEquation();
                break;  
            case "V":
                this.viewMap();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "A":
                this.sneak();
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

    private void moveLocation() {
        System.out.println("*** MoveLocation stub function called ***");
    }

    private void searchRoom() {
        System.out.println("*** SearchRoom stub function called ***");
    }

    private void itemsToSteal() {
        ItemsToStealView toStealMenu = new ItemsToStealView();
        toStealMenu.displayMenu();
    }

    private void itemsStolen() {
        System.out.println("*** ItemsStolen stub function called ***");
    }

    private void blowUpSafe() {
        BlowUpSafeView blowUpSafe = new BlowUpSafeView();
        blowUpSafe.displayMenu();
    }

    private void pickLock() {
        System.out.println("*** PickLock stub function called ***");
    }

    private void sneak() {
        System.out.println("*** Sneak stub function called ***");
    }

    private void dodgeLasers() {
        AvoidLasersView avoidLasers = new AvoidLasersView();
        avoidLasers.displayMenu();
    }

    private void keypadEquation() {
        KeypadEquationView keypadView = new KeypadEquationView();
        keypadView.displayMenu();
    }

    private void viewMap() {
        MapView viewMap = new MapView();
        viewMap.displayMap();
    }
    
    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void listCurrentInventory() {
        InventoryView inventoryMenu = new InventoryView();
        inventoryMenu.displayMenu();
    }
    
}
