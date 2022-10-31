import java.util.Scanner;
import java.util.Scanner;
class Declare_Empty_Array {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of people:");
        int people=s.nextInt();
        System.out.println("User enter your commits");
        System.out.println("1)*\n2)**\n3)***\n4)****\n5)*****");
        String star[]={"*","**","***","****","*****"};
        int store_data[]={1,2,3,4,5};
        int sum=0;
        int st []=new int[people];
        int j,c=0;
        for (int i=0;i<people;i++){
            System.out.println("Enter the rating user "+(i+1));
            int user=s.nextInt();
            st[i]=user;
            for (j=0;j<=i;j++){
                int a=st[j];
                c=(int)(a/people);
            }
            j++;
            sum=sum+c;
        }
        System.out.println("You average rate " +sum);
        System.out.println();
        System.out.println("\t"+star[sum-1]);
    }
}
