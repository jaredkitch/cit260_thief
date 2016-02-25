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
 * @author Jared
 */
public class C4CalculationView {
        
    private String menu;

    public C4CalculationView() {

    }
    
    public void displayMenu() {
        
        double done = 0; // set flag to not done
        do {
            // prompt for and get players name
            menu = "\n.------------------------------------------------- )xxxxx[;;;;;;;;;>"
                 + "\n| What is the safe's height in inches?"
                 + "\n|-------------------------------------------------------------------";
            
            int height = this.getValue();

            menu = "\n.------------------------------------------------- )xxxxx[;;;;;;;;;>"
                 + "\n| What is the safe's width in inches?"
                 + "\n|-------------------------------------------------------------------";            
            
            int width = this.getValue();
            
            menu = "\n.------------------------------------------------- )xxxxx[;;;;;;;;;>"
                 + "\n| What is the safe's length in inches?"
                 + "\n|-------------------------------------------------------------------"; 
            
            int length = this.getValue();
            
            menu = "\n.------------------------------------------------- )xxxxx[;;;;;;;;;>"
                 + "\n| How much C4 should you use per cubic foot?"
                 + "\n|-------------------------------------------------------------------"; 
            
            int c4PerFoot = this.getValue();
            
            // do the requested action and display the next view
            done = this.doAction(height, width, length, c4PerFoot);
        } while (done == 0);
    }

    private int getValue() {
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        int value = 0;
    
        boolean valid = false; //set flag to invalid value entered
        while(!valid) { // while a valid dimension has not been retrieved
        
            //prompt for the player's name
            System.out.println(this.menu);
       
            value = keyboard.nextInt(); //get the dimension from the keyboard

            if (value >= 100) { 
                System.out.println(
                "\n**************************************************************"
              + "\n***** Invalid value - the value cannot be more than 100. *****"
              + "\n**************************************************************");
                continue;
            } else if (value <= 0) {
                System.out.println(
                "\n***************************************************************"
              + "\n***** Invalid value - the value must be greater than zero *****"
              + "\n***************************************************************");
                continue;
            }
        
            valid = true; // set flag to end repetition
        }
        return value; 
    }
    
    private double doAction(int number1, int number2, int number3, int number4) {
 
        double c4Amount = TrapControl.calculatePoundsOfC4(number1, number2, number3, number4);
        
        if (c4Amount >= 0){
            System.out.println(
            "\n.------------------------------------------------- )xxxxx[;;;;;;;;;>"
          + "\n| You should use " + c4Amount + "pounds of C4"
          + "\n|-------------------------------------------------------------------"); 
            return 7;
        } else if (c4Amount == -911){
            System.out.println( 
            "\n.------------------------------------------------------------- )xxxxx[;;;;;;;;;>"
          + "\n| Something happened while you were calulating check your numbers and try again!"
          + "\n|-------------------------------------------------------------------------------"); 
            return 0;
        }
        return 0;
    }
}
