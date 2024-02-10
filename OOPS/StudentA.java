package OOPS;

// DRY - Don't Repeat Yourself

public class StudentA {
    // Class Members/Variables
    int rollNo;
    String name;
    double fees;
    String course;
    String collegeName = "Sharda";

    public void takeInput(int rollNo, String name, double fees, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.fees = fees;
        this.course = course;
    }

    public void showDetails() {
        // this - holds the reference of current object
        System.out.println("This : " + this);
        System.out.println("Roll No : " + this.rollNo);
        System.out.println("Name : " + this.name);
        System.out.println("Fees : " + this.fees);
        System.out.println("Course : " + this.course);
        System.out.println("===============");
    }

    public static void main(String[] args) {
        StudentA obj_1 = new StudentA();

        // obj_1.name = "Ram Sharma";
        // obj_1.rollNo = 101;
        // obj_1.fees = 45000.00;
        // obj_1.course = "BCA";
        obj_1.takeInput(101, "Ram", 45000.00, "BCA");
        System.out.println("Object_1 : " + obj_1);
        obj_1.showDetails();

        StudentA obj_2 = new StudentA();

        // obj_2.name = "Shyam Sharma";
        // obj_2.rollNo = 103;
        // obj_2.fees = 40000.00;
        // obj_2.course = "BCA";
        obj_2.takeInput(102, "Shyam", 50000.00, "MCA");
        System.out.println("Object_2 : " + obj_2);
        obj_2.showDetails();
    }
}
