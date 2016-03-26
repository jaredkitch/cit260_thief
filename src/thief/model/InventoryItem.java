/*
 * 
 */
package thief.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *  @author Jared
 */
public class InventoryItem implements Serializable {
    
    // class instance variables
    private String description;
    private int itemNumber;
    
    public InventoryItem() {
        
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }
  
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.description);
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
        final InventoryItem other = (InventoryItem) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "description=" + description + '}';
    }
    
    
    

}

   