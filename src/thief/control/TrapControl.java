/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.control;

import exceptions.TrapControlExceptions;
import thief.view.BlowUpSafeView;

/**
 *
 * @author Jon
 */
public class TrapControl {
    
    //Group Assignment
    public static double calculatePoundsOfC4( double safeHeight, double safeWidth, double safeLength, double c4PerCubicFeet) throws TrapControlExceptions {
        if ( safeHeight < 0 || safeWidth < 0 || safeLength < 0 || c4PerCubicFeet <= 0 ) {
            throw new TrapControlExceptions("Can not calculate Volume with values less than 0");          
        }

        double poundsOfC4 = ( safeHeight * safeWidth * safeLength ) / c4PerCubicFeet;

        return poundsOfC4;
        
    }
    
    //Jon's Assignment
    public static double keypadCombination (int secretNumberOne, int secretNumberTwo, int secretNumberThree) throws TrapControlExceptions {
        if (secretNumberOne <= 0 || secretNumberTwo <= 0 || secretNumberThree < 0) {
            throw new TrapControlExceptions("Can not calculate the secret Numbers with values less than 0!");
        }
        
        if (secretNumberThree >  (secretNumberOne / secretNumberTwo)){
            throw new TrapControlExceptions("Cannot have a Negative result!");
        }
        
        int keypad = ( secretNumberOne / secretNumberTwo) - secretNumberThree;
        return keypad;
    }
    
    //Jared's Assignment
    public static double calculateValue(double diamondsStolen, double vaseValue, double paintingValue,
            double sculptureValue, double goldValue) {

        if (diamondsStolen < 0 || vaseValue < 0 || paintingValue < 0 || sculptureValue < 0 || goldValue < 0 ) {
            return -911;
        }

        double totalValue = ( diamondsStolen * 50000 ) + vaseValue + paintingValue + sculptureValue + goldValue;
        return totalValue;
        }


    //Tisha's Assignment
    public static double avoidLasers (double laserFieldLength, double laserFieldHeight, double numberOfLasers) {
       
        if (laserFieldLength <= 0 || laserFieldHeight <= 0 || numberOfLasers <= 0) 
            return -911;
        
        if (laserFieldLength % 1 != 0 || laserFieldHeight % 1 != 0 || numberOfLasers % 1 != 0) 
            return -911;
        
        double footstepLength = ( laserFieldLength * laserFieldHeight) / numberOfLasers;
        return footstepLength;
    }
}