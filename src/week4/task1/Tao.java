package week4.task1;

public class Tao extends  HoaQua{
    /**
     * thuoc tinh mau sac tao va true neu co hat
     */
    private String color;
    private boolean seed;

    public Tao(String name, double price, String color, boolean seed) {
        super(name, price);
        this.color = color;
        this.seed = seed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSeed() {
        return seed;
    }

    public void setSeed(boolean seed) {
        this.seed = seed;
    }

    /**
     * dua ra tat ca thuoc tinh cua tao
     */
    public void showAllTao() {
        String s = new String();
        if (seed == true)
            s = " co hat";
        else s = " khong hat";
        System.out.println(getName() + " gia: " + getPrice() + " mau : " + color + s);
    }

    /**
     * kiem tra xem la tao mi hay tao viet nam
     */
    public void check() {
        if (color.equals("do"))
            System.out.println("tao mi");
        else if (color.equals("xanh"))
            System.out.println("tao viet nam");
    }
}
