#Write a program to find the weighted average of four test scores. The four test scores and their respective weights are given in the following format:
# testScore1 weightTestScore1 

import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int count=1;
        double sum=0;
        for (int i=1;i<=1;i++) {
            System.out.println("Enter the test score and then its weightage of Quiz "+count);
            double Score=s.nextDouble();
            double Weightage=s.nextDouble();
            double result=(Score*Weightage);
            sum=sum+result;
            count++;
        }
        System.out.println("The value is "+(sum));
    }
}
