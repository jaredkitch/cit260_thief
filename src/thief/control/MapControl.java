/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.control;


import thief.Thief;
import thief.model.DummyRoom;
import thief.model.Game;
import thief.model.Map;
import thief.model.Scene;
import thief.model.StealableItemScene;
import thief.model.TrapScene;

/**
 *
 * @author Jon
 */
class MapControl {

    public static Map createMap() {
        Map map = new Map(2, 4, 3);
        
        DummyRoom[] dummy = createDummyRoom();
        StealableItemScene[] stealable = createStealableItemScene();
        TrapScene[] trap = createTrapScene();
        GameControl.assignScenesToLocations(map, stealable, dummy, trap);
        
        return map;
        
    }

    private static DummyRoom[] createDummyRoom() {
        Game game =  Thief.getCurrentGame();
        
        DummyRoom[] scenes = new DummyRoom[SceneType.values().length];
        
        DummyRoom van = new DummyRoom();
        van.setDescription("");
        scenes[SceneType.van.ordinal()] = van;
        
        DummyRoom exhibit =  new DummyRoom();
        exhibit.setDescription("");
        scenes[SceneType.exhibitRoom.ordinal()] = exhibit;
        
        DummyRoom hallway = new DummyRoom();
        hallway.setDescription("");
        scenes[SceneType.hallway.ordinal()] = hallway;
    
        DummyRoom balcony = new DummyRoom();
        balcony.setDescription("");
        scenes[SceneType.balcony.ordinal()] = balcony;
        
        DummyRoom closet = new DummyRoom();
        closet.setDescription("");
        scenes[SceneType.janitorCloset.ordinal()] = closet;
        
        DummyRoom stairs = new DummyRoom();
        stairs.setDescription("");
        scenes[SceneType.stairs.ordinal()] = stairs;
        
        DummyRoom mainEntry = new DummyRoom();
        mainEntry.setDescription("");
        scenes[SceneType.mainEntry.ordinal()] = mainEntry;
        
        DummyRoom bathrooms = new DummyRoom();
        bathrooms.setDescription("");
        scenes[SceneType.bathrooms.ordinal()] = mainEntry;        
        
        DummyRoom lobby = new DummyRoom();
        bathrooms.setDescription("");
        scenes[SceneType.lobby.ordinal()] = mainEntry;  
       
        return scenes;
        
    }

    private static StealableItemScene[] createStealableItemScene() {
        Game game =  Thief.getCurrentGame();
        
        StealableItemScene[] scenes = new StealableItemScene[SceneType.values().length];
        
        StealableItemScene diamonds = new StealableItemScene();
        diamonds.setDescription("");
        diamonds.setInteractables(1);
        scenes[SceneType.diamondRoom.ordinal()] = diamonds;
        
        StealableItemScene gold = new StealableItemScene();
        gold.setDescription("");
        gold.setInteractables(1);
        scenes[SceneType.goldRoom.ordinal()] = gold;
        
        StealableItemScene sculpture = new StealableItemScene();
        sculpture.setDescription("");
        sculpture.setInteractables(1);
        scenes[SceneType.sculptureRoom.ordinal()] = sculpture;
        
        StealableItemScene painting = new StealableItemScene();
        painting.setDescription("");
        painting.setInteractables(1);
        scenes[SceneType.diamondRoom.ordinal()] = painting;
        
        StealableItemScene vase = new StealableItemScene();
        vase.setDescription("");
        vase.setInteractables(1);
        scenes[SceneType.diamondRoom.ordinal()] = vase;
        
        return scenes;
        
    }

    private static TrapScene[] createTrapScene() {
         Game game =  Thief.getCurrentGame();
        
        TrapScene[] scenes = new TrapScene[SceneType.values().length];
        
        TrapScene security = new TrapScene();
        security.setDescription("");
        security.setInteractables(1);
        security.setTypeOfTrap("");
        scenes[SceneType.securityRoom.ordinal()] = security;
        
        TrapScene laser = new TrapScene();
        laser.setDescription("");
        laser.setInteractables(1);
        laser.setTypeOfTrap("");
        scenes[SceneType.laserRoom.ordinal()] = laser;
        
        TrapScene control = new TrapScene();
        control.setDescription("");
        control.setInteractables(1);
        control.setTypeOfTrap("");
        scenes[SceneType.controlRoom.ordinal()] = control;
        
        TrapScene admin = new TrapScene();
        admin.setDescription("");
        admin.setInteractables(1);
        admin.setTypeOfTrap("");
        scenes[SceneType.administration.ordinal()] = admin;
        
        return scenes;
    }
    
}
