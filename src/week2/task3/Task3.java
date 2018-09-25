package week2.task3;

public class job {
    private long salary; // tien luong theo $
    private int condition; // dieu kien lam viec xep theo thang tu 1-10
    private boolean favorite; //tra ve true neu yeu thich cong viec

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    // neu bang true se bo viec
    public boolean quit() {
        if (favorite == false || salary <= 1000 || condition < 5) {
            return true
        }
        else return false;
    }

    // so sanh hai cong viec cai nao tot hon
    public job compareJob(job other) {
        if(this.salary < other.salary && this.condition >= other.condition)
            return other;
        else return this;
    }
    // thang chuc thi tang tien va dieu kien lam viec
    public void promotion() {
        this.salary+=500;
        this.condition+=1;
    }
}
// nha
public class house {
    private double distance; // khoang cach den truong, noi lam viec
    private int condition; // dieu kien cua nha tu 1-10
    private long price;//  gia nha va cac phu phi $

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distanceToSchool) {
        this.distance = distanceToSchool;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
    // so sanh hai nha
    public house compareHouse(house other){
        if (this.condition <= other.condition && this.price > other.price )
            return other;
        else return this;
    }
    // tra ve true neu quyet dinh mua nha
    public boolean rent() {
        if (price < 100000 && condition > 5 && distance <= 5)
            return true;
        else return false;
    }
    // gia tri cua ngoi  theo thoi gian (years)
    public void priceDown(int time) {
        price = price - time*100;
    }
}
public class friend {
    private String sex; // gioi tinh
    private int friendLevel; // do than thiet tu 1-10
    private String status;// tinh trang voi ban nhu ban than, khong con la ban, ban xa giao...

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getFriendLevel() {
        return friendLevel;
    }

    public void setFriendLevel(int friendLevel) {
        this.friendLevel = friendLevel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // cach xu li khi ban om
    public void checkFriendStatus() {
        if (friendLevel < 5)
            System.out.println("hoi tham");
        if (friendLevel >=5)
            System.out.println("gap mat tang qua");
    }
    // tra ve true neu co tinh cam
    public boolean girlFriend() {
        if (sex == "nu" && friendLevel >=9)
            return true;
        else return false;
    }
    // khong con la ban be
    public void unFriend() {
        if (friendLevel < 1)
            status = "khong con la ban";
    }
}

