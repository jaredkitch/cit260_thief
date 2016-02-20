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
    
}
    public static void jaredTests() {
}
    
    public static void tishaTests() {
    }
    
    public static void groupTests() {
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here

        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
        
    }
    
}
