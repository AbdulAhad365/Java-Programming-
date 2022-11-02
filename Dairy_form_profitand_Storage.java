//5.A milk carton can hold 3.78 liters of milk. Each morning, a dairy farm ships cartons of milk to a local grocery store. The cost of producing one liter of milk is $0.38, and the profit of each carton of milk is $0.27. Write a program that does the following:
    //a. Prompts the user to enter the total amount of milk produced in the morning
    //b. Outputs the number of milk cartons needed to hold milk (Round your answer to the nearest integer.)
    //c. Outputs the cost of producing milk
    //d. Outputs the profit for producing milk
import java.util.Scanner;
class Scratch {
    public static double capacity=3.78,one_litre=0.38;
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        double profit=0.27;
        System.out.println("How much milk is produced in the Morning in litres");
        double moring_milk=s.nextDouble();
        double cartoons_for_hold=(moring_milk/capacity);
        System.out.println("So the cartoons required to hold the milk are "+Math.round(cartoons_for_hold));
        double cost_milk=(moring_milk)*(one_litre);
        System.out.println("Since the cost of the milk produced is "+cost_milk);
        System.out.print("The profit earned is ");
        double profit_earned=(profit*cartoons_for_hold);
        System.out.print(profit_earned+"$");

    }
}
