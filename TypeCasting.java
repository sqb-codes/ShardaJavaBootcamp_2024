public class TypeCasting {
    public static void main(String[] args) {
        
        // byte x = 12;
        // int y = x;

        // int x = 12;
        // byte y = (int)x;

        String name = "10";
        // Explicit Type casting
        int x = Integer.parseInt(name);
        System.out.println(x);

        char n = 'R';
        // Implicit Type Casting
        int x1 = n;
        System.out.println(x1);
    }
}
