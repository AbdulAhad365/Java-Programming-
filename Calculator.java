import java.util.Random;
import java.util.Scanner;
class Quiz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int num1 = (int) ((Math.random() * 10) + 0);
        int num2 = (int) ((Math.random() * 10) + 0);
        System.out.println("Enter the operation (+,-,*,/)\n\twhich you want to perform");
        String operation = s.next();
        System.out.println(num1 + " " + operation + " " + num2 + " =");
        int user = s.nextInt();
        int comp;
        // Addition for the two numbers:
        if (operation.equals("+")) {
            comp = (num1) + (num2);
            if (user == comp) {
                System.out.println("You win");
            } else {
                System.out.println("You loose");
            }

        }
        // Subtraction for the two numbers:
        else if (operation.equals("-")) {
            comp = (num1) - (num2);
            if (user == comp) {
                System.out.println("You win");
            } else {
                System.out.println("You loose");
            }
        }
        // multiply two numbers:
        else if (operation.equals("*")) {
            comp = (num1) * (num2);
            if (user == comp) {
                System.out.println("You win");
            } else {
                System.out.println("You loose");
            }
        }
        // Divide two numbers
        else if (operation.equals("/")) {
            comp = (num1) / (num2);
            if (user == comp) {
                System.out.println("You win");
                
            }
            else if(num2==0) {
                System.out.println("Infinity");
            }
            else {
                System.out.println("You loose");
            }
        }

    }
}
