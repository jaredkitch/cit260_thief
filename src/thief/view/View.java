/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import thief.Thief;

/**
 *
 * @author Jared
 */
public abstract class View implements ViewInterface {

    protected String menu;
    
    protected final BufferedReader keyboard = Thief.getInFile();
    protected final PrintWriter console = Thief.getOutFile();
    
    private String promptMessage = 
          "| Please Enter Your Selection: "
      + "\n'-------------------------------------------------------------------";
    
    public View() {
    }
    
    public View(String message) {
     this.menu = message;
    }
    
    @Override
    public void display() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(value);
        } while (!done);
    }
    
    
    @Override
    public String getInput() {
        
        String value = "";
        boolean valid = false; //set flag to invalid value entered
try {
        while(!valid) { // while a valid name has not been retrieved
        
            
            //prompt for the player's name
            this.console.println(this.menu);
            this.console.println(this.promptMessage);
        

            value = this.keyboard.readLine();//get the name from the keyboard
            value = value.trim(); //trim off the excess blanks
            value = value.toUpperCase(); // converts to upper case letter  
            
            if (value.length() >= 2) {
              ErrorView.display(this.getClass().getName(),
                "\n*************************************************************"
               + "\n***** Invalid value - the value cannot be more than one *****"
               + "\n*************************************************************");
                continue; // and repeat again
            }
            if (value.length() < 1) {
               ErrorView.display(this.getClass().getName(),
                       "\n*****************************************************"
                     + "\n***** Invalid value - the value cannot be blank *****"
                     + "\n*****************************************************");
              continue; // and repeat again
}
}
} catch(Exception e) { 
            ErrorView.display(this.getClass().getName(), "Error Reading Input: " + e.getMessage());
            
            }
            valid = true; // set flag to end repetition
            
            return value; // return the value
        }
    
    }

