import java.util.Scanner;
class Scratch {

    public static void main(String[] args) {
        int si = 3;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rows");
        int row = s.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = row; j > i; j--) {
                System.out.print("*");
            }
            //for spaces

            for (int sp = 0; sp != i; sp++) {
                System.out.print("  ");
            }
            for (int j = row; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
