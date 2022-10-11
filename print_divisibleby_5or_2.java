import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        System.out.println("Program to print reverse of 3 digit");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number you want to check weather the number is divisble by 2 or 5");
        int n=s.nextInt();
        // To print number either divisible by 2 and 5
        for (int i=0; i<=n; i++){
            if ((i%2==0)||(i%5==0)){
                System.out.println(i);
            }
            else {
                continue;
            }
        }
        }
    }
