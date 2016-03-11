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
    c4Explosives(""),
    nightVisionGoggles(""),
    measuringTape(""),
    lockPick(""),
    crowbar(""),
    flashlight(""),
    gun(""), 
    glassCutter(""),
    rope(""),
    calculator(""),
    phone(""),
    laptop(""),
    smokeBombs("");
 
    // class instance variables
    
    private final String description;

    
    Supplies(String description) {
        this.description = description;

    }

    public String getDescription() {
        return description;
    }  
}
