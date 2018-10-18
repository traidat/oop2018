//package week4.task1;
//
//public class CamThanhPhong extends Cam {
//    /**
//     * thuoc tinh xuat su va han su dung ke tu ngay san xuat;
//     */
//    private String origin;
//    private int expiryDate;
//
//    public CamThanhPhong(String name, double price, String color, boolean seed, String origin, int expiryDate) {
//        super(name, price, color, seed);
//        this.origin = origin;
//        this.expiryDate = expiryDate;
//    }
//
//    public String getOrigin() {
//        return origin;
//    }
//
//    public void setOrigin(String origin) {
//        this.origin = origin;
//    }
//
//    public int getExpirydate() {
//        return expiryDate;
//    }
//
//    public void setExpirydate(int expiryDate) {
//        this.expiryDate = expiryDate;
//    }
//
//    public void showAllCamThanhPhong() {
//        String s = new String();
//        if (isSeed() == true)
//            s = " co hat";
//        else s = " khong hat";
//        System.out.println(getName() + " gia: " + getPrice() + " mau : " + getColor() + s + " xuat xu " + origin);
//    }
//
//    /**
//     * dua ra han su dung con lai
//     * @param number la so ngay ke tu khi san xuat
//     * @return so ngay con lai cua han su dung
//     */
//    public int expiryDateRemain(int number) {
//        return expiryDate - number;
//    }
//}
