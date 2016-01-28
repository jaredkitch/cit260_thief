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
public class TrapScene implements Serializable {
    
    private String description;
    private int[] interactables;
    private String typeOfTrap;

    public TrapScene() {
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int[] getInteractables() {
        return interactables;
    }

    public void setInteractables(int[] interactables) {
        this.interactables = interactables;
    }

    public String getTypeOfTrap() {
        return typeOfTrap;
    }

    public void setTypeOfTrap(String typeOfTrap) {
        this.typeOfTrap = typeOfTrap;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.description);
        hash = 41 * hash + Arrays.hashCode(this.interactables);
        hash = 41 * hash + Objects.hashCode(this.typeOfTrap);
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
        final TrapScene other = (TrapScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.typeOfTrap, other.typeOfTrap)) {
            return false;
        }
        if (!Arrays.equals(this.interactables, other.interactables)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TrapScene{" + "description=" + description + ", interactables=" + interactables + ", typeOfTrap=" + typeOfTrap + '}';
    }
    
    
}
