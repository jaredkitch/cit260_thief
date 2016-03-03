/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.view;

import java.util.Scanner;

/**
 *
 * @author Jon
 */
class ItemsToStealView extends View   {
    
    public ItemsToStealView() {
        super(
        "\n.------------------------------------------------- )xxxxx[;;;;;;;;;>"
      + "\n| What would you like to steal?"
      + "\n|-------------------------------------------------------------------"
      + "\n| D - The Diamond"
      + "\n| G - The Gold Bars"
      + "\n| P - The Painting"
      + "\n| S - The Sculpture"
      + "\n| V - The Vase"
      + "\n| Q - Quit"
      + "\n|-------------------------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        
        switch (choice) {
            case "D":
                this.stealDiamond();
                break;
            case "G":
                this.stealGoldBars();
                break;
            case "P":
                this.stealPainting();
                break;
            case "S":
                this.stealSculpture();
                break;
            case "V":
                this.stealVase();
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

    private void stealDiamond() {
        System.out.println("*** stealDiamond stub function called ***");
    }

    private void stealGoldBars() {
        System.out.println("*** stealGoldBars stub function called ***");
    }

    private void stealPainting() {
        System.out.println("*** stealPainting stub function called ***");
    }

    private void stealSculpture() {
       System.out.println("*** stealSculpture function called ***");
    }

    private void stealVase() {
        System.out.println("*** stealVase stub function called ***");
    }
    
    
}


