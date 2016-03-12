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
        Map map = new Map(4, 3, 2);
        
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
        van.setDescription(
                  "\n                    ***Van***"
                + "\n This is your mobile headquarters. It conatins all of your"
                + "\n supplies but remember you can only take five with"
                + "\n you each trip. Assuming you make it out without"
                + "\n getting caught this is also your getaway vehicle.");
        scenes[SceneType.van.ordinal()] = van;
        
        DummyRoom exhibit =  new DummyRoom();
        exhibit.setDescription(
                  "\n               ***Exhibit Room***"
                + "\n You made it to yet another exhibit room,"
                + "\n while that's all well and good there's nothing here"
                + "\n that peaks your interest. You are in this for the big"
                + "\n money items. Move on.");
        scenes[SceneType.exhibitRoom.ordinal()] = exhibit;
        
        DummyRoom hallway = new DummyRoom();
        hallway.setDescription(
                  "\n                  ***Hallway***"
                + "\n Just a means of getting from one mark to another right?"
                + "\n Not so fast. It's full of laser beams that'll set off"
                + "\n the alarm if you haven't disarmed them. Your only option"
                + "\n if that is the case is to calculate how to manuever"
                + "\n through them without tripping one."
                + "\n Move quickly the clock is ticking!");
        scenes[SceneType.hallway.ordinal()] = hallway;
    
        DummyRoom balcony = new DummyRoom();
        balcony.setDescription(
                "\n                  ***The Balcony***"
                + "\n You made it to the balcony. Now take a quick"
                + "\n sec to take in the view and catch your breath."
                + "\n Now get back to your mission!");
        scenes[SceneType.balcony.ordinal()] = balcony;
        
        DummyRoom closet = new DummyRoom();
        closet.setDescription(
                "\n                 ***Janitors Closet***"
                + "\n Welcome to the janitors closet. Not the fanciest room"
                + "\n in the museum but possibly worth searching for traps"
                + "\n or items the janitor may be saving for themselves");
        scenes[SceneType.janitorCloset.ordinal()] = closet;
        
        DummyRoom stairs = new DummyRoom();
        stairs.setDescription(
                   "\n                  ***Stairs***"
                + "\n Just a bunch of stairs that lead to four of your five"
                + "\n marks. Yes. Four or the five big money items are on the"
                + "\n second level. Better start climbing.");
        scenes[SceneType.stairs.ordinal()] = stairs;
        
        DummyRoom mainEntry = new DummyRoom();
        mainEntry.setDescription(
                  "\n                  ***Main Entry***"
                + "\n You came in through the back and have made it all the way"
                + "\n to the other end. You're in a great position to get"
                + "\n into the security room and see if you can make your"
                + "\n job a little easier from here on out by turning off"
                + "\n the cameras or shutting down the laser field, but"
                + "\n remember, at least one guard is always stationed there.");
        scenes[SceneType.mainEntry.ordinal()] = mainEntry;
        
        DummyRoom bathrooms = new DummyRoom();
        bathrooms.setDescription(
                  "\n                  ***Bathrooms***"
                + "\n You made it to the bathrooms. Now look up. This is the"
                + "\n one and only room where you can get into the airducts"
                + "\n from which lead to the control room. Careful, the guards"
                + "\n like to hang out there.");
        scenes[SceneType.bathrooms.ordinal()] = mainEntry;        
        
        DummyRoom lobby = new DummyRoom();
        bathrooms.setDescription(
                  "\n                  ***Lobby***"
                + "\n Great. Now you're in the lobby, you have a decision"
                + "\n to make. Are you going to stay on this floor and continue"
                + "\n looking for marks or make your way to the main entry and"
                + "\n head upstairs?");
        scenes[SceneType.lobby.ordinal()] = mainEntry;  
       
        return scenes;
        
    }

    private static StealableItemScene[] createStealableItemScene() {
        Game game =  Thief.getCurrentGame();
        
        StealableItemScene[] scenes = new StealableItemScene[SceneType.values().length];
        
        StealableItemScene diamonds = new StealableItemScene();
        diamonds.setDescription(
                "\n                ***The Diamond Room***"
                + "\n You made it! The diamonds are your biggest mark of the"
                + "\n night, however, they are also the museums most expensive"
                + "\n and most guarded item. Watch what you are doing as you"
                + "\n search the room.");
        diamonds.setInteractables(1);
        scenes[SceneType.diamondRoom.ordinal()] = diamonds;
        
        StealableItemScene gold = new StealableItemScene();
        gold.setDescription(
                  "\n                  ***The Gold Room***"
                + "\n This room is home to ancient gold bars recovered from"
                + "\n a ship wreck in the North Pacific. While they are worth a"
                + "\n fortune they will not be easy to steal. Search carefully"
                + "\n and watch out for traps.");
        gold.setInteractables(1);
        scenes[SceneType.goldRoom.ordinal()] = gold;
        
        StealableItemScene sculpture = new StealableItemScene();
        sculpture.setDescription(
                "\n                  ***The Sculpture Room***"
                + "\n This room houses the most expensive sculpture in the"
                + "\n museum. However, it happens to be encased in a glass"
                + "\n case. I hope you brought that glass cutter with you.");
        sculpture.setInteractables(1);
        scenes[SceneType.sculptureRoom.ordinal()] = sculpture;
        
        StealableItemScene painting = new StealableItemScene();
        painting.setDescription(
                "\n                  ***The Painting Room***"
                + "\n The paining is on your list of marks for the evening."
                + "\n However, would they leave it hanging on the wall without "
                + "\n any kind of specialized securtiy? Tread Carefully!");
        painting.setInteractables(1);
        scenes[SceneType.diamondRoom.ordinal()] = painting;
        
        StealableItemScene vase = new StealableItemScene();
        vase.setDescription(
                "\n                  ***The Vase Room***"
                + "\n The vase is another item on your list of marks for the"
                + "\n evening. Search the room carefully and quickly. Watch out"
                + "\n for the guards making their rounds. As this room is just"
                + "\n off the main entry staircase it's likely"
                + "\n they are close by.");
        vase.setInteractables(1);
        scenes[SceneType.diamondRoom.ordinal()] = vase;
        
        return scenes;
        
    }

    private static TrapScene[] createTrapScene() {
         Game game =  Thief.getCurrentGame();
        
        TrapScene[] scenes = new TrapScene[SceneType.values().length];
        
        TrapScene security = new TrapScene();
        security.setDescription(
                "\n              ***Security Room Keypad***"
                + "\n Once at the security room you notice a keypad that"
                + "\n arms or in this case unarms the laser beams in the"
                + "\n hallway. Luckily the guard has left a piece of paper next"
                + "\n to it with three numbers on it. You must figure out which"
                + "\n number goes in which spot or risk setting off the alarm."
                + "\n Good luck!");
        security.setInteractables(1);
        security.setTypeOfTrap("keypadTrap");
        scenes[SceneType.securityRoom.ordinal()] = security;
        
        TrapScene laser = new TrapScene();
        laser.setDescription(
                "\n           ***Laser Protected Hallway Challenge***"
                + "\n If you could not be bothered to sneak into the security"
                + "\n room and disable the lasers then obviously they are still"
                + "\n on. Your only option now is to use the tape measure"
                + "\n you hopefully did not leave in the truck to measure the"
                + "\n dimensions of the hallway in order to calculage exactly"
                + "\n how large your footsteps need to be to make it through"
                + "\n without tripping even one. If you did leave it in the"
                + "\n van you can run back and get it or try your luck at"
                + "\n guessing. Either way you better get started!");
        laser.setInteractables(1);
        laser.setTypeOfTrap("laserTrap");
        scenes[SceneType.laserRoom.ordinal()] = laser;
        
        TrapScene control = new TrapScene();
        control.setDescription(
                "\n                ***Control Room Challenge***"
                + "\n Now that you've crawled through the airduct and into the"
                + "\n control room you find a guard sleeping. Tread lightly "
                + "\n so you don't wake him up. Your job is to try to steal the"
                + "\n key to the safe off his belt in order to avoid calculating"
                + "\n how to blow it up later. The clock's ticking! ");
        control.setInteractables(1);
        control.setTypeOfTrap("guardTrap");
        scenes[SceneType.controlRoom.ordinal()] = control;
        
        TrapScene admin = new TrapScene();
        admin.setDescription(
                "\n            ***Administration Room Challenge***"
                + "\n This is the room with the safe. It contains... "
                + "\n In order to blow up the safe you will have to calculate"
                + "\n the dimensions of the safe and exactly how much c4 you"
                + "\n need to use. Too much and you wont even make a dent. Too"
                + "\n much and it'll be the last thing you ever do. I hope"
                + "\n you brought that tape measure. If not you could make an"
                + "\n educated guess but I would not recommend it. Tick Tock!");
        admin.setInteractables(1);
        admin.setTypeOfTrap("");
        scenes[SceneType.administration.ordinal()] = admin;
        
        return scenes;
    }
    
}
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
        Map map = new Map(4, 3, 2);
        
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
        van.setDescription(
                  "\n                    ***Van***"
                + "\n This is your mobile headquarters. It conatins all of your"
                + "\n supplies but remember you can only take five with"
                + "\n you each trip. Assuming you make it out without"
                + "\n getting caught this is also your getaway vehicle.");
        scenes[SceneType.van.ordinal()] = van;
        
        DummyRoom exhibit =  new DummyRoom();
        exhibit.setDescription(
                  "\n               ***Exhibit Room***"
                + "\n You made it to yet another exhibit room,"
                + "\n while that's all well and good there's nothing here"
                + "\n that peaks your interest. You are in this for the big"
                + "\n money items. Move on.");
        scenes[SceneType.exhibitRoom.ordinal()] = exhibit;
        
        DummyRoom hallway = new DummyRoom();
        hallway.setDescription(
                  "\n                  ***Hallway***"
                + "\n Just a means of getting from one mark to another right?"
                + "\n Not so fast. It's full of laser beams that'll set off"
                + "\n the alarm if you haven't disarmed them. Your only option"
                + "\n if that is the case is to calculate how to manuever"
                + "\n through them without tripping one."
                + "\n Move quickly the clock is ticking!");
        scenes[SceneType.hallway.ordinal()] = hallway;
    
        DummyRoom balcony = new DummyRoom();
        balcony.setDescription(
                "\n                  ***The Balcony***"
                + "\n You made it to the balcony. Now take a quick"
                + "\n sec to take in the view and catch your breath."
                + "\n Now get back to your mission!");
        scenes[SceneType.balcony.ordinal()] = balcony;
        
        DummyRoom closet = new DummyRoom();
        closet.setDescription(
                "\n                 ***Janitors Closet***"
                + "\n Welcome to the janitors closet. Not the fanciest room"
                + "\n in the museum but possibly worth searching for traps"
                + "\n or items the janitor may be saving for themselves");
        scenes[SceneType.janitorCloset.ordinal()] = closet;
        
        DummyRoom stairs = new DummyRoom();
        stairs.setDescription(
                   "\n                  ***Stairs***"
                + "\n Just a bunch of stairs that lead to four of your five"
                + "\n marks. Yes. Four or the five big money items are on the"
                + "\n second level. Better start climbing.");
        scenes[SceneType.stairs.ordinal()] = stairs;
        
        DummyRoom mainEntry = new DummyRoom();
        mainEntry.setDescription(
                  "\n                  ***Main Entry***"
                + "\n You came in through the back and have made it all the way"
                + "\n to the other end. You're in a great position to get"
                + "\n into the security room and see if you can make your"
                + "\n job a little easier from here on out by turning off"
                + "\n the cameras or shutting down the laser field, but"
                + "\n remember, at least one guard is always stationed there.");
        scenes[SceneType.mainEntry.ordinal()] = mainEntry;
        
        DummyRoom bathrooms = new DummyRoom();
        bathrooms.setDescription(
                  "\n                  ***Bathrooms***"
                + "\n You made it to the bathrooms. Now look up. This is the"
                + "\n one and only room where you can get into the airducts"
                + "\n from which lead to the control room. Careful, the guards"
                + "\n like to hang out there.");
        scenes[SceneType.bathrooms.ordinal()] = mainEntry;        
        
        DummyRoom lobby = new DummyRoom();
        bathrooms.setDescription(
                  "\n                  ***Lobby***"
                + "\n Great. Now you're in the lobby, you have a decision"
                + "\n to make. Are you going to stay on this floor and continue"
                + "\n looking for marks or make your way to the main entry and"
                + "\n head upstairs?");
        scenes[SceneType.lobby.ordinal()] = mainEntry;  
       
        return scenes;
        
    }

    private static StealableItemScene[] createStealableItemScene() {
        Game game =  Thief.getCurrentGame();
        
        StealableItemScene[] scenes = new StealableItemScene[SceneType.values().length];
        
        StealableItemScene diamonds = new StealableItemScene();
        diamonds.setDescription(
                "\n                ***The Diamond Room***"
                + "\n You made it! The diamonds are your biggest mark of the"
                + "\n night, however, they are also the museums most expensive"
                + "\n and most guarded item. Watch what you are doing as you"
                + "\n search the room.");
        diamonds.setInteractables(1);
        scenes[SceneType.diamondRoom.ordinal()] = diamonds;
        
        StealableItemScene gold = new StealableItemScene();
        gold.setDescription(
                  "\n                  ***The Gold Room***"
                + "\n This room is home to ancient gold bars recovered from"
                + "\n a ship wreck in the North Pacific. While they are worth a"
                + "\n fortune they will not be easy to steal. Search carefully"
                + "\n and watch out for traps.");
        gold.setInteractables(1);
        scenes[SceneType.goldRoom.ordinal()] = gold;
        
        StealableItemScene sculpture = new StealableItemScene();
        sculpture.setDescription(
                "\n                  ***The Sculpture Room***"
                + "\n This room houses the most expensive sculpture in the"
                + "\n museum. However, it happens to be encased in a glass"
                + "\n case. I hope you brought that glass cutter with you.");
        sculpture.setInteractables(1);
        scenes[SceneType.sculptureRoom.ordinal()] = sculpture;
        
        StealableItemScene painting = new StealableItemScene();
        painting.setDescription(
                "\n                  ***The Painting Room***"
                + "\n The paining is on your list of marks for the evening."
                + "\n However, would they leave it hanging on the wall without "
                + "\n any kind of specialized securtiy? Tread Carefully!");
        painting.setInteractables(1);
        scenes[SceneType.diamondRoom.ordinal()] = painting;
        
        StealableItemScene vase = new StealableItemScene();
        vase.setDescription(
                "\n                  ***The Vase Room***"
                + "\n The vase is another item on your list of marks for the"
                + "\n evening. Search the room carefully and quickly. Watch out"
                + "\n for the guards making their rounds. As this room is just"
                + "\n off the main entry staircase it's likely"
                + "\n they are close by.");
        vase.setInteractables(1);
        scenes[SceneType.diamondRoom.ordinal()] = vase;
        
        return scenes;
        
    }

    private static TrapScene[] createTrapScene() {
         Game game =  Thief.getCurrentGame();
        
        TrapScene[] scenes = new TrapScene[SceneType.values().length];
        
        TrapScene security = new TrapScene();
        security.setDescription(
                "\n              ***Security Room Keypad***"
                + "\n Once at the security room you notice a keypad that"
                + "\n arms or in this case unarms the laser beams in the"
                + "\n hallway. Luckily the guard has left a piece of paper next"
                + "\n to it with three numbers on it. You must figure out which"
                + "\n number goes in which spot or risk setting off the alarm."
                + "\n Good luck!");
        security.setInteractables(1);
        security.setTypeOfTrap("keypadTrap");
        scenes[SceneType.securityRoom.ordinal()] = security;
        
        TrapScene laser = new TrapScene();
        laser.setDescription(
                "\n           ***Laser Protected Hallway Challenge***"
                + "\n If you could not be bothered to sneak into the security"
                + "\n room and disable the lasers then obviously they are still"
                + "\n on. Your only option now is to use the tape measure"
                + "\n you hopefully did not leave in the truck to measure the"
                + "\n dimensions of the hallway in order to calculage exactly"
                + "\n how large your footsteps need to be to make it through"
                + "\n without tripping even one. If you did leave it in the"
                + "\n van you can run back and get it or try your luck at"
                + "\n guessing. Either way you better get started!");
        laser.setInteractables(1);
        laser.setTypeOfTrap("laserTrap");
        scenes[SceneType.laserRoom.ordinal()] = laser;
        
        TrapScene control = new TrapScene();
        control.setDescription(
                "\n                ***Control Room Challenge***"
                + "\n Now that you've crawled through the airduct and into the"
                + "\n control room you find a guard sleeping. Tread lightly "
                + "\n so you don't wake him up. Your job is to try to steal the"
                + "\n key to the safe off his belt in order to avoid calculating"
                + "\n how to blow it up later. The clock's ticking! ");
        control.setInteractables(1);
        control.setTypeOfTrap("guardTrap");
        scenes[SceneType.controlRoom.ordinal()] = control;
        
        TrapScene admin = new TrapScene();
        admin.setDescription(
                "\n            ***Administration Room Challenge***"
                + "\n This is the room with the safe. It contains... "
                + "\n In order to blow up the safe you will have to calculate"
                + "\n the dimensions of the safe and exactly how much c4 you"
                + "\n need to use. Too much and you wont even make a dent. Too"
                + "\n much and it'll be the last thing you ever do. I hope"
                + "\n you brought that tape measure. If not you could make an"
                + "\n educated guess but I would not recommend it. Tick Tock!");
        admin.setInteractables(1);
        admin.setTypeOfTrap("");
        scenes[SceneType.administration.ordinal()] = admin;
        
        return scenes;
    }
    
}
