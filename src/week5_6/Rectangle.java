package week5_6;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {
    int width;
    int length;
    Position p;
    
    public Rectangle(int width, int length, Position p, Color c) {
        super(c);
        this.width = width;
        this.length = length;
        this.p = p;
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
    public void draw(Graphics g){
        g.setColor(this.c);
        g.fillRect(this.p.x, this.p.y, this.width, this.length);
    }
}
