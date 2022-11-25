import java.util.Scanner;
import java.util.*;
class Declare_Empty_Array {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int x = 0;
        int w = 2;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int sp = 3; sp > x; sp--) {
                System.out.print(" ");
            }
            x++;
            System.out.print("*");
            for (int k = 0; k <= w; k++) {
                System.out.print(" ");
            }
            System.out.print("*");
            w--;

            System.out.println();


        }
        System.out.println("*********");
        for (int k = 1; k <= 4; k++) {
            for(int sp=3;sp>=k;sp--){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int i = 1; i <k; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int a=1;a<k;a++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();


        }
    }
}
