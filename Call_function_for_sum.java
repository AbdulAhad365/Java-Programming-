import java.util.Scanner;
class Scratch {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int b = 99;
        int a=7;
        int call = sum(a, b);
        System.out.println(call);
    }

    public static int sum(int a,int b) {
        int result=0;
        int hi=9;
        for(int i=a;i<=b;i++){
            result=result+i;

        }
        return result;
    }

}
