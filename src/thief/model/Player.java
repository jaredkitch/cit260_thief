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
    private InventoryItem inventory;
    private StolenItems stolenItems;
    private InventoryItem[] playerinven;
    
    
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

    public InventoryItem getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem inventory) {
        this.inventory = inventory;
    }

    public StolenItems getStolenItems() {
        return stolenItems;
    }

    public void setStolenItems(StolenItems stolenItems) {
        this.stolenItems = stolenItems;
    }

    public static  InventoryItem[] createInventoryList() {
         
        InventoryItem[] inventory = new InventoryItem[5];
        
        InventoryItem c4 = new InventoryItem();
        c4.setDescription("C4 Explosives");
        inventory[0] = c4;
        
        InventoryItem measuringTape = new InventoryItem();
        measuringTape.setDescription("Measuring Tape");
        inventory[1] = measuringTape;
        
        InventoryItem calculator = new InventoryItem();
        calculator.setDescription("Calculator");
        inventory[2] = calculator;
        
        InventoryItem crowbar = new InventoryItem();
        crowbar.setDescription("Crowbar");
        inventory[3] = crowbar;
        
        InventoryItem gun = new InventoryItem();
        gun.setDescription("Gun");
        inventory[4] = gun;
        
        
        return inventory;
        
    }

    public InventoryItem[] getPlayerinven() {
        return playerinven;
    }

    public void setPlayerinven(InventoryItem[] playerinven) {
        this.playerinven = playerinven;
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
