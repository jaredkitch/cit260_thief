/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.control;

/**
 *
 * @author Jon
 */
public class TrapControl {
    
    public double calculatePoundsOfC4( double safeHeight, double safeWidth, double safeLength, double c4PerCubicFeet) {
        if ( safeHeight < 0 || safeWidth < 0 || safeLength < 0 || c4PerCubicFeet <= 0 ) {
            return -911;
        }

        double poundsOfC4 = ( safeHeight * safeWidth * safeLength ) / c4PerCubicFeet;

        return poundsOfC4;
        
    }
    
    
}
