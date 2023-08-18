import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle 1");
        double lenght1=s.nextDouble();
        System.out.println("Enter the width of the rectangle of the rectangle 2");
        double width1=s.nextDouble();
        double area1=(lenght1*width1);
        //hello


        System.out.println("Enter the length of the rectangle 2");
        double lenght2=s.nextDouble();
        System.out.println("Enter the width of the rectangle of the rectangle 2");
        double width2=s.nextDouble();
        double area2=(lenght2*width2);
        System.out.println("The  area of the rectangle1 is "+area1);
        System.out.println("The  area of the rectangle2 is "+area2);

        if (area1==area2){
            System.out.println("The rectangles have the same area "+area1+" "+area2);
        }
        else if (area1>area2) {
            System.out.println("The area of rectangle1 is greater"+ " "+area1);
        }
        else {
            System.out.println("The area of rectangle2 is greater"+" "+area2);
        }
    }
}
