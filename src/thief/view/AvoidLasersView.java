/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.view;

import java.util.Scanner;
import thief.control.TrapControl;

/**
 *
 * @author Jon
 */
public class AvoidLasersView {

    private String menu;

    
    public AvoidLasersView() {

    }

    
    public void displayMenu() {
        
        double done = 0; // set flag to not done
        do {
            // prompt for and get players name
            menu = "\n.-------------------------------------------------------------------"
                + "\n| Please Enter The Length Of The Laser Field"
                + "\n|-------------------------------------------------------------------";
            
            int value1 = this.getValue();

            menu = "\n.-------------------------------------------------------------------"
                + "\n| Please Enter The Height Of The Laser Field"
                + "\n|-------------------------------------------------------------------";            
            
            int value2 = this.getValue();
            
            menu = "\n.-------------------------------------------------------------------"
                + "\n| Please Enter The Number Of Lasers In The Laser Field"
                + "\n|-------------------------------------------------------------------"; 
            
            int value3 = this.getValue();
            
            // do the requested action and display the next view
            done = this.doAction(value1, value2, value3);
        } while (done == 0);
        
    }

    private int getValue() {
    Scanner keyboard = new Scanner(System.in); //keyboard input stream
    int value = 0;
    
    boolean valid = false; //set flag to invalid value entered
    while(!valid) { // while a valid name has not been retrieved
        
        //prompt for the player's name
        System.out.println(this.menu);
       
        value = keyboard.nextInt(); //get the name from the keyboard

        if (value >= 1000) { 
            System.out.println(
               "\n**********************************************************************"
             + "\n***** Invalid value - the value cannot be more than Three digits *****"
             + "\n**********************************************************************");
            continue;
           
        } else if (value <= 0) {
            System.out.println(
                       "\n**************************************************************"
                     + "\n***** Invalid value - the value cannot be less than Zero *****"
                     + "\n**************************************************************");
            continue;
        }
        
        valid = true; // set flag to end repetition
    }
   return value; 

        
}
    private double doAction(int number1, int number2, int number3) {
 
        double keypad = TrapControl.keypadCombination(number1, number2, number3);
        
        if (keypad >= 0){
        System.out.println( "\n.-------------------------------------------------------------------"
                + "\n| The Keypad number is " + keypad + "                                          "
                + "\n|-------------------------------------------------------------------"); 
        return 7;
        } else if (keypad == -911){
        System.out.println( 
                  "\n.-------------------------------------------------------------------------------"
                + "\n| Something happened while you were calulating check your numbers and try again!"
                + "\n|-------------------------------------------------------------------------------"); 
        return 0;
        }
       return 0;
    }
    
}

