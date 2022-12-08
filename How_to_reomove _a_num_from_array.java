import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("enter a number to dleter");
        int remove=s.nextInt();
        System.out.println("Give the size of array");
        int size=s.nextInt();
        int [] arr=new int[size];

        for (int i=0;i<size;i++){
            System.out.println("Enter a number");
            arr[i]=s.nextInt();
        }
        for (int i=0;i<size;i++){
            if(arr[i]==remove){
                for (int j=i;j<size-1;j++){
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        System.out.println("to display");
        for (int i=0;i<size-1;i++){
            System.out.println(arr[i]);
        }


    }
}
