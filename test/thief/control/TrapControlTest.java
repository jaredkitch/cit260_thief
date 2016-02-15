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

    /**
     * Test of calculateValue method, of class TrapControl.
     */
    @Test
    public void testCalculateValue() {
        System.out.println("calculateValue");
        
        System.out.println("Test Case 1");
        double diamondsStolen = 4;
        double vaseValue = 12500;
        double paintingValue = 200000;
        double sculptureValue = 50000;
        double goldValue = 125000;
        TrapControl instance = new TrapControl();
        double expResult = 587500;
        double result = instance.calculateValue(diamondsStolen, vaseValue, paintingValue, sculptureValue, goldValue);
        assertEquals(expResult, result, 0.0);
        System.out.println("Result is " + result);
        
        System.out.println("Test Case 2");
        diamondsStolen = -2;
        vaseValue = 100000;
        paintingValue = 75000;
        sculptureValue = 150000;
        goldValue = 1000000;
        instance = new TrapControl();
        expResult = -911;
        result = instance.calculateValue(diamondsStolen, vaseValue, paintingValue, sculptureValue, goldValue);
        assertEquals(expResult, result, 0.0);
        System.out.println("Result is " + result);
        
        System.out.println("Test Case 3");
        diamondsStolen = 1;
        vaseValue = -3;
        paintingValue = 100000;
        sculptureValue = 75000;
        goldValue = 15000;
        instance = new TrapControl();
        expResult = -911;
        result = instance.calculateValue(diamondsStolen, vaseValue, paintingValue, sculptureValue, goldValue);
        assertEquals(expResult, result, 0.0);
        System.out.println("Result is " + result);
        
        System.out.println("Test Case 4");
        diamondsStolen = 4;
        vaseValue = 1000000;
        paintingValue = -4;
        sculptureValue = 100000;
        goldValue = 75000;
        instance = new TrapControl();
        expResult = -911;
        result = instance.calculateValue(diamondsStolen, vaseValue, paintingValue, sculptureValue, goldValue);
        assertEquals(expResult, result, 0.0);
        System.out.println("Result is " + result);
        
        System.out.println("Test Case 5");
        diamondsStolen = 7;
        vaseValue = 150000;
        paintingValue = 1000000;
        sculptureValue = -5;
        goldValue = 100000;
        instance = new TrapControl();
        expResult = -911;
        result = instance.calculateValue(diamondsStolen, vaseValue, paintingValue, sculptureValue, goldValue);
        assertEquals(expResult, result, 0.0);
        System.out.println("Result is " + result);
        
        System.out.println("Test Case 6");
        diamondsStolen = 10;
        vaseValue = 75000;
        paintingValue = 150000;
        sculptureValue = 1000000;
        goldValue = -6;
        instance = new TrapControl();
        expResult = -911;
        result = instance.calculateValue(diamondsStolen, vaseValue, paintingValue, sculptureValue, goldValue);
        assertEquals(expResult, result, 0.0);
        System.out.println("Result is " + result);
        
        System.out.println("Test Case 7");
        diamondsStolen = 0;
        vaseValue = 10000;
        paintingValue = 100000;
        sculptureValue = 1000000;
        goldValue = 10000000;
        instance = new TrapControl();
        expResult = 11110000;
        result = instance.calculateValue(diamondsStolen, vaseValue, paintingValue, sculptureValue, goldValue);
        assertEquals(expResult, result, 0.0);
        System.out.println("Result is " + result);
        
        System.out.println("Test Case 8");
        diamondsStolen = 10;
        vaseValue = 0;
        paintingValue = 10000;
        sculptureValue = 100000;
        goldValue = 1000000;
        instance = new TrapControl();
        expResult = 1610000;
        result = instance.calculateValue(diamondsStolen, vaseValue, paintingValue, sculptureValue, goldValue);
        assertEquals(expResult, result, 0.0);
        System.out.println("Result is " + result);
        
        System.out.println("Test Case 9");
        diamondsStolen = 100;
        vaseValue = 1000000;
        paintingValue = 0;
        sculptureValue = 10000;
        goldValue = 100000;
        instance = new TrapControl();
        expResult = 6110000;
        result = instance.calculateValue(diamondsStolen, vaseValue, paintingValue, sculptureValue, goldValue);
        assertEquals(expResult, result, 0.0);
        System.out.println("Result is " + result);
        
        System.out.println("Test Case 10");
        diamondsStolen = 1000;
        vaseValue = 100000;
        paintingValue = 1000000;
        sculptureValue = 0;
        goldValue = 10000;
        instance = new TrapControl();
        expResult = 51110000;
        result = instance.calculateValue(diamondsStolen, vaseValue, paintingValue, sculptureValue, goldValue);
        assertEquals(expResult, result, 0.0);
        System.out.println("Result is " + result);
        
        System.out.println("Test Case 11");
        diamondsStolen = 10000;
        vaseValue = 10000;
        paintingValue = 100000;
        sculptureValue = 1000000;
        goldValue = 0;
        instance = new TrapControl();
        expResult = 501110000;
        result = instance.calculateValue(diamondsStolen, vaseValue, paintingValue, sculptureValue, goldValue);
        assertEquals(expResult, result, 0.0);
        System.out.println("Result is " + result);
        
        
    }

    /**
     * Test of avoidLasers method, of class TrapControl.
     */
    @Test
    public void testAvoidLasers() {
        System.out.println("avoidLasers Test Case 1");
        double laserFieldLength = 2.0;
        double laserFieldHeight = 15.0;
        double numberOfLasers = 5.0;
        TrapControl instance = new TrapControl();
        double expResult = 6.0;
        double result = instance.avoidLasers(laserFieldLength, laserFieldHeight, numberOfLasers);
        assertEquals(expResult, result, 0.0);
    
         System.out.println("avoidLasers Test Case 2");
        laserFieldLength = -3.0;
        laserFieldHeight = 4.0;
        numberOfLasers = 3.0;
        instance = new TrapControl();
        expResult = -911;
        result = instance.avoidLasers(laserFieldLength, laserFieldHeight, numberOfLasers);
        assertEquals(expResult, result, 0.0);
        
         System.out.println("avoidLasers Test Case 3");
        laserFieldLength = 4.0;
        laserFieldHeight = -6.0;
        numberOfLasers = 3.0;
        instance = new TrapControl();
        expResult = -911;
        result = instance.avoidLasers(laserFieldLength, laserFieldHeight, numberOfLasers);
        assertEquals(expResult, result, 0.0);
        
         System.out.println("avoidLasers Test Case 4");
        laserFieldLength = 5.0;
        laserFieldHeight = 7.0;
        numberOfLasers = -10.0;
        instance = new TrapControl();
        expResult = -911;
        result = instance.avoidLasers(laserFieldLength, laserFieldHeight, numberOfLasers);
        assertEquals(expResult, result, 0.0);
        
         System.out.println("avoidLasers Test Case 5");
        laserFieldLength = 3.5;
        laserFieldHeight = 5;
        numberOfLasers = 6;
        instance = new TrapControl();
        expResult = -911;
        result = instance.avoidLasers(laserFieldLength, laserFieldHeight, numberOfLasers);
        assertEquals(expResult, result, 0.0);
        
         System.out.println("avoidLasers Test Case 6");
        laserFieldLength = 7.0;
        laserFieldHeight = 5.5;
        numberOfLasers = 2.0;
        instance = new TrapControl();
        expResult = -911;
        result = instance.avoidLasers(laserFieldLength, laserFieldHeight, numberOfLasers);
        assertEquals(expResult, result, 0.0);
        
         System.out.println("avoidLasers Test Case 7");
        laserFieldLength = 0.0;
        laserFieldHeight = 3.0;
        numberOfLasers = 7.0;
        instance = new TrapControl();
        expResult = -911;
        result = instance.avoidLasers(laserFieldLength, laserFieldHeight, numberOfLasers);
        assertEquals(expResult, result, 0.0);
        
         System.out.println("avoidLasers Test Case 8");
        laserFieldLength = 5.0;
        laserFieldHeight = 0.0;
        numberOfLasers = 6.0;
        instance = new TrapControl();
        expResult = -911;
        result = instance.avoidLasers(laserFieldLength, laserFieldHeight, numberOfLasers);
        assertEquals(expResult, result, 0.0);
        
         System.out.println("avoidLasers Test Case 9");
        laserFieldLength = 8.0;
        laserFieldHeight = 4.0;
        numberOfLasers = 0.0;
        instance = new TrapControl();
        expResult = -911;
        result = instance.avoidLasers(laserFieldLength, laserFieldHeight, numberOfLasers);
        assertEquals(expResult, result, 0.0);
        
         System.out.println("avoidLasers Test Case 10");
        laserFieldLength = 6.0;
        laserFieldHeight = 5.0;
        numberOfLasers = 3.0;
        instance = new TrapControl();
        expResult = 10.0;
        result = instance.avoidLasers(laserFieldLength, laserFieldHeight, numberOfLasers);
        assertEquals(expResult, result, 0.0);
    }
   
    
}

