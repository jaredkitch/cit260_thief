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
 * @author Jared
 */
public class BlowUpSafeView {
        
    private String menu;
    
    protected final BufferedReader keyboard = Thief.getInFile();
    protected final PrintWriter console = Thief.getOutFile();

    public BlowUpSafeView() throws TrapControlExceptions{

    }
    
    public void displayMenu() throws TrapControlExceptions {
        
        double done = 0; // set flag to not done
        do {
            // prompt for safe dimensions
            menu = "\n.-------------------------------------------------------------------"
                 + "\n| What is the safe's height in inches?"
                 + "\n'-------------------------------------------------------------------";
            
            int height = this.getValue();

            menu = "\n.-------------------------------------------------------------------"
                 + "\n| What is the safe's width in inches?"
                 + "\n'-------------------------------------------------------------------";            
            
            int width = this.getValue();
            
            menu = "\n.-------------------------------------------------------------------"
                 + "\n| What is the safe's length in inches?"
                 + "\n'-------------------------------------------------------------------"; 
            
            int length = this.getValue();
            
            menu = "\n.-------------------------------------------------------------------"
                 + "\n| How many pounds of C4 should you use per cubic foot?"
                 + "\n'-------------------------------------------------------------------"; 
            
            int c4PerFoot = this.getValue();
            
            // do the requested action and display the next view
            done = this.doAction(height, width, length, c4PerFoot);
        } while (done == 0);
    }

    private int getValue() {
        
        int value = 0;
    
        boolean valid = false; //set flag to invalid value entered
        
        try {
        while(!valid) { // while a valid dimension has not been retrieved
        
            //display the prompt
            this.console.println(this.menu);
       
            value = Integer.parseInt(this.keyboard.readLine()); //get the dimension from the keyboard

            if (value >= 100) { 
                ErrorView.display(this.getClass().getName(),
                "\n**************************************************************"
              + "\n***** Invalid value - the value cannot be more than 100. *****"
              + "\n**************************************************************");
                continue;
            } else if (value <= 0) {
                ErrorView.display(this.getClass().getName(),
                "\n***************************************************************"
              + "\n***** Invalid value - the value must be greater than zero *****"
              + "\n***************************************************************");
                continue;
            }
        
            valid = true; // set flag to end repetition
        }
        
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }
        return value; 
    }
    
    private double doAction(int number1, int number2, int number3, int number4) throws TrapControlExceptions {
 
        try {
            TrapControl.calculatePoundsOfC4(number1, number2, number3, number4);
        } catch (TrapControlExceptions me){
            ErrorView.display(this.getClass().getName(), "Stop inserting bad stuff");
            displayMenu();
        }
        
        double c4Amount = TrapControl.calculatePoundsOfC4(number1, number2, number3, number4);


            this.console.println(
            "\n.-------------------------------------------------------------------"
          + "\n| You should use " + c4Amount + " pounds of C4"
          + "\n'-------------------------------------------------------------------"); 
            return 7;
        
    }
}
