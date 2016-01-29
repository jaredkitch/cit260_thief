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
    private int[] location;
    private String sleepState;

    public Guard() {
    }
    
    

    public int[] getLocation() {
        return location;
    }

    public void setLocation(int[] location) {
        this.location = location;
    }

    public String getSleepState() {
        return sleepState;
    }

    public void setSleepState(String sleepState) {
        this.sleepState = sleepState;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Arrays.hashCode(this.location);
        hash = 41 * hash + Objects.hashCode(this.sleepState);
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
        if (!Arrays.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.sleepState, other.sleepState)) {
            return false;
        }
        return true;
    }
    
    
    
    
            
}
