/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.view;

/**
 *
 * @author Tish
 */
public class MoveLocationView extends View {
    
    public MoveLocationView() {
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
        "\n.-------------------------------------------------------------------"
      + "\n| Select the direction you want to move from the map above.         "    
      + "\n| Remember your moves are limited so choose wisely.                 " 
      + "\n|-------------------------------------------------------------------"
      + "\n| N - Move one room to the North"
      + "\n| S - Move one room to the South"
      + "\n| W - Move one room to the West"
      + "\n| E - Move one room to the East"
      + "\n| / - Take the stars to the other level"
      + "\n| Q - Quit"
      + "\n|-------------------------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        
        switch (choice) {
            case "N":
                this.moveToTheNorth();
                break;
            case "S":
                this.moveToTheSouth();
                break;
            case "W":
                this.moveToTheWest();
                break;
            case "E":
                this.moveToTheEast();
                break;
            case "/":
                this.moveToOtherFloor();
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

    private void moveToTheNorth() {
        System.out.println(
        "\n.-------------------------------------------------------------------"
      + "\n| Move Confirmed"
      + "\n|-------------------------------------------------------------------"
      + "\n| You just moved one room to the North."
      + "\n'-------------------------------------------------------------------"
        );
    }

    private void moveToTheSouth() {
        System.out.println(
     "\n.-------------------------------------------------------------------"
      + "\n| Move Confirmed"
      + "\n|-------------------------------------------------------------------"
      + "\n| You just moved one room to the South."
      + "\n'-------------------------------------------------------------------"
        );
    }

    private void moveToTheWest() {
        System.out.println(
        "\n.-------------------------------------------------------------------"
      + "\n| Move Confirmed"
      + "\n|-------------------------------------------------------------------"
      + "\n| You just moved one room to the West."
      + "\n'-------------------------------------------------------------------"
        );
    }

    private void moveToTheEast() {
        System.out.println(
       "\n.-------------------------------------------------------------------"
      + "\n| Move Confirmed"
      + "\n|-------------------------------------------------------------------"
      + "\n| You just moved one room to the East."
      + "\n'-------------------------------------------------------------------"
        );
    }
    
    private void moveToOtherFloor() {        
        System.out.println(
        "\n.-------------------------------------------------------------------"
      + "\n| Move Confirmed"
      + "\n|-------------------------------------------------------------------"
      + "\n| You just moved to the other floor."
      + "\n'-------------------------------------------------------------------"
        );
    }

}
