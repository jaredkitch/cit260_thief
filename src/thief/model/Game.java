/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thief.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Tish
 */
public class Game implements Serializable {


    // class instance variables
    private int turnsRemaining;
    private Player player;
    private Map map;
    private Van van;
    private Guard guards;
    
    
    public Game() {
    }
    
    

    public int getTurnsRemaining() {
        return turnsRemaining;
    }

    public void setTurnsRemaining(int turnsRemaining) {
        this.turnsRemaining = turnsRemaining;
        
        
    }
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Van getVan() {
        return van;
    }

    public void setVan(Van van) {
        this.van = van;
    }

    public Guard getGuards() {
        return guards;
    }

    public void setGuards(Guard guards) {
        this.guards = guards;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.turnsRemaining;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.turnsRemaining != other.turnsRemaining) {
            return false;
        }
        return true;
    }



    @Override
    public String toString() {
        return "Game{" + "turnsRemaining=" + turnsRemaining + '}';
    }

    
    

    
    
    
}
