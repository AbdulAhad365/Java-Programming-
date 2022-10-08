# Java-Programming-
There would be certain program that would be enough to build the basic logics. Secondly, i will upload certain projects so that big programs can be runed and verified.

import java.util.Scanner;

class Name_by_String {
// Program1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);          // For making a input object
        System.out.println("Enter your name");                  //For printing a value on the Screen
        String name=sc.next();                                                     //For getting the name in String and next() is used for inputing the only one word.
        // For storing more than one line used the reserved word nextLine();
        System.out.println("Your name is "+name);   // "+" used is called conncatination used to merge stored and string values together
        //System.out.print    is used to print next line on same


    }
}
