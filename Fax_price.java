import java.util.Scanner;
class Scratch {
    public static double price;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name user:");
        String name=s.next();
        System.out.print("Enter the number of pages for the international fax:");
        int pages=s.nextInt();
        if ((pages>=0) &&(pages<=10)){
             price=3+(pages*.20);
        } else if (pages>10) {
            int pages_extra=(Math.abs(pages-10));
            System.out.println(pages_extra);
            pages=10;
            price=3+(pages*0.20)+(pages_extra*0.10);

        }
        System.out.println("Since the price is "+price+"$");
        
    }
}
