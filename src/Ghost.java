import java.awt.*;
import java.util.ArrayList;

public class Ghost {
    int GHOST_WIDTH;
    int GHOST_HEIGHT;
    int x;
    int y;

    String characterDirection;

    public ArrayList<String> String = new ArrayList<String>();


    public Ghost(){

    }

    public Ghost(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setDirection(String){

    }
    public void getDirection(){

    }
    public Boolean isFacingBlock(Boolean isFacingBlock){
        return isFacingBlock;
    }
    public Boolean isAtIntersection(Boolean isAtIntersection){
        return isAtIntersection;
    }
    public void reverse(){

    }
    public void respawn(){

    }
    public void paintCharacter(Graphics g){

    }

}
