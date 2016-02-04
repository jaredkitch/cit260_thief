/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief;

import thief.model.*;
/**
 *
 * @author Jared
 */
public class Thief {

    /**
     * @param args the command line arguments
     */
    
    public static void jonTests() {
        
}
    public static void jaredTests() {
        
}
    public static void tishaTests() {
        Game game = new Game();
        game.setTurnsRemaining(50);
        System.out.println(game.toString());
        
        Guard guard = new Guard();
        guard.setLocation(5);
        guard.setSleepState("asleep");
        System.out.println(guard.toString());
    
        StealableItems stealableItems = new StealableItems();
        stealableItems.setName("Tish");
        stealableItems.setValue(100000);
        System.out.println(stealableItems.toString());
        
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
        
        jonTests(); 
        jaredTests();
        tishaTests();
        groupTests();
        
        
    }
    
}
