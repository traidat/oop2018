package week1;

public class StudentManagement {

    Student[] arrayStudent = new Student[100];

    public boolean sameGroup(Student s1, Student s2) {
        if (s1.getGroup() == s2.getGroup()) {
            return true;
        }
        else return false;
    }

    void studentsByGroup() {
        int numberStudent = 0, numberGroup = 1;
        boolean check = true;
        String[] listGroup = new String[100];
        for (int i = 0; i < 100; i++) {
            if (arrayStudent[i] == null) {
                numberStudent = i ;
                break;
            }
        }
        listGroup[0] = arrayStudent[0].getGroup();
        for (int i = 1; i < numberStudent; i++) {
            check = true;
            for (int j = 0; j < numberGroup; j++) {
                if (arrayStudent[i].getGroup() == listGroup[j])
                    check = false;
            }
            if (check == true) {
                listGroup[numberGroup] = arrayStudent[i].getGroup();
                numberGroup++;
            }
        }
        for (int i = 0; i < numberGroup; i++) {
            System.out.println("danh sach sinh vien nhom " + listGroup[i] + ":");
            for (int j = 0; j < numberStudent; j++) {
                if (arrayStudent[j].getGroup() == listGroup[i])
                    System.out.println(arrayStudent[j].getName());
            }
        }
    }


    void removeStudent(String id) {
        int numberStudent = 0;
        for (int i = 0; i < 100; i++) {
            if (arrayStudent[i] == null) {
                numberStudent = i ;
                break;
            }
        }
        for (int i = 0; i < numberStudent; i++) {
            if (arrayStudent[i].getID() == id) {
                for (int j = i; j < numberStudent - 1; j++) {
                    arrayStudent[j] = arrayStudent[j + 1];
                }
                arrayStudent[numberStudent - 1] = null;
                numberStudent = numberStudent - 1;
            }
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("ai biet", "002", "traidat@gmail.com");
        Student student2 = new Student();
        Student student3 = new Student(student1);
        Student student4 = new Student("traidat", "001", "tr@gmail.com");
        StudentManagement manager = new StudentManagement();
        student2.setGroup("INT22042");
        System.out.println(student1.getName());
        student1.getInfo();
        student2.getInfo();
        student3.getInfo();
        if (manager.sameGroup(student1, student2) == true)
            System.out.println("Cung lop");
        else  System.out.println("khac lop");
        manager.arrayStudent[0] = student1;
        manager.arrayStudent[1] = student2;
        manager.arrayStudent[2] = student3;
        manager.arrayStudent[3] = student4;
        manager.studentsByGroup();
        manager.removeStudent("002");
        System.out.println("danh sach sau khi xoa");
        manager.studentsByGroup();
    }
}

