package week5_6;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {
    int radius;
    Position p;

    public Circle(Color c, Position p, int radius) {
        super(c);
        this.radius = radius;
        this.p = p;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void draw(Graphics g) {
       g.setColor(this.c);
       g.fillOval(this.p.x, this.p.y, this.radius, this.radius);
    }
}
