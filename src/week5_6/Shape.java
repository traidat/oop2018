package week5_6;

import javax.swing.*;

public class Shape {
    boolean filled;
    Position p;

    public Shape(boolean filled, Position p) {
        this.filled = filled;
        this.p = p;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Position getP() {
        return p;
    }

    public void setP(Position p) {
        this.p = p;
    }
}
