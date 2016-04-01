/*
 * 
 */
package thief.model;

import java.io.Serializable;

/**
 *  @author Jared
 */
public class Van implements Serializable {
    
    // class instance variables

    private Supplies supplies;

 
    public Van() {
        this.supplies = supplies;           
    }

  public Supplies getSupplies() {
        return supplies;
    }

    public void setSupplies(Supplies supplies) {
        this.supplies = supplies;
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

}
