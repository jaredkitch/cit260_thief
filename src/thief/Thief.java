/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief;

import java.util.HashSet;
import java.util.Set;
import thief.model.*;
import thief.view.StartProgramView;
/**
 *
 * @author Jon, Jared, Tisha
 */
public class Thief {

    /**
     * @param args the command line arguments
     */
    
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Thief.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Thief.player = player;
    }
    
    
    
    public static void jonTests() {
        
         
         //Location class test cases

         
         //Stealabile Item Scene Class test cases
         StealableItemScene vaseRoom = new StealableItemScene();
         vaseRoom.setDescription("The vase sits behind a large glass case");
         vaseRoom.setInteractables(7);
         System.out.println(vaseRoom.toString());
         
         //Dummy Room Class test cases
         DummyRoom lobby = new DummyRoom();
         lobby.setDescription("This ornate room houses the Front desk and a set of stairs up");
        System.out.println(lobby.toString());
         
         //Trap Scence Class test cases
         TrapScene lasers = new TrapScene();
         lasers.setDescription("Many lasers dance around the hallway as look across to see the diamond.");
         lasers.setInteractables(3);
         lasers.setTypeOfTrap("Laser");
         System.out.println(lasers.toString());
     
}
    public static void jaredTests() {

         
}
    
    public static void tishaTests() {
        Game game = new Game();
         game.setTurnsRemaining(50);
         System.out.println(game.toString());
          

     

         
        StolenItems stolenItems = new StolenItems();
         stolenItems.setTotalValue(500000);
         stolenItems.setItemsStillInPlay("painting, vase, diamonds");
         System.out.println(stolenItems.toString());
    }
    
    public static void groupTests() {
        
        Player player = new Player();
         player.setName("Jon");
         player.setLocation(8);
         player.setFastestTime(30);
         player.setBiggestHaul(5000);
         System.out.println(player.toString());
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here

        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
        
    }
    
}
