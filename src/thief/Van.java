/*
 * 
 */
package thief;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 */
public class Van implements Serializable {
    
    // class instance variables
    private int[] availableSupplies;

    public Van() {
        
    }

    public int[] getAvailableSupplies() {
        return availableSupplies;
    }

    public void setAvailableSupplies(int[] availableSupplies) {
        this.availableSupplies = availableSupplies;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Arrays.hashCode(this.availableSupplies);
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
        final Van other = (Van) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Van{" + "availableSupplies=" + availableSupplies + '}';
    }
    
}
