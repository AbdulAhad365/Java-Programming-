import java.util.Scanner;
import java.util.Scanner;
class Declare_Empty_Array {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Here hey the program to store the product name with its price and name:");
        System.out.println("Enter the number of product delivered:");
        int num=s.nextInt();
        String [] prod=new String[num];
        int [] price=new int[num];
        for (int i=0; num>i;i++) {
            System.out.println("Enter the name of the product");
            prod[i] = s.next();
            System.out.print("Enter the price of the product\nRs. ");
            price[i]=s.nextInt();
        }

        for (int j=0;j<num;j++){
            System.out.println("\""+prod[j]+"\" has price of '"+price[j]+"'");
        }
        }
    }
