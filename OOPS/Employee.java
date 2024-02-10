package OOPS;

// Encapsulation
// Wrap variables and methods in a single unit known as Class
// Good Encapsulation
// Encapsulation + Data Hiding
// variables must be private and methods should be public

// Getter and Setter

// POJO - Plain Old Java Object

// S.O.L.I.D
// S - SRP - Single Responsibility Principle

public class Employee {
    private int empId;
    String empName;
    private String empDept;
    private double empBasicSal;
    private String companyName;

    // Constructor
    // used to initialize default variables
    // it's a default constructor
    // name of constructor is same as class name
    public Employee() {
        companyName = "Infy";
    }

    // parameterized constructor
    public Employee(int empId, String empName, String empDept, double empBasicSal) {
        this(); // will call default constructor - constructor chaining
        this.empId = empId;
        this.empName = empName;
        this.empDept = empDept;
        this.empBasicSal = empBasicSal;
    }

    
    /**
     * @return int return the empId
     */
    public int getEmpId() {
        return empId;
    }

    /**
     * @param empId the empId to set
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    /**
     * @return String return the empDept
     */
    public String getEmpDept() {
        return empDept;
    }

    /**
     * @param empDept the empDept to set
     */
    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    /**
     * @return double return the empBasicSal
     */
    public double getEmpBasicSal() {
        return empBasicSal;
    }

    /**
     * @param empBasicSal the empBasicSal to set
     */
    public void setEmpBasicSal(double empBasicSal) {
        this.empBasicSal = empBasicSal;
    }

    /**
     * @return String return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return empName + "\n" + empDept + "\n" + empBasicSal;
    }

}
