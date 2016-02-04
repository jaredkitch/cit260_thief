/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief;

import java.util.HashSet;
import java.util.Set;
import thief.model.*;
/**
 *
 * @author Jon, Jared, Tisha
 */
public class Thief {

    /**
     * @param args the command line arguments
     */
    
    public static void jonTests() {
        
        //Map class test cases
        
        Map mapSpotOne = new Map();
        mapSpotOne.setX_axis(7);
        mapSpotOne.setY_axis(2);
        mapSpotOne.setZ_axis(0);
        mapSpotOne.setAssociatedLocation(21);
        System.out.println(mapSpotOne.toString());
        
        //Location class test cases
        Location hallway = new Location();
        hallway.setAvailableCommands(6);
        hallway.setLocationNumber(21);
        System.out.println(hallway.toString());
        
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
        
        // Inventory test cases
        Inventory inventory = new Inventory();
        inventory.setSuppliesInInventory(5);
        System.out.println(inventory.toString());
        
        // Supplies test cases
        Supplies supplies = new Supplies();
        supplies.setNames("bomb");
        supplies.setSupplyID(2);
        System.out.println(supplies.toString());
        
        // Van test cases
        Van van = new Van();
        van.setAvailableSupplies(2);
        System.out.println(van.toString());
}
    
    public static void tishaTests() {
        
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
