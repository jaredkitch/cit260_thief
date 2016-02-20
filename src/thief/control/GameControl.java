/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.control;

import thief.Thief;
import thief.model.Player;

/**
 *
 * @author Tish
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        
        Player player = new Player();
        player.setName(name);
        
        Thief.setPlayer(player); // save the player
        
        return player;
    
}
}
