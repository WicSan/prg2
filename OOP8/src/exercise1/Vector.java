package exercise1;

/**
 *
 * @author sandr
 */
public class Vector {
    private int x, y;
    
    public Vector(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void add(Vector value){
        x += value.getX();
        y += value.getY();
    }
}
