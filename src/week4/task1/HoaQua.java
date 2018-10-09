package week4.task1;

public class HoaQua {
    /**
     * thuoc tinh ten va gia/kg
     */
    private String name;
    private double price;

    public HoaQua(String name, double price) {
        this.name = name;
        this.price = price;
    }

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

    public static void main(String[] args) {
        HoaQua buoi = new HoaQua("Buoi", 15000);
        Cam cam = new Cam("cam",20000,"cam",true);
        Tao tao = new Tao("tao", 30000, "do", false);
        CamSanh sanh = new CamSanh("cam sanh", 30000, "xanh", true, "vietnam", 60);
        CamThanhPhong tp = new CamThanhPhong("cam thanh phong", 50000, "cam", true, "trung quoc", 40);
        buoi.showALlHoaQua();
        cam.showAllCam();
        tao.showAllTao();
        sanh.showAllCamSanh();
        tp.showAllCamThanhPhong();


    }
}
