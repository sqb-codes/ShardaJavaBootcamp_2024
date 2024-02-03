import java.io.IOException;
import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) throws IOException {
        // int x = System.in.read();
        // System.out.println(x);

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your ID : ");
        int id = scanner.nextInt();

        scanner.nextLine(); // this will remove \n from buffer

        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        // nextLine - reads input till \n

        System.out.println("Enter your city : ");
        String city = scanner.nextLine();

        System.out.println("Enter your age : ");
        byte age = scanner.nextByte();
        
        System.out.println("Enter your marks : ");
        double marks = scanner.nextDouble();

        System.out.println("ID is : " + id);
        System.out.println("Hello : " + name);
        System.out.println("City is : " + city);
        System.out.println("Age is : " + age);
        System.out.println("Marks : " + marks);
        
        scanner.close();
        
    }
}
