/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Jenni
 */
public class GameBoard {
    private String space;
    private boolean start;
    private boolean end;
    

    public String getSpace() {
        return space;
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }

    public void setSpace(String space) {
        this.space = space;
    }
    
    public void createGameBoard(){
        this.setStart(start);
        this.setSpace(space);
        this.setEnd(end);
        this.isStart();
        this.getSpace();
        this.isEnd();
    }
}
