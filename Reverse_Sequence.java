import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        // For making a sequece for the odd number
        // Taking input from the user so that will we know uptill how much we have to print the numbers
        System.out.println("Enter a number for starting numbers");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int i;
        while (num>0){
            System.out.print(num+",");
            num-=1;
        }
    }
}
