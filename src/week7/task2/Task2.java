package week7.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    void NullPointerException() throws NullPointerException {
        String s = null;
        s.length();
    }
    void ArrayIndexOfBoundException() throws ArrayIndexOutOfBoundsException{
        int[] a = new int[2];
        a[3] = 0;
    }
    void ArithmeticException() throws ArithmeticException {
        int a = 5/0;
    }
    void ClassCastException() throws ClassCastException {
        Object d = new Double(0.5);
        String s = (String) d;
    }
    void IOException() throws IOException {
        throw new IOException();
    }
    void FileNotFoundException() throws FileNotFoundException {
        File f = new File("file.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        
    }
    public static void main (String[] args) {
        Task2 n = new Task2();
        try {
            n.ArrayIndexOfBoundException();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
        try {
            n.NullPointerException();
        }
        catch (NullPointerException e) {
            System.out.println(e.toString());
        }
        try {
            n.ArithmeticException();
        }
        catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
        try {
            n.ClassCastException();
        }
        catch (ClassCastException e) {
            System.out.println(e.toString());
        }
        try {
            n.FileNotFoundException();
        }
        catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
        try {
            n.IOException();
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
        
    
    }


}
