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
public class StealableItems implements Serializable{
    
    // class instance variables
    private String name;
    private int[] value;

    public StealableItems() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getValue() {
        return value;
    }

    public void setValue(int[] value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Arrays.hashCode(this.value);
        return hash;
    }

    @Override
    public String toString() {
        return "StealableItems{" + "name=" + name + ", value=" + value + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StealableItems other = (StealableItems) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Arrays.equals(this.value, other.value)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
