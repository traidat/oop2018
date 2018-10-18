package week5_6;

import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;
import java.awt.Graphics;

import javax.swing.*;
import java.util.ArrayList;

public class Layer {
    ArrayList<Shape> shape = new ArrayList<Shape>();

    public void DeleteTriangle() {
        for (int i = 0; i < shape.size(); i++) {
            if (shape.get(i) instanceof Triangle ) {
                shape.remove(i);
                i--;
            }

        }
    }
    
}
