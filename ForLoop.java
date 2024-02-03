import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        boolean prime = true;
        int count = 0;
        // for(int i = 2; i < num; i++) {
        //     count++;
        //     if(num % i == 0) {
        //         prime = false;
        //         break;
        //     }
        // }

        // Solution - 2
        // for(int i = 2; i < num/2; i++) {
        //     count++;
        //     if(num % i == 0) {
        //         prime = false;
        //         break;
        //     }
        // }

        // Solution - 3
        // for(int i = 2; i * i < num; i++) {
        //     count++;
        //     if(num % i == 0) {
        //         prime = false;
        //         break;
        //     }
        // }


        if(num % 2 == 0 || num % 3 == 0) {
            prime = false;
        }

        for(int i = 5; i * i < num; i+=6) {
            count++;
            if(num % i == 0 || num % (i + 2) == 0) {
                prime = false;
                break;
            }
        }

        

        if(prime) {
            System.out.println("Number is prime");
        }
        else {
            System.out.println("Number is not prime");
        }

        System.out.println("Took : " + count + " iterations");

        scanner.close();
    }
}
