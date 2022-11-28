import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the three numbers");
        double a=s.nextInt();
        double b=s.nextInt();
        double c=s.nextInt();
        displaySortedNumbers(a,b,c);
    }
    public static void displaySortedNumbers(double num1,double num2,double num3){
        if((num1>num2)&&(num1>num3)){
            if(num2>num3){
                System.out.println(num1+">"+num2+">"+num3);
            } else if (num2<num3) {
                System.out.println(num1+">"+num3+">"+num2);
            }
        }
        // Now for next
        if((num2>num1)&&(num2>num3)){
            if(num1>num3){
                System.out.println(num2+">"+num1+">"+num3);
            } else if (num1<num3) {
                System.out.println(num2+">"+num3+">"+num1);
            }
        }
        // for the next case:
        if((num3>num1)&&(num3>num2)){
            if(num1>num2){
                System.out.println(num3+">"+num1+">"+num3);
            }
            else if (num1<num2) {
                System.out.println(num3+">"+num2+">"+num1);
            }
        }

    }

}
