//package week5_6;
//
//import java.awt.Color;
//import java.awt.Graphics;
//
//public class Triangle extends Shape {
//    Position d1, d2, d3;
//
//public Triangle(Color c, Position d1, Position d2, Position d3) {
//        super(c);
//        this.d1 = d1;
//        this.d2 = d2;
//        this.d3 = d3;
//    }
//
//    public Position getD1() {
//        return d1;
//    }
//
//    public void setD1(Position d1) {
//        this.d1 = d1;
//    }
//
//    public Position getD2() {
//        return d2;
//    }
//
//    public void setD2(Position d2) {
//        this.d2 = d2;
//    }
//
//    public Position getD3() {
//        return d3;
//    }
//
//    public void setD3(Position d3) {
//        this.d3 = d3;
//    }
//    public void draw(Graphics g) {
//        g.setColor(this.c);
//        g.drawLine(this.d1.x,this.d2.x, this.d1.y,this.d2.y);
//        g.drawLine(this.d3.x,this.d2.x, this.d3.y,this.d2.y);
//        g.drawLine(this.d1.x,this.d3.x, this.d1.y,this.d3.y);
//    }
//}
//
