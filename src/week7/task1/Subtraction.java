package week7.task1;

public class Subtraction extends BinaryExpression{
    Expression left;
    Expression right;

    @Override
    public String toString() {
        return left + " - " + right + " = " + this.evaluate();
    }

    public Expression left() {
        return left;
    }

    public Expression right() {
        return right;
    }

    public Subtraction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
