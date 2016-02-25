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
public class KeypadEquationView {
    
    private String menu;
    private String promptMessage = 
          "| Please Enter Your Selection: "
      + "\n'-------------------------------------------------------------------";
    
    public KeypadEquationView() {
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
      + "\n| D - Dodge Lasers"          
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
       
        double value1 = keyboard.nextDouble(); //get the name from the keyboard
        value = value.trim(); //trim off the excess blanks
        
        double value2 = keyboard.nextDouble();
        
        
        // if the name is invalid (less than one character in length))
        if (value.length() >= 3) {
            System.out.println(
               "\n*************************************************************"
             + "\n***** Invalid value - the value cannot be more than Three digits *****"
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
          
            default:
                System.out.println(
                                     "\n***************************************"
                                   + "\n***** Invalid Selection Try Again *****"
                                   + "\n***************************************");
                break;
        }
        return false;
    }
    
}

