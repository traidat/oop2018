package week4.task2;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public static void main(String[] args) {
        Square hvuong = new Square();
        Circle htron = new Circle();
        Rectangle hcn = new Rectangle();
        Shape hinh = new Shape();
        System.out.println(hvuong.toString());
        System.out.println(htron.toString());
        System.out.println(hcn.toString());
        System.out.println(hinh.toString());
    }
}
