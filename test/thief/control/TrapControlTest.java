/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jared
 */
public class TrapControlTest {
    
    public TrapControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculatePoundsOfC4 method, of class TrapControl.
     */
    @Test
    public void testCalculatePoundsOfC4() {
        System.out.println("calculatePoundsOfC4");
        
        System.out.println("Test case #1");
        double safeHeight = 10;
        double safeWidth = 12;
        double safeLength = 3;
        double c4PerCubicFeet = 4;
        TrapControl instance = new TrapControl();
        double expResult = 90;
        double result = instance.calculatePoundsOfC4(safeHeight, safeWidth, safeLength, c4PerCubicFeet);
        assertEquals(expResult, result, 0.0);
        System.out.println("Result is " + result);
        // TODO review the generated test code and remove the default call to fail.
        
        System.out.println("Test case #2");
        safeHeight = -13;
        safeWidth = 14;
        safeLength = 8;
        c4PerCubicFeet = 2;
        instance = new TrapControl();
        expResult = -911;
        result = instance.calculatePoundsOfC4(safeHeight, safeWidth, safeLength, c4PerCubicFeet);
        assertEquals(expResult, result, 0.0);
        System.out.println("Result is " + result);
        // TODO review the generated test code and remove the default call to fail.
        
        System.out.println("Test case #3");
        safeHeight = 7;
        safeWidth = -11;
        safeLength = 13;
        c4PerCubicFeet = 11;
        instance = new TrapControl();
        expResult = -911;
        result = instance.calculatePoundsOfC4(safeHeight, safeWidth, safeLength, c4PerCubicFeet);
        assertEquals(expResult, result, 0.0);
        System.out.println("Result is " + result);
        // TODO review the generated test code and remove the default call to fail.
        
        System.out.println("Test case #4");
        safeHeight = 15;
        safeWidth = 2;
        safeLength = -8;
        c4PerCubicFeet = 10;
        instance = new TrapControl();
        expResult = -911;
        result = instance.calculatePoundsOfC4(safeHeight, safeWidth, safeLength, c4PerCubicFeet);
        assertEquals(expResult, result, 0.0);
        System.out.println("Result is " + result);
        // TODO review the generated test code and remove the default call to fail.
        
        System.out.println("Test case #5");
        safeHeight = 4;
        safeWidth = 7;
        safeLength = 6;
        c4PerCubicFeet = -2;
        instance = new TrapControl();
        expResult = -911;
        result = instance.calculatePoundsOfC4(safeHeight, safeWidth, safeLength, c4PerCubicFeet);
        assertEquals(expResult, result, 0.0);
        System.out.println("Result is " + result);
        // TODO review the generated test code and remove the default call to fail
        
        System.out.println("Test case #6");
        safeHeight = 11;
        safeWidth = 6;
        safeLength = 4;
        c4PerCubicFeet = 0;
        instance = new TrapControl();
        expResult = -911;
        result = instance.calculatePoundsOfC4(safeHeight, safeWidth, safeLength, c4PerCubicFeet);
        assertEquals(expResult, result, 0.0);
        System.out.println("Result is " + result);
        // TODO review the generated test code and remove the default call to fail.
        
        System.out.println("Test case #7");
        safeHeight = 0;
        safeWidth = 45;
        safeLength = 21;
        c4PerCubicFeet = 33;
        instance = new TrapControl();
        expResult = 0;
        result = instance.calculatePoundsOfC4(safeHeight, safeWidth, safeLength, c4PerCubicFeet);
        assertEquals(expResult, result, 0.0);
        System.out.println("Result is " + result);
        // TODO review the generated test code and remove the default call to fail.
        
        System.out.println("Test case #8");
        safeHeight = 15;
        safeWidth = 0;
        safeLength = 63;
        c4PerCubicFeet = 88;
        instance = new TrapControl();
        expResult = 0;
        result = instance.calculatePoundsOfC4(safeHeight, safeWidth, safeLength, c4PerCubicFeet);
        assertEquals(expResult, result, 0.0);
        System.out.println("Result is " + result);
        // TODO review the generated test code and remove the default call to fail.
        
        System.out.println("Test case #9");
        safeHeight = 30;
        safeWidth = 55;
        safeLength = 0;
        c4PerCubicFeet = 21;
        instance = new TrapControl();
        expResult = 0;
        result = instance.calculatePoundsOfC4(safeHeight, safeWidth, safeLength, c4PerCubicFeet);
        assertEquals(expResult, result, 0.0);
        System.out.println("Result is " + result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of keypadCombination method, of class TrapControl.
     */
    @Test
    public void testKeypadCombination() {
        System.out.println("keypadCombination");
        
        System.out.println("Test Case 1");
        int secretNumberOne = 8;
        int secretNumberTwo = 2;
        int secretNumberThree = 3;
        TrapControl instance = new TrapControl();
        double expResult = 1.0;
        double result = instance.keypadCombination(secretNumberOne, secretNumberTwo, secretNumberThree);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        System.out.println("Test Case 2");
        secretNumberOne = 0;
        secretNumberTwo = 6;
        secretNumberThree = 1;
        instance = new TrapControl();
        expResult = -911;
        result = instance.keypadCombination(secretNumberOne, secretNumberTwo, secretNumberThree);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 3");
        secretNumberOne = 4;
        secretNumberTwo = 0;
        secretNumberThree = 6;
        instance = new TrapControl();
        expResult = -911;
        result = instance.keypadCombination(secretNumberOne, secretNumberTwo, secretNumberThree);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 4");
        secretNumberOne = 6;
        secretNumberTwo = 3;
        secretNumberThree = -1;
        instance = new TrapControl();
        expResult = -911;
        result = instance.keypadCombination(secretNumberOne, secretNumberTwo, secretNumberThree);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 5");
        secretNumberOne = 9;
        secretNumberTwo = 3;
        secretNumberThree = 9;
        instance = new TrapControl();
        expResult = -911;
        result = instance.keypadCombination(secretNumberOne, secretNumberTwo, secretNumberThree);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 6");
        secretNumberOne = 8;
        secretNumberTwo = 4;
        secretNumberThree = 0;
        instance = new TrapControl();
        expResult = 2;
        result = instance.keypadCombination(secretNumberOne, secretNumberTwo, secretNumberThree);
        assertEquals(expResult, result, 0.0);
        
    }
   
    
}
