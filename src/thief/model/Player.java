/*
 * 
 */
package thief.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 */
public class Player implements Serializable {
    
    // class instance variables
    private String name;
    private int location;
    private double fastestTime;
    private double biggestHaul;

    public Player() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public double getFastestTime() {
        return fastestTime;
    }

    public void setFastestTime(double fastestTime) {
        this.fastestTime = fastestTime;
    }

    public double getBiggestHaul() {
        return biggestHaul;
    }

    public void setBiggestHaul(double biggestHaul) {
        this.biggestHaul = biggestHaul;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.location;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.fastestTime) ^ (Double.doubleToLongBits(this.fastestTime) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.biggestHaul) ^ (Double.doubleToLongBits(this.biggestHaul) >>> 32));
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
        final Player other = (Player) obj;
        if (this.location != other.location) {
            return false;
        }
        if (Double.doubleToLongBits(this.fastestTime) != Double.doubleToLongBits(other.fastestTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.biggestHaul) != Double.doubleToLongBits(other.biggestHaul)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    


    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", location=" + location + ", fastestTime=" + fastestTime + ", biggestHaul=" + biggestHaul + '}';
    }
}
