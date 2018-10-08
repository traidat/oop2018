package week4.task1;

public class Cam extends HoaQua{
    /**
     * thuoc tinh mau sac cam va true neu co hat
     */
    private String color;
    private boolean seed;

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
     * dua ra tat ca thuoc tinh cua cam
     */
    public void showAllCam() {
        String s = new String();
        if (seed == true)
            s = " co hat";
        else s = " khong hat";
        System.out.println(getName() + " gia: " + getPrice() + " mau : " color + s);
    }

    /**
     * kiem tra xem la cam sanh hay cam thanh phong
     */
    public void check() {
        if (color.equals("cam"))
            System.out.println("cam thanh phong");
        else if (color.equals("xanh"))
            System.out.println("cam sanh");
    }
}
