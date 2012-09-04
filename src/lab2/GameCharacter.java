/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Jenni
 */
public class GameCharacter { 
    private String name;
    private boolean turn;
    private boolean alive;

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void createCharacter(String name){
        this.setName(name);
        this.setTurn(turn);
        this.setAlive(alive);
        this.getName();
        this.isTurn();
        this.isAlive();
        
    }
    
}
