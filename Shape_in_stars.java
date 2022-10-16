import java.util.Scanner;
import java.util.Random;
class Scratch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);    //Scanner class for taking the input
        for (int i=0; i<=5; i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // for printing in the reverse order
        for(int w=0;w<5; w++){
            for (int k=5;k>w;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
