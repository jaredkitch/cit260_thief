/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.control;

/**
 *
 * @author Jon
 */
public enum SceneType {
    van("Van  ",                   "\n           ***Loading Dock with Van***"
                + "\n This is your mobile headquarters. It contains all of your"
                + "\n supplies but remember you can only take five with"
                + "\n you each trip. Assuming you make it out without"
                + "\n getting caught this is also your getaway vehicle."),            
    exhibitRoom("   E  ",                   "\n               ***Exhibit Room***"
                + "\n You made it to yet another exhibit room,"
                + "\n while that's all well and good there's nothing here"
                + "\n that peaks your interest. You are in this for the big"
                + "\n money items. Move on."),
    sculptureRoom("   SC  |",                 "\n                  ***The Sculpture Room***"
                + "\n This room houses the most expensive sculpture in the"
                + "\n museum. However, it happens to be encased in a glass"
                + "\n case. I hope you brought that glass cutter with you."),
    securityRoom("  SE  ",                 "\n              ***Security Room Keypad***"
                + "\n Once at the security room you notice a keypad that"
                + "\n arms or in this case unarms the laser beams in the"
                + "\n hallway. Luckily the guard has left a piece of paper next"
                + "\n to it with three numbers on it. You must figure out which"
                + "\n number goes in which spot or risk setting off the alarm."
                + "\n Good luck!"
                + "\n\n Additional options: 'P' to Access the Keypad"),
    restrooms(" R    ",                   "\n                  ***Bathrooms***"
                + "\n You made it to the bathrooms. Now look up. This is the"
                + "\n one and only room where you can get into the airducts"
                + "\n from which lead to the control room. Careful, the guards"
                + "\n like to hang out there."),
    hallway("  H   ",                   "\n                  ***Hallway***"
                + "\n Just a means of getting from one mark to another right?"
                + "\n Not so fast. It's full of laser beams that'll set off"
                + "\n the alarm if you haven't disarmed them. Your only option"
                + "\n if that is the case is to calculate how to manuever"
                + "\n through them without tripping one."
                + "\n Move quickly the clock is ticking!"),
    mainEntry("   ME  ",                   "\n                  ***Main Entry***"
                + "\n You came in through the back and have made it all the way"
                + "\n to the other end. You're in a great position to get"
                + "\n into the security room and see if you can make your"
                + "\n job a little easier from here on out by turning off"
                + "\n the cameras or shutting down the laser field, but"
                + "\n remember, at least one guard is always stationed there."
                + "\n\n Additional options: 'L' to Pick the Lock"),
    stairs(" ST  ",                    "\n                  ***Stairs***"
                + "\n Just a bunch of stairs that lead to four of your five"
                + "\n marks. Yes. Four or the five big money items are on the"
                + "\n second level. Better start climbing."),
    lobby("    L   ",                  "\n                  ***Lobby***"
                + "\n Great. Now you're in the lobby, you have a decision"
                + "\n to make. Are you going to stay on this floor and continue"
                + "\n looking for marks or make your way to the main entry and"
                + "\n head upstairs?"),
    controlRoom(" CR |",                 "\n                ***Control Room Challenge***"
                + "\n Now that you've crawled through the airduct and into the"
                + "\n control room you find a guard sleeping. Tread lightly "
                + "\n so you don't wake him up. Your job is to try to steal the"
                + "\n key to the safe off his belt in order to avoid calculating"
                + "\n how to blow it up later. The clock's ticking! "),
    diamondRoom("  DR  |",                 "\n                ***The Diamond Room***"
                + "\n You made it! The diamonds are your biggest mark of the"
                + "\n night, however, they are also the museums most expensive"
                + "\n and most guarded item. Watch what you are doing as you"
                + "\n search the room."
                + "\n\n Additional options: 'B' to Blow Open the Safe"),
    administration("   A  |",                 "\n            ***Administration Room Challenge***"
                + "\n This is the room with the safe. It contains... "
                + "\n In order to blow up the safe you will have to calculate"
                + "\n the dimensions of the safe and exactly how much c4 you"
                + "\n need to use. Too much and you wont even make a dent. Too"
                + "\n much and it'll be the last thing you ever do. I hope"
                + "\n you brought that tape measure. If not you could make an"
                + "\n educated guess but I would not recommend it. Tick Tock!"),
    goldRoom("   G  ",                   "\n                  ***The Gold Room***"
                + "\n This room is home to ancient gold bars recovered from"
                + "\n a ship wreck in the North Pacific. While they are worth a"
                + "\n fortune they will not be easy to steal. Search carefully"
                + "\n and watch out for traps."),
    janitorCloset(" J  |  ",                 "\n                 ***Janitors Closet***"
                + "\n Welcome to the janitors closet. Not the fanciest room"
                + "\n in the museum but possibly worth searching for traps"
                + "\n or items the janitor may be saving for themselves"),
    laserRoom("L   |",                 "\n           ***Laser Protected Hallway Challenge***"
                + "\n If you could not be bothered to sneak into the security"
                + "\n room and disable the lasers then obviously they are still"
                + "\n on. Your only option now is to use the tape measure"
                + "\n you hopefully did not leave in the truck to measure the"
                + "\n dimensions of the hallway in order to calculage exactly"
                + "\n how large your footsteps need to be to make it through"
                + "\n without tripping even one. If you did leave it in the"
                + "\n van you can run back and get it or try your luck at"
                + "\n guessing. Either way you better get started!"
                + "\n\n Additional options: 'D' to Attempt to Avoid the Lasers"
                + "\n                     'L' to Pick the Lock"),
    balcony("    B  ",                 "\n                  ***The Balcony***"
                + "\n You made it to the balcony. Now take a quick"
                + "\n sec to take in the view and catch your breath."
                + "\n Now get back to your mission!"),
    vaseRoom("   V  ",                 "\n                  ***The Vase Room***"
                + "\n The vase is another item on your list of marks for the"
                + "\n evening. Search the room carefully and quickly. Watch out"
                + "\n for the guards making their rounds. As this room is just"
                + "\n off the main entry staircase it's likely"
                + "\n they are close by."),
    paintingRoom("  P     ",                 "\n                  ***The Painting Room***"
                + "\n The paining is on your list of marks for the evening."
                + "\n However, would they leave it hanging on the wall without "
                + "\n any kind of specialized securtiy? Tread Carefully!");
    
private final String abbreviation;
private final String description;

SceneType(String abbreviation, String description) {
        this.abbreviation = abbreviation;
        this.description = description;
    }

    
   
    public String getAbbreviation() {
        return abbreviation;
}
    public String getDescription() {
        return description;
    }
}

