

import java.util.Scanner;
import java.util.Calendar;

class Scratch {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        long cnic=(int)((Math.random()*999999999)+000000000);
        System.out.println("Program for the verification of the person identity:" +cnic);

        System.out.println("Enter your CNIC number:");
        long cnic_store=s.nextLong();
        if (cnic==cnic_store){
            String [] names={"khalid","ahmad","ali","hashim","rida","saira"};
            int lengh_array= names.length;
            System.out.println(lengh_array);
            int orignal_num=lengh_array-1;
            int rand_for_name=(int)((Math.random()*orignal_num)+0);
            String store_name=names[rand_for_name];
            System.out.println("Welcome "+store_name+ " ");
            int rand_password=(int)((Math.random()*9999)+0000);
            System.out.println(rand_password);
            System.out.println("Enter the desired password 4 digits");
            int user_password=s.nextInt();

            if (rand_password==user_password){
                int rand_money=(int) ((Math.random()*10000000)+0);
                System.out.println(rand_money);
                System.out.println("Welcome to the account how many money you want to transfer:");
                int money=s.nextInt();

                if (rand_money>=money){
                    System.out.println("Rs."+money+" have been trasfered succesfully");

                }
                else {
                    System.out.println("Your balance is insufficent");
                }
            }

        }
    }
        }


