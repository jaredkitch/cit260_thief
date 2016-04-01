/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.view;

import java.util.Scanner;
import thief.Thief;
import thief.model.Game;
import thief.model.InventoryItem;
import thief.model.Player;

/**
 *
 * @author Jared
 */
class InventoryView extends View {
    
    public InventoryView() {
        super( 
        "\n.-------------------------------------------------------------------"
      + "\n| Items in your inventory"
      + "\n|  - Select an option to see a description of the item"
      + "\n|-------------------------------------------------------------------"
      + "\n| E - C4 Explosives"
      + "\n| M - Measuring Tape"
      + "\n| C - Calculator"
      + "\n| B - Crowbar"
      + "\n| G - Gun"
      + "\n| Q - Quit"
      + "\n|-------------------------------------------------------------------");
    }

    public void printListOfInventory() {
           Game game = Thief.getCurrentGame();
           Player player = game.getPlayer();
            
           this.console.println("\nList of Inventory Items");
           StringBuilder line = new StringBuilder("                                          ");
           line.insert(0, "Description");
           this.console.println(line.toString());
           
           InventoryItem[] inventory = player.getPlayerinven();
            for (InventoryItem item : inventory) {
                line = new StringBuilder("                                     ");
                line.insert(0, item.getDescription());
                this.console.println(line.toString());
            }
    }
    
    @Override
    public boolean doAction(String choice) {
        
        switch (choice) {
            case "E":
                this.c4ExplosivesDescription();
                break;
            case "M":
                this.measuringTapeDescription();
                break;
            case "C":
                this.calculatorDescription();
                break;
            case "B":
                this.crowbarDescription();
                break;
            case "G":
                this.gunDescription();
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

    private void c4ExplosivesDescription() {
        System.out.println(
        "\n.-------------------------------------------------------------------"
      + "\n| C4 Explosives"
      + "\n|-------------------------------------------------------------------"
      + "\n| Sometimes the best way to get into something is to make a big boom."
      + "\n| Who doesn't like a good boom?"
      + "\n'-------------------------------------------------------------------"
        );
    }

    private void measuringTapeDescription() {
        System.out.println(
        "\n.-------------------------------------------------------------------"
      + "\n| Measuring Tape"
      + "\n|-------------------------------------------------------------------"
      + "\n| When you're stuck in a bind, perhaps you need to be measured for a"
      + "\n| new suit. More likely, this might help with the dimensions of"
      + "\n| something."
      + "\n'-------------------------------------------------------------------"
        );
    }

    private void calculatorDescription() {
        System.out.println(
        "\n.-------------------------------------------------------------------"
      + "\n| Calculator"
      + "\n|-------------------------------------------------------------------"
      + "\n| The only other thing you need is a sweet pocket protector. This"
      + "\n| little baby can calculate numbers faster than your programming"
      + "\n| instructor."
      + "\n'-------------------------------------------------------------------"
        );
    }

    private void crowbarDescription() {
        System.out.println(
        "\n.-------------------------------------------------------------------"
      + "\n| Crowbar"
      + "\n|-------------------------------------------------------------------"
      + "\n| This is some of the finest titanium money can by. Whatever you are"
      + "\n| planning on crowbarring doesn't stand a chance. A little leverage"
      + "\n| and you're bound to open it."
      + "\n'-------------------------------------------------------------------"
        );
    }
    
    private void gunDescription() {        
        System.out.println(
        "\n.-------------------------------------------------------------------"
      + "\n| Gun"
      + "\n|-------------------------------------------------------------------"
      + "\n| I would hope that this is a last resort. You're a thief not a"
      + "\n| killer! But it can be intimidating. Other than that, it's a gun."
      + "\n'-------------------------------------------------------------------"
        );
    }

}
