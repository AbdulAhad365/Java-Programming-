import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        System.out.println("Program to print reverse of 3 digit");
        Scanner s=new Scanner(System.in);
        
        int number=s.nextInt();  //Take a number
        int a=number%10;   //(Reminder by 10) of number gives its last term   43%10=3
        
        number/=10;  //(now int) and divide now that 1 last term can be eliminated
        int b=number%10;
        number/=10;  // Last term directly gives its last value no need to take the reminder
        int c=number;
        System.out.println(a+""+b+""+c);  // Connect these value by reverse in the opposite sequence
    }
}
