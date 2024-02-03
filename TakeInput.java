import java.io.IOException;
import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter your name : ");
        // int x = System.in.read();
        // System.out.println(x);

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Enter your age : ");
        byte age = scanner.nextByte();
        System.out.println("Enter your marks : ");
        double marks = scanner.nextDouble();
        System.out.println("Hello : " + name);
        System.out.println("Age is : " + age);
        System.out.println("Marks : " + marks);
        
        scanner.close();
        
    }
}
