package week7.task2;

public class ArrayindexOfBoundException {
    void ArrayIndexOutOfBoundsException() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException();
    }
    public static void main (String[] args) throws ArrayIndexOutOfBoundsException{
        ArrayindexOfBoundException n = new ArrayindexOfBoundException();
        try {
            n.ArrayIndexOutOfBoundsException();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
}
