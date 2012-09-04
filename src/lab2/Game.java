/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Jenni
 */
public class Game {
    
    GameBoard gameBoard = new GameBoard();
    GameCharacter character1 = new GameCharacter();
    
    public void playGame() {
        gameBoard.createGameBoard();
        character1.createCharacter("Mario");
    }
    
    
    
    
}
