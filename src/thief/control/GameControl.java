/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.control;

import thief.Thief;
import thief.model.DummyRoom;
import thief.model.Game;
import thief.model.Guard;
import thief.model.InventoryItem;
import thief.model.Location;
import thief.model.Map;
import thief.model.Player;
import thief.model.StealableItemScene;
import thief.model.TrapScene;
import thief.model.Van;


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
        player.createInventoryList();
        player.getStolenItems();
        player.getInventory();
        Thief.setPlayer(player); // save the player
        
        
        return player;
    
}

    public static void createNewGame(Player player) {
        Game game = new Game();
        Thief.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        Van van = new Van();
        game.setVan(van);
        
        Guard guards = new Guard();
        game.setGuards(guards);
        
        

        
    }


    static void assignScenesToLocations(Map map, StealableItemScene[] stealable, DummyRoom[] dummy, TrapScene[] trap) {
        Location[][][] locations = map.getLocations();
        
        //Dummy Rooms
        locations[0][0][0].setDummyRoom(dummy[SceneType.van.ordinal()]);
        locations[0][1][0].setDummyRoom(dummy[SceneType.exhibitRoom.ordinal()]);
        locations[0][1][2].setDummyRoom(dummy[SceneType.exhibitRoom.ordinal()]);
        locations[0][2][2].setDummyRoom(dummy[SceneType.exhibitRoom.ordinal()]);
        locations[1][2][1].setDummyRoom(dummy[SceneType.exhibitRoom.ordinal()]);
        locations[0][1][1].setDummyRoom(dummy[SceneType.hallway.ordinal()]);
        locations[0][2][1].setDummyRoom(dummy[SceneType.hallway.ordinal()]);
        locations[1][2][2].setDummyRoom(dummy[SceneType.hallway.ordinal()]);
        locations[1][3][1].setDummyRoom(dummy[SceneType.balcony.ordinal()]);
        locations[1][0][1].setDummyRoom(dummy[SceneType.janitorCloset.ordinal()]);
        locations[0][0][2].setDummyRoom(dummy[SceneType.stairs.ordinal()]);
        locations[1][0][2].setDummyRoom(dummy[SceneType.stairs.ordinal()]);
        locations[0][3][1].setDummyRoom(dummy[SceneType.mainEntry.ordinal()]);
        locations[0][0][1].setDummyRoom(dummy[SceneType.bathrooms.ordinal()]);
        locations[0][3][2].setDummyRoom(dummy[SceneType.lobby.ordinal()]);
        
        //Stealable Item Rooms
        locations[1][1][0].setStealableItemScenes(stealable[SceneType.diamondRoom.ordinal()]);
        locations[0][2][0].setStealableItemScenes(stealable[SceneType.sculptureRoom.ordinal()]);
        locations[1][3][0].setStealableItemScenes(stealable[SceneType.goldRoom.ordinal()]);        
        locations[1][3][2].setStealableItemScenes(stealable[SceneType.vaseRoom.ordinal()]);
        locations[1][1][2].setStealableItemScenes(stealable[SceneType.paintingRoom.ordinal()]);
        
        //Trap Rooms
        locations[0][3][0].setTrapScene(trap[SceneType.securityRoom.ordinal()]);
        locations[1][2][0].setTrapScene(trap[SceneType.administration.ordinal()]);
        locations[1][0][0].setTrapScene(trap[SceneType.controlRoom.ordinal()]);
        locations[1][1][1].setTrapScene(trap[SceneType.laserRoom.ordinal()]);
    }


    public static InventoryItem[] getSortedInventoryList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
