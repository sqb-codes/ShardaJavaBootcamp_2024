package OOPS;

class Loan {
    void emi() {
        System.out.println("EMI of Loan...");
    }
    void roi() {
        System.out.println("ROI is 6.5%");
    }

    void tenure() {
        System.out.println("Tenure is 16 months");
    }
}

class HomeLoan extends Loan {
    @Override
    void emi() {
        System.out.println("EMI of HomeLoan...");
    }
    @Override
    void roi() {
        System.out.println("ROI is 10.05%");
    }
    void salaryVerify() {

    }
}

class EduLoan extends Loan {
    @Override
    void emi() {
        System.out.println("EMI of EduLoan...");
    }
    @Override
    void tenure() {
        System.out.println("Tenure is 24 months");
    }
    void marksVerify() {

    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        HomeLoan homeLoan = new HomeLoan();
        homeLoan.emi();
        homeLoan.roi();
        homeLoan.tenure();
        homeLoan.salaryVerify();

        EduLoan eduLoan = new EduLoan();
        eduLoan.emi();
        eduLoan.roi();
        eduLoan.tenure();
        eduLoan.marksVerify();
    }
}
