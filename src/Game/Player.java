package Game;

public abstract class Player {
    double posX;
    double posY;

    Player(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    abstract void move();
}
