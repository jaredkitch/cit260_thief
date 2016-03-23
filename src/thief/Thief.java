/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import thief.model.*;
import thief.view.StartProgramView;
/**
 *
 * @author Jon, Jared, Tisha
 */
public class Thief {

    /**
     * @param args the command line arguments
     */
    
    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Thief.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Thief.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Thief.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Thief.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Thief.logFile = logFile;
    }
    
    
    
    public static void jonTests() {
        
         
       
}
    public static void jaredTests() {

         
}
    
    public static void tishaTests() {
        
    }
    
    public static void groupTests() {
      
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
     try {
         Thief.inFile = new BufferedReader(new InputStreamReader(System.in));
         
         Thief.outFile = new PrintWriter(System.out, true);
      
         String filePath = "log.txt";
         Thief.logFile = new PrintWriter(filePath);
         
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        return;
                
     } catch (Throwable e) {
         
         System.out.println("Exception: " + e.toString() +
                            "\nCause: " + e.getCause() +
                            "\nMessage: " + e.getMessage());
         
         e.printStackTrace();;
     } finally {
         try {
             if (Thief.inFile != null){
                 Thief.inFile.close();
             }
            if (Thief.outFile != null) {
                Thief.outFile.close();
            }
            if (Thief.logFile != null) {
                Thief.logFile.close();
            }
         } catch (IOException ex) {
             Logger.getLogger(Thief.class.getName()).log(Level.SEVERE, null, ex);
         }
         
     }
        
        
        
    }
    
}
