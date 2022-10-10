import java.util.Scanner;

class Name_by_String {
// Program1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check even or odd     ");  //output statement
        int number= sc.nextInt();  // number is a variable for storing the number value
        if (number<=0){        // If statement is used for imposing a condition
            System.out.println("The number is negitive or zero  "+number);
        } else if (number%2==0) {
            System.out.println(" The number is a Even number  "+number);// % means that divisible
            // if entered number is perfectly divisible by 2 then its answer will be equal to 0 means is even
            // else is odd number
        }
        else {
            System.out.println("The number is Odd number  "+number);
        }

    }
}
