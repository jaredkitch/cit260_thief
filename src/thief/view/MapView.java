/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.view;

import thief.model.Location;
import thief.model.Map;

/**
 * @author Jared
 */
public class MapView {
    
    public MapView(Map map) {
        String openingMenu =
        "\n.-------------------------------------------------------------------"
      + "\n| The Metropolitan Museum of Central City"
      + "\n|-------------------------------------------------------------------";
        System.out.println(openingMenu);

        for (int floor = 0; floor < map.getLocations()[floor].length;) {
            
            if (floor == 0) {
                System.out.print("| First floor\n");
            } else if (floor == 1) {
                System.out.print("| Second floor\n");
            }
            
            for (int row = 0; row < map.getLocations()[row].length;) {

                // print row header
                for (int column = 0; column < map.getLocations()[column].length;) {
                    System.out.print("+---------------+");
                    column++;
                }
                
                System.out.println(""); // go to next line
                
                // print coordinates
                for (int column = 0; column < map.getLocations()[column].length;) {
                    System.out.print("|      " + row + "," + column + "      |");
                    column++;
                }
                
                System.out.println(""); // go to next line
                
                // print location name
                for (int column = 0; column < map.getLocations()[column].length;) {
                    System.out.print("|               |");
                    column++;
                }
                
                System.out.println(""); // go to next line

                // print row footer
                for (int column = 0; column < map.getLocations()[column].length;) {
                    System.out.print("+---------------+");
                    column++;
                }
               row++;     
            } // end of row
            floor++;
        } // end of floor
            
        String closingMenu =
        "\n|-------------------------------------------------------------------"
      + "\n| || - Locked entry"
      + "\n'-------------------------------------------------------------------";
        System.out.println(closingMenu);
        
    }
}
    
    
    
    
    
    
    
    
    
    /*
    public MapView() {
        super(
               "First Floor                     Second Floor\n" +
               ".------.------.------.------.   .------.------.------.------.\n" +
               "|   1      2      3  |   4  |   |  13  |  14  |  15  |  16  |\n" +
               "|------+      +      +--||--|   |------+--||--+--||--+      |\n" +
               "|   5      6      7      8  |   |  17  |  18  |  19     20  |\n" +
               "|------+      +      +      |   |      +      +      +      |\n" +
               "|   9     10     11     12  |   |  21     22     23     24  |\n" +
               "'------'------'------'------'   '------'------'------'------'\n" +
               "\n" +
               "  || = locked entry\n" +
               "\n" +
               "   1 - Loading dock (to van)     14 - Diamond\n" +
               "   2 - Exhibit room              15 - Administration (locked)\n" +
               "   3 - Sculpture                 16 - Recovered Ship (Gold)\n" +
               "   4 - Security Room             17 - Janitor Closet\n" +
               "   5 - Bathrooms (air duct)      18 - Laser Protected Hallway\n" +
               "   6 - Hallway                   19 - Exhibit Room\n" +
               "   7 - Hallway                   20 - Balcony (stairs)\n" +
               "   8 - Main Entry (stairs)       21 - Stairs\n" +
               "   9 - Stairs                    22 - Hallway\n" +
               "  10 - Exhibit room              23 - Hallway\n" +
               "  11 - Exhibit room              24 - Vase\n" +
               "  12 - Lobby                     25 - Van\n" +
               "  13 - Control room (air duct)\n" +
               ".-------------------------------------------------------------------\n" +
               "| Press Q to return to the Main Menu");
    }
    
    @Override
    public boolean doAction(String choice) {
        return true;
    }
}
*/