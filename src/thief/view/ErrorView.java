/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.view;

import java.io.PrintWriter;
import thief.Thief;

/**
 *
 * @author Jon
 */
public class ErrorView {
    private static PrintWriter errorFile = Thief.getOutFile();
    private static PrintWriter logFile = Thief.getLogFile();
  public static void display(String className, String errorMessage) {
      
      errorFile.println( "Error - " + errorMessage );
      
      logFile.println(className +  " - " + errorMessage);
  }  
}
