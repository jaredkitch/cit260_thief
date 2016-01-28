/*
 * 
 */
package thief;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
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
        if (!Arrays.equals(this.suppliesInInventory, other.suppliesInInventory)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "suppliesInInventory=" + suppliesInInventory + '}';
    }

        
}
