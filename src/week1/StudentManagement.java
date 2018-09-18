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



    }

    void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {
        Student student1 = new Student("ai biet", "120212", "traidat@gmail.com");
        Student student2 = new Student();
        Student student3 = new Student(student1);
        StudentManagement manager = new StudentManagement();
        student2.setGroup("INT22042");
        System.out.println(student1.getName());
        student1.getInfo();
        student2.getInfo();
        student3.getInfo();
        if (manager.sameGroup(student1, student2) == true)
            System.out.println("Cung lop");
        else  System.out.println("khac lop");





    }
}

