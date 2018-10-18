package week5_6;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public abstract class Shape {
    Color c;

    public Shape(Color c) {
        
        this.c = c;
    }


    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }
    
    public abstract void draw(Graphics g);
}

    
