/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Jon
 */
public class Location implements Serializable{
    
    private double locationNumber;
    private int availableCommands;

    public Location() {
    }

    public double getLocationNumber() {
        return locationNumber;
    }

    public void setLocationNumber(double locationNumber) {
        this.locationNumber = locationNumber;
    }

    public int getAvailableCommands() {
        return availableCommands;
    }

    public void setAvailableCommands(int availableCommands) {
        this.availableCommands = availableCommands;
    }

    
  
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.locationNumber) ^ (Double.doubleToLongBits(this.locationNumber) >>> 32));
        hash = 89 * hash + this.availableCommands;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.locationNumber) != Double.doubleToLongBits(other.locationNumber)) {
            return false;
        }
        if (this.availableCommands != other.availableCommands) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "Location{" + "locationNumber=" + locationNumber + ", availableCommands=" + availableCommands + '}';
    }
    
    
    
}
