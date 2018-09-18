package week1;

public class Student {
    private String name, id, group, email;

    public String getName() {
        return name;

    }
    public void setName(String s) {
        name = s;
    }
    public String getID() {
        return id;
    }
    public void setID(String s) {
        id = s;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String s) {
        group = s;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String s) {
        email = s;
    }
    public void getInfo(){
        System.out.println("Ten " + name + " ID " + id + " Group " + group + " Email " + email );
    }

    Student() {
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";

    }
    Student(String n, String sid, String em) {
        name = n;
        id = sid;
        email = em;
        group = "INT22041";
    }
    Student( Student s) {
        name = s.getName();
        id = s.getID();
        group = s.getGroup();
        email = s.getEmail();
    }
}
