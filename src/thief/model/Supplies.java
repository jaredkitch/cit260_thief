/*
 * 
 */
package thief.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 */
public class Supplies implements Serializable {
    
    // class instance variables
    private String[] names;
    private int[] supplyID;

    public Supplies() {
        
    }
    
    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public int[] getSupplyID() {
        return supplyID;
    }

    public void setSupplyID(int[] supplyID) {
        this.supplyID = supplyID;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Arrays.deepHashCode(this.names);
        hash = 13 * hash + Arrays.hashCode(this.supplyID);
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
        final Supplies other = (Supplies) obj;
        if (!Arrays.deepEquals(this.names, other.names)) {
            return false;
        }
        if (!Arrays.equals(this.supplyID, other.supplyID)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Supplies{" + "names=" + names + ", supplyID=" + supplyID + '}';
    }
    
    
}
