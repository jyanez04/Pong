package Game;

public class Ball {
    int size;
    double posX;
    double posY;

    public Ball(int size, double posX, double posY) {
        this.size = size;
        this.posX = posX;
        this.posY = posY;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }
}
