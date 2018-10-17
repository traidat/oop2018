package week5_6;

public class Triangle extends Shape {
    Position d1, d2, d3;

    public Triangle(boolean filled, Position p, Position d1, Position d2, Position d3) {
        super(filled, p);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public Position getD1() {
        return d1;
    }

    public void setD1(Position d1) {
        this.d1 = d1;
    }

    public Position getD2() {
        return d2;
    }

    public void setD2(Position d2) {
        this.d2 = d2;
    }

    public Position getD3() {
        return d3;
    }

    public void setD3(Position d3) {
        this.d3 = d3;
    }
}
