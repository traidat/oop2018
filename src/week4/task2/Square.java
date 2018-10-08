package week4.task2;

public class Square extends Rectangle {
    private double size;

    public Square(String color, boolean filled, double width, double length, double size) {
        super(color, filled, width, length);
        this.size = size;
    }

    public Square(double size) {
        this.size = size;
    }

    public Square() {
        this.size = super.getLength();
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public void setWidth(double size) {
        setWidth(size);
    }

    public void setLength(double size) {
        setLength(size);
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                '}';
    }

    public void main(String[] args) {
        Square hvuong = new Square();
        Circle htron = new Circle();
        Rectangle hcn = new Rectangle();
        Shape hinh = new Shape();




    }
}
