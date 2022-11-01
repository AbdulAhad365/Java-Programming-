import java.util.Scanner;
class App {

    public static void main(String[] strings) {
        int num=1;
        int iteration=6;

        for (int i=1;i<=iteration;i++){
            for (int space=1;space<=i;space++){
                System.out.print(" ");
            }
            while (num!=iteration){
                System.out.print(num+" ");
                num++;
            }
            num=i+1;
            System.out.println();
        }
        // For printing its reverse
        int num2=1;
        int max=5;

        // for spacing
        for (int j=4;j>=num2;j--) {
            int con=j;
            for (int i = 0; i <= j; i++) {
                System.out.print(" ");
            }
            for (con=j;con<=max;con++) {
                System.out.print(con + " ");
            }
            System.out.println();
        }}
}
