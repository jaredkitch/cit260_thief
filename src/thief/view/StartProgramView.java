/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.view;

import java.util.Scanner;
import thief.control.GameControl;
import thief.model.Player;

/**
 *
 * @author Tish
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
            //promptMessage = "Please enter your name:"
            //display the banner page
        
            this.promptMessage = 
        "\n.-------------------------------------------------------------------"
      + "\n| Please enter your name: "
      + "\n'-------------------------------------------------------------------";
            // display the banner when view is created
            this.displayBanner();
    }

    public void displayBanner() {
        
        System.out.println(
"                 1fC00Gt                                                                 \n" +
"              GGGGG0GGGG0                                                                \n" +
"           i0GGG0GC00GGGG.                                                               \n" +
"          ,GGGGG0GGG0GGGi .::.                                                           \n" +
"         ,GGGCCL08@@@L;fi:::::::i                                                        \n" +
"           :00@t@@@f:t1::;;;;::::1                                                       \n" +
"            ii;,,::iL;::L11;::::::;    _________         _________ _______  _______      \n" +
"              G11LC::::C1111i;;;;1     \\__   __/|\\     /|\\__   __/(  ____ \\(  ____ \\     \n" +
"              ;GLfi::::,1111111i,         ) (   | )   ( |   ) (   | (    \\/| (    \\/     \n" +
"             f1tGft:;:C;:::;;;t.          | |   | (___) |   | |   | (__    | (__         \n" +
"            .f;;GGf1ttGG;;:::;f           | |   |  ___  |   | |   |  __)   |  __)        \n" +
"            f:::GGGfffGGGL;;:::           | |   | (   ) |   | |   | (      | (           \n" +
"           f:::;0GGLffCGGGGGG0            | |   | )   ( |___) (___| (____/\\| )           \n" +
"         .1::i:G00CCCCfCGGGGG;            )_(   |/     \\|\\_______/(_______/|/            \n" +
"        t:::GLLCCCCCCCCGC001                                                             \n" +
"     ,f0Gt:;1GCCCG0,  GGGC0G.it    ¸.•*´¨¨`*•.¸¸.•*´¨ A Text Adventure ¨´*•.¸¸.•*´¨¨`*•.¸\n" +
" .LGGGi  ..tCCG0,     :GGCGt:                                by                          \n" +
"iGGG       :CCG        LCCG,            Jon Lester, Tisha Parkinson, and Jared Kitch     \n" +
".;t,        LCC1        CCG0.                                                            \n" +
"             0CCCL       iGGGf;                                                          \n" +
"             .CGGG8        ,GGCG0L                                                       \n" +
"              tGG0           ,CG0L                                                       \n" +
"              8GL             tC0f                                                       \n" +
"             fGG,            1GG01                                                       \n"+
"   .088000000800000000000000000088L                                                      ");
    }

    public void displayStartProgramView() {
        
       boolean done = false; // set flag to not done
       do {
           //promt for and get players name
           String playersName = this.getPlayersName();
           if (playersName.toUpperCase().equals("Q")) // user wants to quit
               return; //exit the game
           
        // do the requested action and display the next view
           done = this.doAction(playersName);
           
       }while (!done);
       }

    private String getPlayersName() {
        
    Scanner keyboard = new Scanner(System.in); //keyboard input stream
    String value = "";
    
    boolean valid = false; //set flag to invalid value entered
    while(!valid) { // while a valid name has not been retrieved
        
        //prompt for the player's name
        System.out.println(this.promptMessage);
        
        value = keyboard.nextLine(); //get the name from the keyboard
        value = value.trim(); //trim off teh excess blanks
        
        // if the name is invalid (less than one character in length))
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

          private void displayNextView(Player player) {
       
        // display a custom welcome message
        System.out.println(
        "\n.-------------------------------------------------------------------"
      + "\n| Welcome to the game " + player.getName()
      + "\n| We hope you have a lot fun!"
      + "\n'-------------------------------------------------------------------"
      );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.display();
                
    }
    private boolean doAction(String playersName) {
    // if the length of the playersNAme < 2 then
        //display "Invalid name: The name must be . 1 character"
        //return false
        
        if (playersName.length() < 2) {
            System.out.println(
                          "\n**************************************************"
                        + "\n***** Invalid players name. The name must be *****"
                        + "\n***** greater than one character in length   *****"
                        + "\n**************************************************"
            );
            return false;
        }
        // create Player with specified name
        // if unsuccessful then
            //display "Invalid name: The name is too short"
        // return false
        
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { // if unsuccessful
            System.out.println(
                                      "\n**************************************"
                                    + "\n***** Error creating the player. *****"
                                    + "\n**************************************"
            );
            return false;
        }
        // display customized welcome message
        //display mainMenuView
        //return true
        
        // display next view
        this.displayNextView(player);
        
        return true; // success!!!
    }
          
}

    

