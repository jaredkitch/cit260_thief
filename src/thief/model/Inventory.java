/*
 * 
 */
package thief.model;

import java.io.Serializable;

/**
 *  @author Jared
 */
public class Inventory implements Serializable {
    
    // class instance variables
    private int[] suppliesInInventory;

    public Inventory() {
        
    }

    public int[] getSuppliesInInventory() {
        return suppliesInInventory;
    }

    public void setSuppliesInInventory(int[] suppliesInInventory) {
        this.suppliesInInventory = suppliesInInventory;
    }


    
    @Override
    public int hashCode() {
        int hash = 5;
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
        final Inventory other = (Inventory) obj;
        if (this.suppliesInInventory != other.suppliesInInventory) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "suppliesInInventory=" + suppliesInInventory + '}';
    }

}
