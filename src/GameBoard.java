import java.awt.*;

public class GameBoard {

    Image titleScreenImage;

    Image endGameImage;

    Image winScreenImage;

    Pacman pacman;

    Ghost ghost[];

    int score;

    int numLives;

    int[][] mazeBlockPositions;

    MazeBlock[][] mazeBlocks;

    Pellets[][] tempPellets;

    boolean showTitleScreen;

    boolean showWinScreen;

    boolean showEndGameScreen;

    int initiateNewGame;

    int pacmanDying;

    long timer;

    Font font;

    Font font2;

    public GameBoard() {
    }

    public void reset() {

    }

    public void repositionCharacters() {

    }

    public void paintComponent(Graphics g) {

    }

    public boolean collided() {

    }

    public int pacmanCanEatGhost() {

    }

    public void eatGhost() {

    }

    public void decrementLives() {

    }

    public int getLives() {

    }

    public void eatPellets() {

    }
}
