public class CommandLineArgs {
    public static void main(String[] args) {
        // args is an array
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        // System.out.println("Hello : " + args[0] + " " + args[1]);
    
        // Type casting
        // int x = Integer.parseInt(args[0]);
        // int y = Integer.parseInt(args[1]);
        // int z = x + y;
        // System.out.println("Sum is : " + z);
        
        // int arr[] = new int[size];
        
        // int n = args.length;
        int sum = 0;
        // for(int i = 0; i < n; i++) {
        //     sum += Integer.parseInt(args[i]);
        // }

        for(String i : args) {
            sum += Integer.parseInt(i);
        }

        System.out.println("Sum is : " + sum);

    }
}
