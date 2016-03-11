/*
 * 
 */
package thief.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *   @author Jon, Jared, Tisha
 */
public class Player implements Serializable {

    
    // class instance variables
    private String name;
    private int location;
    private double fastestTime;
    private double biggestHaul;
    private Inventory inventory;
    private StolenItems stolenItems;
    
    
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

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public StolenItems getStolenItems() {
        return stolenItems;
    }

    public void setStolenItems(StolenItems stolenItems) {
        this.stolenItems = stolenItems;
    }

    public static  int[] createInventoryList() {
         
        
        int[] inventory = new int[5];
        
        inventory[0] = Supplies.c4Explosives.ordinal();
        
        inventory[1] = Supplies.measuringTape.ordinal();
        
        inventory[2] = Supplies.calculator.ordinal();
        
        inventory[3] = Supplies.crowbar.ordinal();
        
        inventory[4] = Supplies.gun.ordinal();
        
        return inventory;
        
    }
    
    public static int[] createStolenItemList() {
        
        int[] stolenItems = new int[5];
        
        return stolenItems;
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
