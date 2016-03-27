/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import thief.Thief;
import thief.model.Location;
import thief.model.Map;

/**
 *
 * @author Jared
 */

public class PrintMapLocationsView {
    
    protected final BufferedReader keyboard = Thief.getInFile();
    protected final PrintWriter console = Thief.getOutFile();
    
    public void printMapLocationsView(Map map, String outLocation) {
            
        Location[][][] locations = map.getLocations();
        String abbreviation = "";
        String description = "";
        
        try (PrintWriter out = new PrintWriter(outLocation)) {
            
            out.println("\n                      Map Locations Report");
            out.println("----------------------------------------------------------------");
            out.printf("%n%-34s%-11s%-20s", "Room Description", "Room Abbr.", "Room Type");
            out.printf("%n%-34s%-11s%-20s", "---------------------------------", "----------", "-------------------");
            
            for (int i = 0; i < 2; i++) {
                for (int k = 0; k < 3; k++) {
                    for (int j = 0; j < 4; j++) {
                        if (locations[i][j][k].getType() == "D") {
                            abbreviation = locations[i][j][k].getDummyRoom().getAbbreviation().replaceAll("\\|", "").trim();
                            description = locations[i][j][k].getDummyRoom().getShortDescription();
                            out.printf("%n%-34s%-11s%-20s", description, abbreviation, "Dummy Room");
                        }
                        if (locations[i][j][k].getType() == "S") {
                            abbreviation = locations[i][j][k].getStealableItemscenes().getAbbreviation().replaceAll("\\|", "").trim();
                            description = locations[i][j][k].getStealableItemscenes().getShortDescription();
                            out.printf("%n%-34s%-11s%-20s", description, abbreviation, "Stealable Item Room");
                        }
                        if (locations[i][j][k].getType() == "T") {
                            abbreviation = locations[i][j][k].getTrapScene().getAbbreviation().replaceAll("\\|", "").trim();
                            description = locations[i][j][k].getStealableItemscenes().getShortDescription();
                            out.printf("%n%-34s%-11s%-20s", description, abbreviation, "Trap Room");
                        }           
                    } 
                }
            }
            
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(),
                "Error reading input: " + ex.getMessage());
        }
        this.console.println("Write to file " + outLocation + " was successful");
    }
}
