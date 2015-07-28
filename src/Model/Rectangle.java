package Model;

/**
 * Created by ROHIT on 28-07-2015.
 */
public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int CalculateArea(){
        return length*width;
    }
}
