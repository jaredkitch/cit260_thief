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
public enum SceneType {
    van("Van  "),
    exhibitRoom("   E  "),
    sculptureRoom("   SC  |"),
    securityRoom("  SE  "),
    restrooms(" R    "),
    hallway("  H   "),
    mainEntry("   ME  "),
    stairs(" ST  "),
    lobby("    L   "),
    controlRoom(" CR |"),
    diamondRoom("  DR  |"),
    administration("   A  |"),
    goldRoom("   G  "),
    janitorCloset(" J  |  "),
    laserRoom("L   |"),
    balcony("    B  "),
    vaseRoom("   V  "),
    paintingRoom("  P     ");
    
private final String abbreviation;

SceneType(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    
   
    public String getAbbreviation() {
        return abbreviation;
}
}
