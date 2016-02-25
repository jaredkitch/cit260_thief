/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.view;

import java.util.Scanner;

/**
 *
 * @author Jared
 */
class InventoryView {
    
  private String menu;
    private String promptMessage = 
          "| Please Enter Your Selection: "
      + "\n'-------------------------------------------------------------------";
    
    public InventoryView() {
        menu = 
        "\n.------------------------------------------------- )xxxxx[;;;;;;;;;>"
      + "\n| Items in your inventory"
      + "\n|  - Select an option to see a description of the item"
      + "\n|-------------------------------------------------------------------"
      + "\n| E - C4 Explosives"
      + "\n| M - Measuring Tape"
      + "\n| C - Calculator"
      + "\n| B - Crowbar"
      + "\n| G - Gun"
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
        
        //prompt for a selection
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
        "\n.------------------------------------------------- )xxxxx[;;;;;;;;;>"
      + "\n| C4 Explosives"
      + "\n|-------------------------------------------------------------------"
      + "\n| Sometimes the best way to get into something is to make a big boom."
      + "\n| Who doesn't like a good boom?"
      + "\n'-------------------------------------------------------------------"
        );
    }

    private void measuringTapeDescription() {
        System.out.println(
        "\n.------------------------------------------------- )xxxxx[;;;;;;;;;>"
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
        "\n.------------------------------------------------- )xxxxx[;;;;;;;;;>"
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
        "\n.------------------------------------------------- )xxxxx[;;;;;;;;;>"
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
        "\n.------------------------------------------------- )xxxxx[;;;;;;;;;>"
      + "\n| Gun"
      + "\n|-------------------------------------------------------------------"
      + "\n| I would hope that this is a last resort. You're a thief not a"
      + "\n| killer! But it can be intimidating. Other than that, it's a gun."
      + "\n'-------------------------------------------------------------------"
        );
    }

}
