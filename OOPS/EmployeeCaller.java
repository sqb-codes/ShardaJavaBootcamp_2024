package OOPS;

public class EmployeeCaller {
    public static void main(String[] args) {
        // It will call default constructor
        // Employee emp = new Employee();
        // emp.show();

        // It will call parameterized constructor
        Employee emp_1 = new Employee(101, "Ram", "IT", 50000.00);
        // emp_1.show();

        // emp_1.empBasicSal = 10000;
        // emp_1.empName
        // System.out.println(emp_1.getempBasicSal());

        emp_1.setEmpBasicSal(emp_1.getEmpBasicSal() + 10000);
        System.out.println(emp_1.getEmpBasicSal());

        // it will call toString method
        System.out.println(emp_1);
        // System.out.println(emp_1.toString());

    }
}
