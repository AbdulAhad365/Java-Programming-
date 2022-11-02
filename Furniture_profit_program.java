#  To make a profit, the prices of the items sold in a furniture store are marked up by 80%. After marking up the prices each item is put on sale at a discount of 10%. Write a program to find the selling price of an item sold at the furniture store. What information do you need to find the selling price?


import java.util.Scanner;

import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the price of the product");
        int num=s.nextInt();
        System.out.println("After increment the price become:");
        double inrement_price=(num*0.80);
        double sum=(int)(num+inrement_price);
        System.out.println(sum);
        System.out.print("The sale is 10% so the price becomes:");
        double sale=((sum*0.10));
        double net_price=(int)(sum-sale);
        System.out.println(net_price+" Rupees");
    }
}
