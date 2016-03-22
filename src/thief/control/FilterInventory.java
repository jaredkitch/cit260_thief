/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.control;

import thief.Thief;
import thief.model.Game;
import thief.model.InventoryItem;
import thief.model.Player;

/**
 *
 * @author Jon
 */
public class FilterInventory {
    
    public String FilterInventory(String Input) {
        
        String search = null;
        
        Player player = Thief.getPlayer();
        InventoryItem[] inventory = player.getPlayerinven();
        
        for (InventoryItem inventory1 : inventory) {
            if (inventory1.getDescription() == Input ){
                search = (Input + " is Currently in your inventory!");
            } else {
               search = (Input + " is currently not in your inventory!");
            }
               
        }
 {
             
    }
        
        return search;
        
    }
    
    
}
