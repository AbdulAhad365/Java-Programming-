import java.util.Scanner;
class App {

    public static void main(String[] strings) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of iteration:");
        int it=s.nextInt();

        for(int i=0;i<=it;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k=it;(k-2)-i>=0;k--){
                if (k<0){
                    break;
                }
                System.out.print(" ");}

            System.out.println("*");
            System.out.println();
        }

    }
}
