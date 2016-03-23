/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.view;

import exceptions.TrapControlExceptions;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import thief.Thief;
import thief.control.TrapControl;

/**
 *
 * @author Jon
 */
public class KeypadEquationView {
    
    private String menu;
    protected final BufferedReader keyboard = Thief.getInFile();
    protected final PrintWriter console = Thief.getOutFile();
    
    public KeypadEquationView() {

    }

    
    public void displayMenu() throws TrapControlExceptions {
        
        double done = 0; // set flag to not done
        do {
            // prompt for and get players name
            menu = "\n.-------------------------------------------------------------------"
                + "\n| Please Enter Your First Value"
                + "\n|-------------------------------------------------------------------";
            
            int value1 = this.getValue();

            menu = "\n.-------------------------------------------------------------------"
                + "\n| Please Enter Your Second Value"
                + "\n|-------------------------------------------------------------------";            
            
            int value2 = this.getValue();
            
            menu = "\n.-------------------------------------------------------------------"
                + "\n| Please Enter Your Third Value"
                + "\n|-------------------------------------------------------------------"; 
            
            int value3 = this.getValue();
            
            // do the requested action and display the next view
            done = this.doAction(value1, value2, value3);
        } while (done == 0);
        
    }

    private int getValue() {
    
    int value = 0;
    
    boolean valid = false; //set flag to invalid value entered
    while(!valid) { // while a valid name has not been retrieved
try {       
        //prompt for the player's name
        this.console.println(this.menu);
       
        value = Integer.parseInt(this.keyboard.readLine()); 

        if (value >= 1000) { 
            ErrorView.display(this.getClass().getName(),
               "\n**********************************************************************"
             + "\n***** Invalid value - the value cannot be more than Three digits *****"
             + "\n**********************************************************************");
            continue;
           
        } else if (value <= 0) {
            ErrorView.display(this.getClass().getName(),
                       "\n**************************************************************"
                     + "\n***** Invalid value - the value cannot be less than Zero *****"
                     + "\n**************************************************************");
            continue;
        }
        valid = true; 
} catch (Exception e) {
    ErrorView.display(this.getClass().getName(),"Error Reading input: " + e.getMessage());
}
        
    }
    return value;

        
}
    private double doAction(int number1, int number2, int number3) throws TrapControlExceptions {
 
        double keypad = TrapControl.keypadCombination(number1, number2, number3);
        
        try {
            TrapControl.keypadCombination(number1, number2, number3);
        } catch (TrapControlExceptions me){
            ErrorView.display(this.getClass().getName(), me.getMessage());
        }
        
        
        this.console.println( "\n.-------------------------------------------------------------------"
                + "\n| The Keypad number is " + keypad + "                                          "
                + "\n|-------------------------------------------------------------------"); 
       
       return 7;
    }
    
}

