package week7.task1;

public class Square extends Expression{
    Expression expression;

    @Override
    public String toString() {
        return "Square(" + expression + ") = " + this.evaluate();
    }

    @Override
    public int evaluate() {
        return expression.evaluate() * expression.evaluate();
    }

    public Square(Expression expression) {
        this.expression = expression;
    }
}
