package OOPS;

public class Student {
    // Class Members/Variables
    int rollNo;
    String name;
    double fees;
    String course;
    String collegeName = "Sharda";

    public static void main(String[] args) {
        // Student - Data Type
        // obj_1 - reference variable
        // new - reserved keyword used to create new object in memory
        // Student() - Constructor of class Student
        Student obj_1 = new Student();

        obj_1.name = "Ram Sharma";
        obj_1.rollNo = 101;
        obj_1.fees = 45000.00;
        obj_1.course = "BCA";

        System.out.println("Roll No : " + obj_1.rollNo);
        System.out.println("Name : " + obj_1.name);
        System.out.println("Fees : " + obj_1.fees);
        System.out.println("Course : " + obj_1.course);

        Student obj_2 = new Student();

        obj_2.name = "Shyam Sharma";
        obj_2.rollNo = 103;
        obj_2.fees = 40000.00;
        obj_2.course = "BCA";

        System.out.println("Roll No : " + obj_2.rollNo);
        System.out.println("Name : " + obj_2.name);
        System.out.println("Fees : " + obj_2.fees);
        System.out.println("Course : " + obj_2.course);
    }
}
