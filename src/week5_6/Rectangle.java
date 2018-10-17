package week5_6;

public class Rectangle extends Shape {
    int width;
    int length;

    public Rectangle(boolean filled, Position p, int width, int length) {
        super(filled, p);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
