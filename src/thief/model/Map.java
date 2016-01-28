/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.model;

import java.io.Serializable;

/**
 *
 * @author Jon
 */
public class Map implements Serializable{
    
    private double x_axis;
    private double y_axis;
    private double z_axis;
    private double associatedLocation;
    
    public Map() {
    }

    public double getAssociatedLocation() {
        return associatedLocation;
    }

    public void setAssociatedLocation(double associatedLocation) {
        this.associatedLocation = associatedLocation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.x_axis) ^ (Double.doubleToLongBits(this.x_axis) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.y_axis) ^ (Double.doubleToLongBits(this.y_axis) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.z_axis) ^ (Double.doubleToLongBits(this.z_axis) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.associatedLocation) ^ (Double.doubleToLongBits(this.associatedLocation) >>> 32));
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
        final Map other = (Map) obj;
        return true;
    }
    
       
    
}
