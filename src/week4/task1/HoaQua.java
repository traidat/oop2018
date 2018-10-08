package week4.task1;

public class HoaQua {
    /**
     * thuoc tinh ten va gia/kg
     */
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * phuong thuc dua ra ten va gia
     */
    public void showALlHoaQua() {
        System.out.println(name + " gia: " + price);
    }

    /**
     * phuong thuc tinh so kg mua duoc
     * @param money la so tien co
     * @return so kg hoa qua mua dc
     */
    public double buy(double money) {
        return money/price;
    }
}
