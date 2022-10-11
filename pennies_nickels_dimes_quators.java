import java.util.Scanner;
class Labtask9{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double pennies, nickels, dimes, quarters;
        double total;
        // There are different waitages of the nickels,dimes,quators,pennies.
        System.out.println("Enter the pennies, nickels, dimes, quarters: ");
        pennies = input.nextDouble();
        nickels = input.nextDouble();
        dimes = input.nextDouble();
        quarters = input.nextDouble();
        //pennies=0.01$
        //nickels=0.05$
        //dimes=0.10$
        //quators=0.35$
        total = ((pennies*0.01)+(nickels*0.05)+(dimes*0.10)+(quarters*0.25));
        if (total==1)
            System.out.println("Congratulations for winning the game.");
        else if (total>1)
            System.out.println("Amount was more than a dollar.");

        else
            System.out.println("Amount was less than a dollar.");
    }
}
