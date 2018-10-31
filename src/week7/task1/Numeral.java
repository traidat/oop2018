package week7.task1;

public class Numeral extends Expression{
    int value;

    @Override
    public String toString() {
        return value + "";
    }

    @Override
    public int evaluate() {
        return value;
    }

    public Numeral(int value) {
        this.value = value;
    }

    public Numeral() {
    }
}
