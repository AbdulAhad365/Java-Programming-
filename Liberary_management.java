import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        System.out.println("Program for the Liberay management");
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of books purchased ");
        int books=s.nextInt();
        if (books==0){
            System.out.println("The point you earned is 0");
        }
        else if (books==1){
            System.out.println("The point you earned is 5");
        }
        else if (books==2){
            System.out.println("The point you earned is 15");
        }
        else if (books==3){
            System.out.println("The point you earned is 30");
        }
        else if (books>=4){
            System.out.println("The point you earned is 60");
        }
        else {
            System.out.println("Entered value is invalid ");
        }

    }
}
