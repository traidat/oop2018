package week7.task2;

public class classCastException {
    void ClassCastException() throws ClassCastException {
        throw new ClassCastException();
    }
    public static void main (String[] args) {
        classCastException n = new classCastException();
        try {
            n.ClassCastException();
        }
        catch (ClassCastException e) {
            System.out.println(e.toString());
        }
    }
}
