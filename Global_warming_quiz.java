import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Global warming is:");
        System.out.print("1)toxic\n2)harmful\n3)not good\n4)danger");
        int ans_1=2;
        System.out.println("\nYour answer is:");
        int ans1_get=s.nextInt();

        System.out.print("Global warming is:");
        System.out.print("1)toxic\n2)not good\n3)harmful\n4)danger");
        int ans_2=3;
        System.out.println("\nYour answer is:");
        int ans2_get=s.nextInt();
        int sum=0;
        if(ans_1==ans1_get){
            sum++;

        }
        if(ans_2==ans2_get){
            sum++;
        }
        if(sum==2){
            System.out.println("Excellent");
        }
        if(sum==1){
            System.out.print("Good");
        }
        if(sum==0){
            System.out.println("Improve your knowledge");
        }

    }
}
