
import java.util.Scanner;
class App {
    
    public static void main(String[] strings)  {
        int x=1;
        Scanner s=new Scanner(System.in);
        System.out.println("enter a character uptill you want to print");
        char c=s.nextLine().charAt(0);
        for (char a='A';a<=c;a++){
            for (char b='A';b<=a;b++){
                System.out.print(b+" ");
            }
            System.out.println();
        }
        }
    }

