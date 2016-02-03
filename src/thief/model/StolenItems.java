/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Tish
 */
public class StolenItems implements Serializable{
    
    // class instance variables
    private int[] totalValue;
    private String itemsStillInPlay;

    public StolenItems() {
    }
    
    

    public int[] getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int[] totalValue) {
        this.totalValue = totalValue;
    }

    public String getItemsStillInPlay() {
        return itemsStillInPlay;
    }

    public void setItemsStillInPlay(String itemsStillInPlay) {
        this.itemsStillInPlay = itemsStillInPlay;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Arrays.hashCode(this.totalValue);
        hash = 59 * hash + Objects.hashCode(this.itemsStillInPlay);
        return hash;
    }

    @Override
    public String toString() {
        return "StolenItems{" + "totalValue=" + totalValue + ", itemsStillInPlay=" + itemsStillInPlay + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StolenItems other = (StolenItems) obj;
        if (!Arrays.equals(this.totalValue, other.totalValue)) {
            return false;
        }
        if (!Objects.equals(this.itemsStillInPlay, other.itemsStillInPlay)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
