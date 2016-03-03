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
public class GameMenuView extends View{

    
    public GameMenuView() {
        super(
        "\n.-------------------------------------------------------------------"
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
      + "\n|-------------------------------------------------------------------");
    }

    



    @Override
    public boolean doAction(String choice) {
        
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
        toStealMenu.display();
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
        helpMenu.display();
    }

    private void listCurrentInventory() {
        InventoryView inventoryMenu = new InventoryView();
        inventoryMenu.display();
    }
    
}
