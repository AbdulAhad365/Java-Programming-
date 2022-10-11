import java.util.Scanner;
class Scratch {
    static int sum;
    public static void main(String[] args) {
        System.out.println("Multiplactions of table");
        System.out.println("Enter the number whose table is to calculate");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for (int i = 10; i>=0; i--) {
            System.out.printf("%d X %d = %d",num,i,(i*num));
            System.out.println("\n");

        }
        System.out.println("This is the reverse order of table");
    }
}
