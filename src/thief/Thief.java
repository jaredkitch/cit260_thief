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
 * @author Jared
 */
public class Thief {

    /**
     * @param args the command line arguments
     */
    
    public static void jonTests() {
        
}
    public static void jaredTests() {
        Inventory inventory = new Inventory();
        inventory.setSuppliesInInventory(5);
        System.out.println(inventory.toString());
        
        Supplies supplies = new Supplies();
        supplies.setNames("bomb");
        supplies.setSupplyID(2);
        System.out.println(supplies.toString());
        
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
