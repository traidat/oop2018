package week5_6;

public class Circle extends Shape {
    int radius;

    public Circle(boolean filled, Position p, int radius) {
        super(filled, p);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
