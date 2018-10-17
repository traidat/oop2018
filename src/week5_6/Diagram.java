package week5_6;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Diagram extends JPanel {
    ArrayList<Layer> layers = new ArrayList<Layer>();

    public void deleteCircle() {
        for(int n = 0; n < layers.size(); n++) {
            for (int i = 0; i < layers.get(n).shape.size(); i++) {
                if (layers.get(n).shape.get(i) instanceof Triangle) {
                    layers.get(n).shape.remove(i);
                    i--;
                }
            }
        }
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        Position p1 = new Position(500, 600);
        Position p2 = new Position(100, 200);
        Position p3 = new Position(300, 400);
        Shape tron = new Circle(true, p1, 100);
        Shape vuong = new Square(false, p2, 100);
        Shape cn = new Rectangle(true, p3,100,200);
        Layer layer = new Layer();
        layer.shape.add(tron);
        layer.shape.add(vuong);
        layer.shape.add(cn);

        g.setColor(Color.BLACK);
        g.fillRect(cn.p.x, cn.p.y, ((Rectangle) cn).width, ((Rectangle) cn).length);
        g.drawRect(vuong.p.x, vuong.p.y, ((Square) vuong).size, ((Square) vuong).size);
        g.fillOval(tron.p.x, tron.p.y, ((Circle) tron).radius, ((Circle) tron).radius);
    }

    public static void main(String[] args) {

        Diagram d = new Diagram();
        JFrame f=new JFrame();
        f.add(d);
        f.setSize(1000,1000);
        f.setVisible(true);

    }
}
