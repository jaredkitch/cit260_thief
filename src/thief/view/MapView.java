/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import thief.Thief;
import thief.model.DummyRoom;
import thief.model.Location;
import thief.model.Map;
import thief.model.StealableItemScene;
import thief.model.TrapScene;

/**
 * @author Jared
 */
public class MapView {
    
    private final BufferedReader keyboard = Thief.getInFile();
    private final PrintWriter console = Thief.getOutFile();
    
    public MapView(Map map) {
        String openingMenu =
        "\n.-------------------------------------------------------------------"
      + "\n| The Metropolitan Museum of Central City"
      + "\n|-------------------------------------------------------------------";
        this.console.println(openingMenu);
Location[][][] locations = map.getLocations();
//Determines floors locations
        for (int i = 0; i < 2; i++) {
                //Determines Row Locations
                if (i == 0) {
                    System.out.print("|\n|   First floor");
                } else if (i == 1) {
                    System.out.print("|\n|   Second floor");
                }
                for (int k = 0; k < 3; k++) {
                    String line = "|  |  ";
                    if (k == 0 && i == 0 ) {
                        System.out.println("\n|  .------.------.------.------.");
                    }
                    if (k == 1 && i == 0 ) {
                        System.out.println("\n|  |------+      +      +--||--|");
                    }
                    if (k == 2 && i == 0 ) {
                        System.out.println("\n|  |------+      +      +      |");
                    }
                    if (k == 0 && i == 1 ) {
                        System.out.println("\n|  .------.------.------.------.");
                    }
                    if (k == 1 && i == 1 ) {
                        System.out.println("\n|  |------+--||--+--||--+      |");
                    }
                    if (k == 2 && i == 1 ) {
                        System.out.println("\n|  |      +      +      +      |");
                    }
                    for(int j = 0; j < 4; j++) {
                      
                      if (locations[i][j][k].getType() == "D") {
                          String dumb = locations[i][j][k].getDummyRoom().getAbbreviation();
                          line += dumb ;
                      }
                      if (locations[i][j][k].getType() == "S") {
                          
                      String steal = locations[i][j][k].getStealableItemscenes().getAbbreviation();
                          line += steal;
                      }
                      if (locations[i][j][k].getType() == "T") {
                      String trap = locations[i][j][k].getTrapScene().getAbbreviation();
                          line += trap;
                      }                     
                                
 
                    }
                    line += "|"; 
                 this.console.println(line);     
                }
                this.console.println("\n|  '------'------'------'------'");
        }
        
        this.console.println("|\n" +
               "|   || = locked entry\n" +
               "|   \n" +
               "|   Van - Loading dock (to van)   DR - Diamond\n" +
               "|   E - Exhibit room              A - Administration (locked)\n" +
               "|   SC - Sculpture                G - Recovered Ship (Gold)\n" +
               "|   SE - Security Room            J - Janitor Closet\n" +
               "|   R - Bathrooms (air duct)      L - Laser Protected Hallway\n" +
               "|   H - Hallway                   B - Balcony (stairs)\n" +
               "|   ME - Main Entry (stairs)      ST - Stairs\n" +
               "|   L - Lobby                     V - Vase\n" +
               "|   CR - Control room (air duct)\n" +
               "'-------------------------------------------------------------------\n");
    }
}

    
    
    
    
    
    
    
    
    /* First Revision
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


        /* Second revision code
        for (int floor = 0; floor < 2;) {
            
            if (floor == 0) {
                System.out.print("| First floor\n");
            } else if (floor == 1) {
                System.out.print("| Second floor\n");
            }
            
            for (int row = 0; row < 4;) {

                // print row header
                for (int column = 0; column < map.getLocations()[column].length - 1 ;) {
                    System.out.print("+---------------+");
                    column++;
                }
                
                System.out.println(""); // go to next line
                
                // print coordinates
                for (int column = 0; column < map.getLocations()[column].length - 1;) {
                    System.out.print("|      " + row + "," + column + "      |");
                    column++;
                }
                
                System.out.println(""); // go to next line
                
                // print location name
                for (int column = 0; column < map.getLocations()[column].length -1 ;) {
                    System.out.print("|               |");
                    column++;
                }
                
                System.out.println(""); // go to next line

                // print row footer
                for (int column = 0; column < map.getLocations()[column].length - 1;) {
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
        */