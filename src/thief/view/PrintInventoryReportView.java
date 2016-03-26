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
import thief.model.InventoryItem;
import thief.model.Supplies;

/**
 *
 * @author Jon
 */
public class PrintInventoryReportView {
    
    protected final BufferedReader keyboard = Thief.getInFile();
    protected final PrintWriter console = Thief.getOutFile();
    
    public void printInventoryReportView(InventoryItem[] inventory, String outLocation) {
        try (PrintWriter out = new PrintWriter(outLocation)) {
            
            out.println("\n\n        Inventory Report                        ");
            out.printf("%n%-20s%10s", "Name", "Item Number");
            out.printf("%n%-20s%10s", "----", "-----------");
            
            for (InventoryItem item : inventory) {
                out.printf("%n%-20s%7d", item.getDescription() , item.getItemNumber());
            }
            
        } catch (IOException ex) {
        ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + ex.getMessage());
        }
        this.console.println("Write to file " + outLocation + " was successful");
        
    }
    
}
