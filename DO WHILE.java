import java.util.Scanner;

class Name_by_String {
// Program TO PRINT NUMBERS 1 TO 1000
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     //while is a loop
             // there are three kinds of loop:
            /**
             * 1)   FOR LOOP
             * 2)    WHILE LOOP
             * 3)     DO WHILE LOOP
             * */
        System.out.println("Enter the inital value");
        int initial=sc.nextInt();   //TAKE THE INITAL VALUE

        System.out.println("Enter the final value");
        int result=sc.nextInt();   // TAKE THE FINAL VALUE

        do {   // IN DO WHILE LOOP FIRST ENTERS THE LOOP WHEN CHECK THE WHILE CONDITION
            System.out.println(initial);
            initial++;  // WILL INCREMENT THE CONDITION SO THAT THE DESIRED NUMBER FULFILLS THE CONDITION AND DONOT REPEATS

        }while (initial<=result);


    }
}
