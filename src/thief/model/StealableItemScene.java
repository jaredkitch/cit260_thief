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
 * @author Jon
 */
public class StealableItemScene implements Serializable{
    
    private String description;
    private int interactables;
    private String abbreviation;
    
    public StealableItemScene() {
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getInteractables() {
        return interactables;
    }

    public void setInteractables(int interactables) {
        this.interactables = interactables;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.description);
        hash = 41 * hash + this.interactables;
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
        final StealableItemScene other = (StealableItemScene) obj;
        if (this.interactables != other.interactables) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

  
    
    @Override
    public String toString() {
        return "StealableItemScene{" + "description=" + description + ", interactables=" + interactables + '}';
    }
    
    
    
}
