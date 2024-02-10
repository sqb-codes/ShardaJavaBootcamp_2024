public class LabeledForLoop {
    public static void main(String[] args) {
        outer:
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.println(i + "," + j);
                if(i == 2 && j == 2) {
                    break outer;
                }
            }
        }
    }
}
