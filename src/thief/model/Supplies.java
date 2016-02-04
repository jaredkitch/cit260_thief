/*
 * 
 */
package thief.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *  @author Jared
 */
public class Supplies implements Serializable {
    
    // class instance variables
    private String names;
    private int supplyID;

    public Supplies() {
        
    }
    
    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getSupplyID() {
        return supplyID;
    }

    public void setSupplyID(int supplyID) {
        this.supplyID = supplyID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.names);
        hash = 13 * hash + this.supplyID;
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
        if (this.supplyID != other.supplyID) {
            return false;
        }
        if (!Objects.equals(this.names, other.names)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Supplies{" + "names=" + names + ", supplyID=" + supplyID + '}';
    }
    
    
}
