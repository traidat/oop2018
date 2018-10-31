package week7.task2;

public class Nullpointerexception {
    void NullPointerException() throws NullPointerException {
        throw new NullPointerException();
    }
    public static void main (String[] args) throws NullPointerException{
        Nullpointerexception n = new Nullpointerexception();
        try {
            n.NullPointerException();
        }
        catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}
