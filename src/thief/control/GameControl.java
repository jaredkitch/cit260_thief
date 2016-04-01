/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.control;

import exceptions.GameControlExceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
        player.setPlayerinven(player.createInventoryList());
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
        locations[0][0][0].setType("D");
        locations[0][0][0].setLocation(0);
        locations[0][0][0].setDescription(SceneType.van.getDescription());
        
        locations[0][1][0].setDummyRoom(dummy[SceneType.exhibitRoom.ordinal()]);
        locations[0][1][0].setType("D");
        locations[0][1][0].setLocation(1);
        locations[0][1][0].setDescription(SceneType.exhibitRoom.getDescription());
        
        locations[0][1][2].setDummyRoom(dummy[SceneType.exhibitRoom.ordinal()]);
        locations[0][1][2].setType("D");
        locations[0][1][2].setLocation(9);
        locations[0][1][2].setDescription(SceneType.exhibitRoom.getDescription());
        
        locations[0][2][2].setDummyRoom(dummy[SceneType.exhibitRoom.ordinal()]);
        locations[0][2][2].setType("D");
        locations[0][2][2].setLocation(10);
        locations[0][2][2].setDescription(SceneType.exhibitRoom.getDescription());
        
        locations[1][2][1].setDummyRoom(dummy[SceneType.exhibitRoom.ordinal()]);
        locations[1][2][1].setType("D");
        locations[1][2][1].setLocation(18);
        locations[1][2][1].setDescription(SceneType.exhibitRoom.getDescription());
        
        locations[0][1][1].setDummyRoom(dummy[SceneType.hallway.ordinal()]);
        locations[0][1][1].setType("D");
        locations[0][1][1].setLocation(5);
        locations[0][1][1].setDescription(SceneType.hallway.getDescription());
        
        locations[0][2][1].setDummyRoom(dummy[SceneType.hallway.ordinal()]);
        locations[0][2][1].setType("D");
        locations[0][2][1].setLocation(6);
        locations[0][2][1].setDescription(SceneType.hallway.getDescription());
        
        locations[1][2][2].setDummyRoom(dummy[SceneType.hallway.ordinal()]);
        locations[1][2][2].setType("D");
        locations[1][2][2].setLocation(22);
        locations[1][2][2].setDescription(SceneType.hallway.getDescription());
        
        locations[1][3][1].setDummyRoom(dummy[SceneType.balcony.ordinal()]);
        locations[1][3][1].setType("D");
        locations[1][3][1].setLocation(19);
        locations[1][3][1].setDescription(SceneType.balcony.getDescription());
        
        locations[1][0][1].setDummyRoom(dummy[SceneType.janitorCloset.ordinal()]);
        locations[1][0][1].setType("D");
        locations[1][0][1].setLocation(16);
        locations[1][0][1].setDescription(SceneType.janitorCloset.getDescription());
        
        locations[0][0][2].setDummyRoom(dummy[SceneType.stairs.ordinal()]);
        locations[0][0][2].setType("D");
        locations[0][0][2].setLocation(8);
        locations[0][0][2].setDescription(SceneType.stairs.getDescription());
        
        locations[1][0][2].setDummyRoom(dummy[SceneType.stairs.ordinal()]);
        locations[1][0][2].setType("D");
        locations[1][0][2].setLocation(20);
        locations[1][0][2].setDescription(SceneType.stairs.getDescription());
        
        locations[0][3][1].setDummyRoom(dummy[SceneType.mainEntry.ordinal()]);
        locations[0][3][1].setType("D");
        locations[0][3][1].setLocation(7);
        locations[0][3][1].setDescription(SceneType.mainEntry.getDescription());
        
        locations[0][0][1].setDummyRoom(dummy[SceneType.restrooms.ordinal()]);
        locations[0][0][1].setType("D");
        locations[0][0][1].setLocation(4);
        locations[0][0][1].setDescription(SceneType.restrooms.getDescription());
        
        locations[0][3][2].setDummyRoom(dummy[SceneType.lobby.ordinal()]);
        locations[0][3][2].setType("D");
        locations[0][3][2].setLocation(11);
        locations[0][3][2].setDescription(SceneType.lobby.getDescription());
        
        //Stealable Item Rooms
        locations[1][1][0].setStealableItemScenes(stealable[SceneType.diamondRoom.ordinal()]);
        locations[1][1][0].setType("S");
        locations[1][1][0].setLocation(13);
        locations[1][1][0].setDescription(SceneType.diamondRoom.getDescription());
        
        locations[0][2][0].setStealableItemScenes(stealable[SceneType.sculptureRoom.ordinal()]);
        locations[0][2][0].setType("S");
        locations[0][2][0].setLocation(2);
        locations[0][2][0].setDescription(SceneType.sculptureRoom.getDescription());
        
        locations[1][3][0].setStealableItemScenes(stealable[SceneType.goldRoom.ordinal()]); 
        locations[1][3][0].setType("S");
        locations[1][3][0].setLocation(15);
        locations[1][3][0].setDescription(SceneType.goldRoom.getDescription());
        
        locations[1][3][2].setStealableItemScenes(stealable[SceneType.vaseRoom.ordinal()]);
        locations[1][3][2].setType("S");
        locations[1][3][2].setLocation(23);
        locations[1][3][2].setDescription(SceneType.vaseRoom.getDescription());
        
        locations[1][1][2].setStealableItemScenes(stealable[SceneType.paintingRoom.ordinal()]);
        locations[1][1][2].setType("S");
        locations[1][1][2].setLocation(21);
        locations[1][1][2].setDescription(SceneType.paintingRoom.getDescription());
        
        //Trap Rooms
        locations[0][3][0].setTrapScene(trap[SceneType.securityRoom.ordinal()]);
        locations[0][3][0].setType("T");
        locations[0][3][0].setLocation(3);
        locations[0][3][0].setDescription(SceneType.securityRoom.getDescription());
        
        locations[1][2][0].setTrapScene(trap[SceneType.administration.ordinal()]);
        locations[1][2][0].setType("T");
        locations[1][2][0].setLocation(14);
        locations[1][2][0].setDescription(SceneType.administration.getDescription());
        
        locations[1][0][0].setTrapScene(trap[SceneType.controlRoom.ordinal()]);
        locations[1][0][0].setType("T");
        locations[1][0][0].setLocation(12);
        locations[1][0][0].setDescription(SceneType.controlRoom.getDescription());
        
        locations[1][1][1].setTrapScene(trap[SceneType.laserRoom.ordinal()]);
        locations[1][1][1].setType("T");
        locations[1][1][1].setLocation(17);
        locations[1][1][1].setDescription(SceneType.laserRoom.getDescription());
        
        Game game = Thief.getCurrentGame();
        Player player = game.getPlayer();
        player.setLocation(0);
        player.setxAxis(0);
        player.setyAxis(0);
        player.setzAxis(0);       
    }


    public static InventoryItem[] getSortedInventoryList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void saveGame(Game game, String filePath) throws GameControlExceptions {
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
        ObjectOutputStream output = new ObjectOutputStream(fops);
        output.writeObject(game);
    } catch (IOException e) {
        throw new GameControlExceptions(e.getMessage());
    }
}

    public static void getSavedGame(String filePath)  throws GameControlExceptions {
        Game game = null;
        
        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream output = new ObjectInputStream(fips);
            
            game = (Game) output.readObject();
        } catch (FileNotFoundException fnfe){
            throw new GameControlExceptions(fnfe.getMessage());
        } catch (Exception e) {
            throw new GameControlExceptions(e.getMessage());
        }
        Thief.setCurrentGame(game);
    }
}
