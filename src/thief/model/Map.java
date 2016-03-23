/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.model;

import java.io.Serializable;
import thief.view.ErrorView;

/**
 *
 * @author Jon
 */
public class Map implements Serializable{
    
    private double numberOfRows;
    private double numberOfColumns;
    private double numberOfFloors;
    private double associatedLocation;
    private Location[][][] locations;
    
    public Map(int noOfFloors, int noOfRows, int noOfColumns) {
        
        if (noOfFloors < 1 || noOfRows < 1 || noOfColumns < 1) {
        ErrorView.display(this.getClass().getName(), "The Number of floors, rows, and columns must be greater than zero");
        return;
    }
        this.numberOfFloors = noOfFloors;
        this.numberOfRows = noOfRows ;
        this.numberOfColumns = noOfColumns;
        
        this.locations = new Location[noOfFloors][noOfRows][noOfColumns];
        
        for (int floor = 0; floor < noOfFloors; floor++) {
            for(int row = 0; row < noOfRows; row++) {
                for(int column = 0; column < noOfColumns; column++) {
                    
                    Location location = new Location();
                    location.setFloor(floor);
                    location.setColumn(column);
                    location.setRow(row);
                    
                    locations[floor][row][column] = location;
                }                 
            }
        }
    }

    public double getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(double numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    
    public double getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(double numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public double getNumberOfColumns() {
        return numberOfColumns;
    }

    public void setNumberOfColumns(double numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
    }
    
    public double getAssociatedLocation() {
        return associatedLocation;
    }

    public void setAssociatedLocation(double associatedLocation) {
        this.associatedLocation = associatedLocation;
    }

    public Location[][][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][][] locations) {
        this.locations = locations;
    }


    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.numberOfFloors) ^ (Double.doubleToLongBits(this.numberOfFloors) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.numberOfRows) ^ (Double.doubleToLongBits(this.numberOfRows) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.numberOfColumns) ^ (Double.doubleToLongBits(this.numberOfColumns) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.associatedLocation) ^ (Double.doubleToLongBits(this.associatedLocation) >>> 32));
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
        final Map other = (Map) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + ", numberOfFloors=" + numberOfFloors + "numberOfRows=" + numberOfRows + ", numberOfColumns=" + numberOfColumns + ", associatedLocation=" + associatedLocation + '}';
    }
    
       
    
}
