//Write a program to Print Fibonacci Series in Java using Recursion
import java.util.Scanner ;
import java.util.InputMismatchException;

public class Question_2 {

    static Scanner input = new Scanner ( System.in) ;
    public static void main(String[] args) {

        while (true) {
            int number = Get_input() ;
            System.out.println("Fibonacci value of " + number + " is " + Fibonacci(number));

            System.out.print("Do you want to continue : " ) ;
            String desire = input.next() ;
            if ( desire.equalsIgnoreCase("n")) {
                System.out.println("\nThanks for using.");
                break;
            }
        }

    }
    static int Get_input() {

        int entry = 0 ;
        boolean validate = false ;

        do {
            try {
                System.out.print("Enter the number : ");
                entry =input.nextInt() ;
                validate = true ;
            } catch (InputMismatchException e1) {
                System.out.println("Please enter a number!") ;
                input.next() ;
            }

        }while (!validate) ;
        return entry ;
    }

    static int Fibonacci (int n) {
        if (n==0) {
            return 0 ;
        } else if (n==1 || n==2) {
            return 1;
        } else {
            return Fibonacci(n-1) + Fibonacci(n-2) ;
        }
    }


}
