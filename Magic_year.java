import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Program to print the magic year ");

        System.out.print("Enter the date ");
        int date=s.nextInt();

        System.out.print("Enter the month ");
        int month=s.nextInt();

        System.out.print("Enter the last two digits of the year \ne.g:19XX  XX is example ");
        int year=s.nextInt();

        if ((date*month)==year){
            System.out.println("The year "+year+" is a magic year");
        }
        else {
            System.out.println("The year "+year+" is not a magic year");
        }

    }
}
