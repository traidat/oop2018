package week7.task2;

import java.io.IOException;

public class iOException {
    void IOException() throws IOException {
        throw new IOException();
    }
    public static void main (String[] args) {
        iOException n = new iOException();
        try {
            n.IOException();
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
