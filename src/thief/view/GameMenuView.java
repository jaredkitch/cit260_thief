/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.view;

import exceptions.TrapControlExceptions;
import java.util.logging.Level;
import java.util.logging.Logger;
import thief.Thief;
import thief.model.Game;
import thief.model.Map;
import thief.model.Player;

/**
 * @author Jon
 */
public class GameMenuView extends View{

    Player player = Thief.getPlayer();
    
    public GameMenuView() {
        
        super(
        "\n.-------------------------------------------------------------------"
      + "\n| Game Menu"
      + "\n|-------------------------------------------------------------------"
      + "\n| M - Move Location"
      + "\n| S - Search Room"
      + "\n| R - List Inventory"
      + "\n| I - Items to Steal"
      + "\n| C - Items Stolen"
      + "\n| V - View Map"
      + "\n| H - Help"             
      + "\n| A - Save and Quit"          
      + "\n| Q - Quit"
      + "\n|-------------------------------------------------------------------");

    }

    @Override
    public boolean doAction(String choice) {
        
        int loc = player.getLocation();
        
        switch (choice) {
            case "M":
                this.moveLocation();
                break;
            case "S":
                this.searchRoom();
                break;
            case "R":
                this.listInventory();
                break;
            case "I":
                this.itemsToSteal();
                break;
            case "C":
                this.itemsStolen();
                break;
            case "B":
                {
                if (loc != 13) {
                    ErrorView.display(this.getClass().getName(),
                          "\n***************************************"
                        + "\n***** Invalid Selection Try Again *****"
                        + "\n***************************************");
                } else {
                    try {
                        this.blowUpSafe();
                        }
                    catch (TrapControlExceptions ex) {
                        Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                break;
            case "L":
                {
                if (loc != 7 && loc != 17 && loc != 18) {
                    ErrorView.display(this.getClass().getName(),
                          "\n***************************************"
                        + "\n***** Invalid Selection Try Again *****"
                        + "\n***************************************");
                } else {
                    this.pickLock();
                    }
                }
                break;
            case "D":
                {
                if (loc != 17) {
                    ErrorView.display(this.getClass().getName(),
                          "\n***************************************"
                        + "\n***** Invalid Selection Try Again *****"
                        + "\n***************************************");
                } else {
                    this.dodgeLasers();
                    }
                }
                break;  
            case "P":
                {
                if (loc != 3) {
                    ErrorView.display(this.getClass().getName(),
                          "\n***************************************"
                        + "\n***** Invalid Selection Try Again *****"
                        + "\n***************************************");
                } else {
                    try {
                        this.keypadEquation();
                        }
                    catch (TrapControlExceptions ex) {
                        Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                break;    
            case "V":
                this.viewMap();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "A":
                this.saveAndQuit();
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

    private void moveLocation() {
        MoveLocationView moveLocationMenu = new MoveLocationView();
        moveLocationMenu.display();
    }

    private void searchRoom() {
        this.console.println("*** SearchRoom stub function called ***");
    }

    private void listInventory() {
        InventoryView inventoryMenu = new InventoryView();
        inventoryMenu.printListOfInventory();
    }
    
    private void itemsToSteal() {
        ItemsToStealView toStealMenu = new ItemsToStealView();
        toStealMenu.display();
    }

    private void itemsStolen() {
        this.console.println("*** ItemsStolen stub function called ***");
    }

    private void blowUpSafe() throws TrapControlExceptions {
        BlowUpSafeView blowUpSafe = new BlowUpSafeView();
        blowUpSafe.displayMenu();
    }

    private void pickLock() {
        this.console.println("*** PickLock stub function called ***");
    }

    private void dodgeLasers() {
        AvoidLasersView avoidLasers = new AvoidLasersView();
        avoidLasers.displayMenu();
    }

    private void keypadEquation() throws TrapControlExceptions {
        KeypadEquationView keypadView = new KeypadEquationView();
        keypadView.displayMenu();
    }

    private void viewMap() {
        Game game = Thief.getCurrentGame();
        Map map = game.getMap();
        MapView viewMap = new MapView(map);
    }
    
    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
    private void saveAndQuit() {
        this.console.println("*** Save and Quit stub function called ***");
    }
}