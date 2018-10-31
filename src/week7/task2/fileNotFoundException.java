package week7.task2;

import java.io.FileNotFoundException;

public class fileNotFoundException {
    void FileNotFoundException() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
    public static void main (String[] args) {
        fileNotFoundException n = new fileNotFoundException();
        try {
            n.FileNotFoundException();
        }
        catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}
