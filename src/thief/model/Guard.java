/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Tish
 */
public class Guard implements Serializable{
    
    // class instance variables
    private int location;
    private boolean sleepState;

    public Guard() {
        this.location = 0;
        this.sleepState = true;
    }
    
    

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public boolean getSleepState() {
        return sleepState;
    }

    public void setSleepState(boolean sleepState) {
        this.sleepState = sleepState;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.location;
        hash = 89 * hash + Objects.hashCode(this.sleepState);
        return hash;
    }

    

    @Override
    public String toString() {
        return "Guard{" + "location=" + location + ", sleepState=" + sleepState + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Guard other = (Guard) obj;
        if (this.location != other.location) {
            return false;
        }
        if (!Objects.equals(this.sleepState, other.sleepState)) {
            return false;
        }
        return true;
    }
    
    

    
    
    
    
    
            
}
