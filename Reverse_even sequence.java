import java.util.Scanner;
class Scratch {
    static int fact;
    // program 20
    public static void main(String[] args) {
        System.out.println("Enter a number for reverse sequence of even numbers: ");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number for sequence");
        int a=s.nextInt();
        // Print a sequence in reverse order for the numbers numbers divisble by 2(even numberx
        int i=0;
        while (a>=i){
            if (a%2==0){
                System.out.print(a+",");
            }
            a=a-1;
        }


    }
}
