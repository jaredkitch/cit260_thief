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
