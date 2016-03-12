/*
 * 
 */
package thief.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *  @author Jared
 */
public enum Supplies implements Serializable {
    c4Explosives("\n               ***C4 Explosive***"                         +
                 "\n This is what you need if you're going for the safe"       +
                 "\n Remember, be careful! Too little wont get the job done"   +
                 "\n and too much will ensure you don't make it out alive."),
    nightVisionGoggles("\n         ***Night Vision Goggles***"                 +
                       "\n Since it is pitch black inside the museum you can"  +
                       "\n either try you luck and go in blind or you can"     +
                       "\n grab these so you can see what you are doing."),
    measuringTape("\n                ***Measuring Tape***"                     +
                  "\n You will need this in the laser beam hallway in order"   +
                  "\n to calculate your footstep length to avoid setting off"  +
                  "\n the alarm which would alert the security guards and"     +
                  "\n police to your presence."),
    lockPick("\n                   ***Lock Pick***"                            +
                  "\n This will be useful to get into all those locked rooms"  +
                  "\n quickly and quietly. Unless you have a better idea I"    +
                  "\n suggest you take the lock pick with you."),
    crowbar("\n                     ***Crow Bar***"                            +
            "\n Suppose you need to pry the painting off the wall or the safe" +
            "\n open. A crowbar can break things, pry things open, help you"   +
            "\n lift something heavy etc. Expensive museum pieces are not"     +
            "\n light! Can you get by without it?"),
    flashlight("\n                ***Flashlight***"                            +
               "\n Self explanatory right? It's dark and you need to be"       +
               "\n able to see what you're doing. If you decide against"       +
               "\n the night vision goggles the flashlight will be"            +
               "\n invalueable."),
    gun("\n                          ***Gun***"                                +
        "\n Of course this is a last resort. However if you are that insecure" +
        "\n about your abilities by all means bring it along."), 
    glassCutter("\n               ***Glass Cutter***"                          +
                "\n They don't leave these priceless pieces out in the open"   +
                "\n air to get dusty. You may want the glass cutter if you"    +
                "\n plan on getting into any glass display cases you might"    +
                "\n encounter without getting the guards attention."),
    rope("\n                      ***Rope***"                                  +
         "\n Could be handy right? You never know! Even just to tie the"       +
         "\n guards up. Better consider this one!"),
    calculator("\n                 ***Calculator***"                           +
               "\n Are you a math wiz? If not you'll be needing this. There"   +
               "\n are more that one equation you will need to solve to get"   +
               "\n to your marks. Unless you want to leave them behind"        +
               "\n because you forgot to carry the one."),
    phone("\n                          ***Phone***"                            +
          "\n This is a no-brainer. Suppose something goes wrong. Suppose you" +
          "\n get stuck or shot or caught. Better have your attorney, doctor"  +
          "\n and best buddy on speed dial."),
    laptop("\n                          ***Laptop***"                          +
               "\n Not the easiest or lightest supply to carry around with you"+
               "\n but it could end up being useful right? Although you wont"  +
               "\n be sitting still much. Your choice."),
    smokeBombs("\n                   ***Smoke Bombs***"                        +
               "\n With more than one guard roaming around you never know "    +
               "\n when you'll need to catch them off guard and make a quick"  +
               "\n getaway. Plus, they're fun");
 
    // class instance variables
    
    private final String description;

    
    Supplies(String description) {
        this.description = description;

    }

    public String getDescription() {
        return description;
    }  
}
