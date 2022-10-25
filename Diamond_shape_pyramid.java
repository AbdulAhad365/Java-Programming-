import java.util.Scanner;
import java.util.Scanner;
class Declare_Empty_Array {
    public static void main(String args[]) {
        int j, row;
        int row2 = 3;

        Scanner s = new Scanner(System.in);
        row = 4;
        for (int i = 1; i <= row; i++) {
            for (j = 1; j <= row - i; j++) {
                System.out.print(" ");

            }

            for (j = i; j != 0; j--) {
                System.out.print(j);
            }
            for (j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
        int spaces;
        int o = 0;
        int k = 1;
        for (int i = 3; i > 0; i--) {
            for (spaces = 1; k >= spaces; spaces++) {
                System.out.print(" ");
            }
            for (o = i; o != 0; o--) {
                System.out.print(o);
            }
            for (o = 2; o <= i; o++) {
                System.out.print(o);
            }
            System.out.println();
            k++;

        }


    }
}
