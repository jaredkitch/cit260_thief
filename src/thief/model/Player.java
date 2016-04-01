/*
 * 
 */
package thief.model;

import thief.model.Supplies;
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
    private InventoryItem[] playerinven;
    private int[] stolenItems;
    private int xAxis;
    private int yAxis;
    private int zAxis;
    
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

    public int[] getStolenItems() {
        return stolenItems;
    }

    public void setStolenItems(int[] stolenItems) {
        this.stolenItems = stolenItems;
    }

    public static  InventoryItem[] createInventoryList() {
         
InventoryItem[] inventory = new InventoryItem[13];
        
        InventoryItem c4 = new InventoryItem();
        c4.setDescription("C4 Explosives");
        c4.setItemNumber(4);
        inventory[Supplies.c4Explosives.ordinal()] = c4;
        
        InventoryItem measuringTape = new InventoryItem();
        measuringTape.setDescription("Measuring Tape");
        inventory[Supplies.measuringTape.ordinal()] = measuringTape;
        
        InventoryItem calculator = new InventoryItem();
        calculator.setDescription("Calculator");
        calculator.setItemNumber(3);
        inventory[Supplies.calculator.ordinal()] = calculator;
        
        InventoryItem crowbar = new InventoryItem();
        crowbar.setDescription("Crowbar");
        crowbar.setItemNumber(4);
        inventory[Supplies.crowbar.ordinal()] = crowbar;
        
        InventoryItem gun = new InventoryItem();
        gun.setDescription("Gun");
        gun.setItemNumber(5);
        inventory[Supplies.gun.ordinal()] = gun;
        
        InventoryItem night = new InventoryItem();
        night.setDescription("Night Vision Goggles");
        night.setItemNumber(6);
        inventory[Supplies.nightVisionGoggles.ordinal()] = night;
        
        InventoryItem lockpick = new InventoryItem();
        lockpick.setDescription("Lock Pick");
        lockpick.setItemNumber(7);
        inventory[Supplies.lockPick.ordinal()] = lockpick;
        
        InventoryItem flashlight = new InventoryItem();
        flashlight.setDescription("Flash Light");
        flashlight.setItemNumber(8);
        inventory[Supplies.flashlight.ordinal()] = flashlight;
        
        InventoryItem glassCutter = new InventoryItem();
        glassCutter.setDescription("Glass Cutter");
        glassCutter.setItemNumber(9);
        inventory[Supplies.glassCutter.ordinal()] = glassCutter;
        
        InventoryItem rope = new InventoryItem();
        rope.setDescription("Rope");
        rope.setItemNumber(10);
        inventory[Supplies.rope.ordinal()] = rope;
        
        InventoryItem phone = new InventoryItem();
        phone.setDescription("Phone");
        phone.setItemNumber(11);
        inventory[Supplies.phone.ordinal()] = phone;
        
        InventoryItem laptop = new InventoryItem();
        laptop.setDescription("Laptop");
        laptop.setItemNumber(12);
        inventory[Supplies.laptop.ordinal()] = laptop;
        
        InventoryItem smokebombs = new InventoryItem();
        smokebombs.setDescription("Smokebombs");
        smokebombs.setItemNumber(13);
        inventory[Supplies.smokeBombs.ordinal()] = smokebombs;
        
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

    public int getxAxis() {
        return xAxis;
    }

    public void setxAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    public int getyAxis() {
        return yAxis;
    }

    public void setyAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    public int getzAxis() {
        return zAxis;
    }

    public void setzAxis(int zAxis) {
        this.zAxis = zAxis;
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
