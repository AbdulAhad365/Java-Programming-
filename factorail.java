import java.util.Scanner;
class Scratch {
    static int factorail(int n){
        if(n==1){
            return 1;
        }
        else {
            return n*factorail(n-1);
        }
    }
    static int factorail_loop(int n){
        if(n==1){
            return 1;
        }
        else {
            int val=1;
            for (int i=1;i<=n;i++){
                val=val*i;
            }
            return val;
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("The factorial of the number simple return is "+factorail(n));
        System.out.println("The factorial of the number by using the loop is  "+factorail_loop(n));
    }
}
