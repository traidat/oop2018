package week5_6;

public class Square extends Shape {
    int size;

    public Square(boolean filled, Position p, int size) {
        super(filled, p);
        this.size = size;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
