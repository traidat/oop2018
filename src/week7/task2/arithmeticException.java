package week7.task2;

public class arithmeticException {
    void ArithmeticException() throws ArithmeticException {
        throw new ArithmeticException();
    }
    public static void main (String[] args) {
        arithmeticException n = new arithmeticException();
        try {
            n.ArithmeticException();
        }
        catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }
}
