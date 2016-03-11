/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.view;

import java.util.Scanner;
import thief.model.Inventory;
import thief.model.Player;
import thief.model.Supplies;

/**
 *
 * @author Jon
 */
public class ItemToInventory{

    String menu;
    String promptMessage =          
        "| Please Enter Your Selection: "
      + "\n'-------------------------------------------------------------------";
    public ItemToInventory(){
        menu = (
        "\n.-------------------------------------------------------------------"
      + "\n| Supply List"
      + "\n|-------------------------------------------------------------------"
      + "\n| M - c4 Explosives"
      + "\n| S - Night Vision Goggles"
      + "\n| R - measuringTape"
      + "\n| N - lockPick"
      + "\n| I - Crowbar"
      + "\n| C - Flashlight"
      + "\n| B - Gun"
      + "\n| L - Glass Cutter"         
      + "\n| K - Rope"
      + "\n| D - Calculator"          
      + "\n| P - Phone"          
      + "\n| H - Laptop"
      + "\n| T - Smoke Bombs"  
      + "\n| Q - Quit"
      + "\n|-------------------------------------------------------------------"
        );
    }
public void display() {
        int[] inventory = new int[5];    
        int done = 0; // set flag to not done
        do {
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            int inventorySlot = this.doAction(value);
            if( inventorySlot != -911){
                inventory[done] = inventorySlot; 
                 done++;
            }
            if (done == 4){

            }
        } while (done < 4);

    }

    public String getInput() {
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
     public int doAction(String choice) {
        
         int slot;
         
        switch (choice) {
            case "M":
                slot = Supplies.c4Explosives.ordinal();
                break;
            case "S":
                slot = Supplies.nightVisionGoggles.ordinal();
                break;
            case "R":
                slot = Supplies.measuringTape.ordinal();
                break;
            case "N":
                slot = Supplies.lockPick.ordinal();
                break;
            case "I":
                slot = Supplies.crowbar.ordinal();
                break;
            case "C":
                slot = Supplies.flashlight.ordinal();
                break;
            case "B":
                slot = Supplies.gun.ordinal();
                break;
            case "L":
                slot = Supplies.glassCutter.ordinal();
                break;
            case "K":
                slot = Supplies.rope.ordinal();
                break;
            case "D":
                slot = Supplies.calculator.ordinal();
                break;  
            case "P":
                slot = Supplies.phone.ordinal();
                break;  
            case "T":
                slot = Supplies.smokeBombs.ordinal();
                break;
            case "H":
                slot = Supplies.laptop.ordinal();
                break;
            default:
                System.out.println(
                                     "\n***************************************"
                                   + "\n***** Invalid Selection Try Again *****"
                                   + "\n***************************************");
                slot = -911;
                break;
        }
        return slot;
    }
}
