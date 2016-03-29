/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.view;

import thief.Thief;
import thief.model.Player;

/**
 *
 * @author Tish
 */
public class MoveLocationView extends View {
    
    public MoveLocationView() {
               super(
                      "First Floor                     Second Floor\n" +
               ".------.------.------.------.   .------.------.------.------.\n" +
               "|   0      1      2  |   3  |   |  12  |  13  |  14  |  15  |\n" +
               "|------+      +      +--||--|   |------+--||--+--||--+      |\n" +
               "|   4      5      6      7  |   |  16  |  17  |  18     19  |\n" +
               "|------+      +      +      |   |      +      +      +      |\n" +
               "|   8     9     10     11   |   |  20     21     22     23  |\n" +
               "'------'------'------'------'   '------'------'------'------'\n" +
               "\n" +
               "  || = locked entry\n" +
               "\n");
        Player player = Thief.getPlayer();     
        this.console.println("\n You are Currently located at " + player.getLocation());
        String out = "\n.-------------------------------------------------------------------"
                   + "\n| Select the direction you want to move from the map above.         "    
                   + "\n| Remember your moves are limited so choose wisely.                 " 
                   + "\n|-------------------------------------------------------------------";
        int loc = player.getLocation();
        
        //Generate North Available Rooms
        if (loc == 5  || loc == 6 || loc == 7 || loc == 9 || loc == 10 || loc == 21 || loc == 22 || loc == 11
                || loc == 23 || loc == 18 || loc == 20 || loc == 19) {
            out += "\n| N - Move one room to the North";
            
        }
        //Generate South Available Rooms
        if (loc == 3 || loc == 13 || loc == 14 || loc == 15 || loc == 16 || loc == 2 || loc == 1 || loc == 5
                || loc == 6 || loc == 7 || loc == 18 || loc == 17 || loc == 19){
            out += "\n| S - Move one room to the South";
        }
        //Generate East Available Rooms
        if (loc == 0 || loc == 1 || loc == 4 || loc == 8 || loc == 5 || loc == 6 || loc == 9 || loc == 10 
                || loc == 21 || loc == 22 || loc == 18 || loc == 20){
            out += "\n| E - Move one room to the East";
        }
        //Generate West Available Rooms
        if (loc == 2 || loc == 5 || loc == 6 || loc == 7 || loc == 9 || loc == 10 || loc == 21 || loc == 22
                || loc == 11 || loc == 23 || loc == 19|| loc == 20){
            out += "\n| W - Move one room to the West";
        }
        //Generate Up Avilable Rooms
        if (loc == 4 || loc == 8 || loc == 7){
            out += "\n| U - Move Up to the Next Level";
        }
        //Generate Down Available Rooms
        if (loc == 20 || loc == 19 || loc == 12){
            out += "\n D - Move Down to the Previous Level";
        }
        out += "\n|-------------------------------------------------------------------"
                + "\n";
        this.console.println(out);
    }

    @Override
    public boolean doAction(String choice) {
        Player player = Thief.getPlayer();
        int loc = player.getLocation();
        
        switch (choice) {
            case "N":
                if (loc == 5  || loc == 6 || loc == 7 || loc == 9 || loc == 10 || loc == 21 || loc == 22 || loc == 11
                    || loc == 23 || loc == 18 || loc == 20 || loc == 19){
                this.moveToTheNorth(loc);                
            } else {
                this.console.println("\n***************************************"
                                   + "\n***** Invalid Selection Try Again *****"
                                   + "\n***************************************");
                }                 
                break;
            case "S":
                if (loc == 3 || loc == 13 || loc == 14 || loc == 15 || loc == 16 || loc == 2 || loc == 1 || loc == 5
                    || loc == 6 || loc == 7 || loc == 18 || loc == 17 || loc == 19){
                this.moveToTheSouth(loc);
             } else {
                this.console.println("\n***************************************"
                                    + "\n***** Invalid Selection Try Again *****"
                                   + "\n***************************************");                 
                }
                break;
            case "W":
                if (loc == 2 || loc == 5 || loc == 6 || loc == 7 || loc == 9 || loc == 10 || loc == 21 || loc == 22
                    || loc == 11 || loc == 23 || loc == 19|| loc == 20) {
                this.moveToTheWest(loc);
            } else {
                this.console.println("\n***************************************"
                                    + "\n***** Invalid Selection Try Again *****"
                                   + "\n***************************************");               
                }
                break;
            case "E":
                if (loc == 0 || loc == 1 || loc == 4 || loc == 8 || loc == 5 || loc == 6 || loc == 9 || loc == 10 
                    || loc == 21 || loc == 22 || loc == 18 || loc == 20) {
                    this.moveToTheEast(loc);
                } else {
                    this.console.println("\n***************************************"
                                       + "\n***** Invalid Selection Try Again *****"
                                       + "\n***************************************");                
                }
                break;
            case "D":
                if (loc == 20 || loc == 19 || loc == 12){
                    this.moveToLowerFloor(loc);
                } else {
                    this.console.println("\n***************************************"
                                       + "\n***** Invalid Selection Try Again *****"
                                       + "\n***************************************");                
            }
                break;
            case "U":
                if (loc == 4 || loc == 8 || loc == 7) {
                    this.movetoUpperFloor(loc);
                } else {
                    this.console.println("\n***************************************"
                                       + "\n***** Invalid Selection Try Again *****"
                                       + "\n***************************************");                    
                }              
            default:
                this.console.println("\n***************************************"
                                   + "\n***** Invalid Selection Try Again *****"
                                   + "\n***************************************");
                break;
        }
        return true;
    }

    private void moveToTheNorth(int loc) {
        this.console.println(
        "\n.-------------------------------------------------------------------"
      + "\n| Move Confirmed"
      + "\n|-------------------------------------------------------------------"
      + "\n| You just moved one room to the North."
      + "\n'-------------------------------------------------------------------"
        );
        Player player = Thief.getPlayer();
        player.setLocation((loc - 4));
    }

    private void moveToTheSouth(int loc) {
        this.console.println(
     "\n.-------------------------------------------------------------------"
      + "\n| Move Confirmed"
      + "\n|-------------------------------------------------------------------"
      + "\n| You just moved one room to the South."
      + "\n'-------------------------------------------------------------------"
        );
        Player player = Thief.getPlayer();
        player.setLocation((loc + 4));
    }

    private void moveToTheWest(int loc) {
        this.console.println(
        "\n.-------------------------------------------------------------------"
      + "\n| Move Confirmed"
      + "\n|-------------------------------------------------------------------"
      + "\n| You just moved one room to the West."
      + "\n'-------------------------------------------------------------------"
        );
        Player player = Thief.getPlayer();
        player.setLocation((loc - 1));
    }

    private void moveToTheEast(int loc) {
        this.console.println(
       "\n.-------------------------------------------------------------------"
      + "\n| Move Confirmed"
      + "\n|-------------------------------------------------------------------"
      + "\n| You just moved one room to the East."
      + "\n'-------------------------------------------------------------------"
        );
        Player player = Thief.getPlayer();
        player.setLocation((loc + 1));
    }

    private void moveToLowerFloor(int loc) {
        if (loc == 12) {
        this.console.println(
        "\n.-------------------------------------------------------------------"
      + "\n| Move Confirmed"
      + "\n|-------------------------------------------------------------------"
      + "\n| You Succesffully Crawl through the Air Ducts."
      + "\n'-------------------------------------------------------------------");
        Player player = Thief.getPlayer();
        player.setLocation(5);
        } else {
        this.console.println(
        "\n.-------------------------------------------------------------------"
      + "\n| Move Confirmed"
      + "\n|-------------------------------------------------------------------"
      + "\n| You just moved to the other floor."
      + "\n'-------------------------------------------------------------------");
        Player player = Thief.getPlayer();
        player.setLocation((loc - 12));
        }
    }

    private void movetoUpperFloor(int loc) {
        if (loc == 5){
        this.console.println(
        "\n.-------------------------------------------------------------------"
      + "\n| Move Confirmed"
      + "\n|-------------------------------------------------------------------"
      + "\n| You Succesffully Crawl through the Air Ducts."
      + "\n'-------------------------------------------------------------------");
        Player player = Thief.getPlayer();
        player.setLocation(12);
        } else {
        this.console.println(
        "\n.-------------------------------------------------------------------"
      + "\n| Move Confirmed"
      + "\n|-------------------------------------------------------------------"
      + "\n| You just moved to the other floor."
      + "\n'-------------------------------------------------------------------");
        Player player = Thief.getPlayer();
        player.setLocation((loc + 12));
        }
    }

}
