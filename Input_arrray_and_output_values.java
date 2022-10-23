import java.util.Scanner;
class hello{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size");
        int num=s.nextInt();
        System.out.println("Now input your desired values");
        int number_size []=new int[num];
        for (int i=0; num>i;i++){
            number_size[i]=s.nextInt();
        }

        System.out.println("which value you want to search in the array:");
        int user=s.nextInt();
        for (int j=0; j<num;j++){
            System.out.println(number_size[j]+",");
            if (number_size[j]==user){
                System.out.println("Value found at "+j+ " index");
            }
        }
    }
}
