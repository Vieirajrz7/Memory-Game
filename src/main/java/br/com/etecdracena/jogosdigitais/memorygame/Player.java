/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.etecdracena.jogosdigitais.memorygame;

/**
 *
 * @author 23040
 */
public class Player {
    
    String name;
    Integer points;
    
    public Player(String namePlayer){
        name = name.equals("") ? "Player" : namePlayer;
        points = 0;
    }
    
    public String getName(){
        return name;
    }
    
    public Integer getPoints(){
        return points;
    }
    
    public void incrementPoints(){
       points += 5;   
    }
    
    public void decrementPoints(){
        points--;
    }
}
