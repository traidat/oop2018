//package week5_6;
//
//import javax.swing.*;
//import java.awt.*;
//import java.util.ArrayList;
//
//public class Diagram extends JFrame {
//    ArrayList<Layer> layers = new ArrayList<Layer>();
//
//    public void deleteCircle() {
//        for(int n = 0; n < layers.size(); n++) {
//            for (int i = 0; i < layers.get(n).shape.size(); i++) {
//                if (layers.get(n).shape.get(i) instanceof Triangle) {
//                    layers.get(n).shape.remove(i);
//                    i--;
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//
//        Layer l = new Layer();
//        Diagram d = new Diagram();
//        Position p1 = new Position(500, 600);
//        Position p2 = new Position(300, 400);
//        Position p3 = new Position(100, 200);
//        Position d1 = new Position(700, 800);
//        Position d2 = new Position(700, 900);
//        Position d3 = new Position(800, 900);
//
//        Shape tron = new Circle(Color.RED,p1,20);
//        Shape vuong = new Square(Color.BLACK, p2, 10);
//        Shape cn = new Rectangle(20, 30, p3, Color.BLUE);
//        Shape tg = new Triangle(Color.GREEN, d1, d2, d3);
//        l.shape.add(tg);
//        l.shape.add(tron);
//        l.shape.add(cn);
//        l.shape.add(vuong);
//        d.layers.add(l);
//        JFrame f=new JFrame();
//        f.add(d);
//        f.setSize(1000,1000);
//        f.setVisible(true);
//
//    }
//}
