package week7.task1;

public class ExpresstionTest {
    public static void main(String[] args) {
        Numeral so10 = new Numeral(10);
        Numeral so3 = new Numeral(3);
        Numeral so1 = new Numeral(1);
        Numeral so2 = new Numeral(2);
        Numeral so0 = new Numeral(0);

        Square a = new Square(so10);
        Subtraction b = new Subtraction(a,so1);
        Multiplication d = new Multiplication(so2, so3);
        Addition c = new Addition(b, d);
        Square e = new Square(c);
        Division f = new Division(so1, so0);
        try {
            f.evaluate();
        }
        catch (ArithmeticException t) {
            System.out.println("Loi chia cho 0");
        }
        System.out.println(e.evaluate());
    }
}
