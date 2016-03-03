/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.view;

/**
 * @author Jared
 */
public class MapView extends View {
    
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