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
 * @author Tish
 */
public enum StealableItems implements Serializable{
    diamonds(5000),
    goldBars(50000),
    painting(10000),
    sculpture(7500),
    vase(15000);
   
    // class instance variables
    private final int value;

StealableItems(int value) {
        this.value = value;
    }
    
   
    public int getValue() {
        return value;
    }
}
