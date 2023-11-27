import java.awt.*;

public class Pacman {
    int PACMAN_WIDTH;
    int PACMAN_HEIGHT;
    int x;
    int y;
    int counter;
    int pelletsEaten;
    int xIncrement;
    int yIncrement;

    String characterDirection;

    boolean hasPower;

    public Pacman(int x, int y) {
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

    public void setDirection(String) {

    }

    public boolean isFacingBlock() {

    }

    public void respawn() {

    }

    public int colOnMaze() {

    }

    public int rowOnMaze() {

    }

    public void incrementPelletsEaten() {

    }

    public int numPelletsEaten() {

    }
    public boolean hasPower() {

    }
    public void givePower() {

    }
    public void resetPower() {

    }
    public void move() {

    }

    public void moveRight() {

    }

    public void moveLeft() {

    }

    public void paintCharacter(Graphics g) {

    }

    public void moveUp() {

    }

    public void moveDown() {

    }
}
