import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int it=s.nextInt();
        int h=1;

        for(int i=1;i<=it;i++){
            for(int j=3;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*(i-1)+1);k++){
                System.out.print(h);
                h++;
            }
            System.out.println();
        }
    }
}
