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
public class Location implements Serializable{
    
    private int location;
    private int availableCommands;
    private int row;
    private int column;
    private int floor;
    private StealableItemScene stealableItemscenes;
    private DummyRoom dummyRoom;
    private TrapScene trapScene;
    private String type;

    public Location() {
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }


    public int getAvailableCommands() {
        return availableCommands;
    }

    public void setAvailableCommands(int availableCommands) {
        this.availableCommands = availableCommands;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    
    
    public StealableItemScene getStealableItemscenes() {
        return stealableItemscenes;
    }

    public void setStealableItemScenes(StealableItemScene stealableItemscenes) {
        this.stealableItemscenes = stealableItemscenes;
    }

    public DummyRoom getDummyRoom() {
        return dummyRoom;
    }

    public void setDummyRoom(DummyRoom dummyRoom) {
        this.dummyRoom = dummyRoom;
    }

    public TrapScene getTrapScene() {
        return trapScene;
    }

    public void setTrapScene(TrapScene trapScene) {
        this.trapScene = trapScene;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
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
        final Location other = (Location) obj;
        if (this.location != other.location) {
            return false;
        }
        if (this.availableCommands != other.availableCommands) {
            return false;
        }
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.floor != other.floor) {
            return false;
        }
        if (!Objects.equals(this.stealableItemscenes, other.stealableItemscenes)) {
            return false;
        }
        if (!Objects.equals(this.dummyRoom, other.dummyRoom)) {
            return false;
        }
        if (!Objects.equals(this.trapScene, other.trapScene)) {
            return false;
        }
        return true;
    }

 



    @Override
    public String toString() {
        return "Location{" + "location=" + location + ", availableCommands=" + availableCommands + ", row=" + row + ", column=" + column + ", floor=" + floor + ", stealableItemscenes=" + stealableItemscenes + ", dummyRoom=" + dummyRoom + ", trapScene=" + trapScene + '}';
    }
    
    
    

    
    
    
}
