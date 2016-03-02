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
public class HelpMenuView {
    
  private String menu;
    private String promptMessage = 
          "| Please Enter Your Selection: "
      + "\n'-------------------------------------------------------------------";
    
    public HelpMenuView() {
        menu = 
        "\n.-------------------------------------------------------------------"
      + "\n| Help Menu"
      + "\n|-------------------------------------------------------------------"
      + "\n| G - What's the Goal of the Game?"
      + "\n| M - How do you move?"
      + "\n| S - How do I save the game?"
      + "\n| I - How do I steal Items?"
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
            case "G":
                this.gameGoal();
                break;
            case "M":
                this.howToMove();
                break;
            case "S":
                this.howToSave();
                break;
            case "I":
                this.howToSteal();
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

    private void gameGoal() {
        System.out.println(
        "\n.-------------------------------------------------------------------"
      + "\n| What's the Goal of the Game?"
      + "\n|-------------------------------------------------------------------"       
      + "\n| You are a master thief with your eye on the local museum as your"
      + "\n| big score. This is no small task. The museum is two stories with"
      + "\n| numerous different rooms and hidden walkways. Your job is to steal"
      + "\n| as many valuables as you can before the alarm sounds or security"
      + "\n| catches you."
      + "\n|"
      + "\n| The game starts with you in the van getting ready to go through"
      + "\n| the loading dock of the museum. Your job is to safely navigate the"
      + "\n| museum, steal the items and escape in your van before the cops"
      + "\n| arrive."
      + "\n|"
      + "\n| You have a set amount of turns to get out before getting caught."
      + "\n'-------------------------------------------------------------------"
        );
    }

    private void howToMove() {
        System.out.println(
        "\n.-------------------------------------------------------------------"
      + "\n| How do you move?"
      + "\n|-------------------------------------------------------------------"
      + "\n| From the Game Menu, select M to Move."
      + "\n|"
      + "\n| Next press N, S, E, W depending on which direction you would like"
      + "\n| to Move. In some cases, you may be able to select T for stairs."
      + "\n| The room that you moved to will then be displayed."
      + "\n'-------------------------------------------------------------------"
        );
    }

    private void howToSave() {
        System.out.println(
        "\n.-------------------------------------------------------------------"
      + "\n| How do I save the game?"
      + "\n|-------------------------------------------------------------------"
      + "\n| To save the current game go to Game Menu. Select S to save your"
      + "\n| game . Then you can return to it later if you wish."
      + "\n'-------------------------------------------------------------------"
        );
    }

    private void howToSteal() {
        System.out.println(
        "\n.-------------------------------------------------------------------"
      + "\n| How do I steal Items?"
      + "\n|-------------------------------------------------------------------"
      + "\n| Stealing items will require you to solve a problem. Depending on"
      + "\n| the item, you will need to Pick a Lock, Dodge a Laser, or even"
      + "\n| Blow Open a Safe. Have fun, and don't blow yourself up! You can"
      + "\n| always see what what items there are to steal by selecting I from"
      + "\n| the Game Menu."
      + "\n'-------------------------------------------------------------------"
        );
    }

}