// PERFECT NUMBER IS SUCH A NUMBER IF WE TAKE ALL THE PERFECT REMINDER OF THAT NUMBER AND SUM THEM IT WILL EQUAL TO THAT NUMBER

//E.G:6 IS PERFECT SQUARE
// 6                =   1   +   2   +   3


import java.util.Scanner;
class Scratch {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Testing if a number is perfect number:");
        System.out.println("Enter the number ");
        int num=s.nextInt();
        int sum=0;
        for (int i=1;i<num;i++){
            if (num%i==0){
                sum=sum+i;
            }
        }
        if (sum==num){
            System.out.println("The number "+num+" is a perfect number");
        }
        else {
            System.out.println("The number is not a perfect number "+num);
        }

    }
}


