public class WhileLoop {
    public static void main(String[] args) {
        int num = 324231;
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        System.out.println("Count is : " + count);
    }
}
