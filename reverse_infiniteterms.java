import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        System.out.println("Program to print reverse of 3 digit");
        Scanner s=new Scanner(System.in);

        int number=s.nextInt();  //Take a number
        while (number>0){    // For reversing a random numbers in the range of the integer
            int reverse=number%10;  // First of all take the reminder of the number and output the number
            System.out.print(reverse);    // then divide the number by 10 so that u elimite the external value
            number=(number/10);

        }
    }
}
