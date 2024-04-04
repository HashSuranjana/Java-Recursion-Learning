//Write a program to calculate factorial using recursion in Java
import java.util.* ;
public class Question_1 {

    static Scanner input = new Scanner ( System.in) ;
    public static void main(String[] args) {

        while (true) {
            int number = Get_input() ;
            System.out.println("Factorial of " + number + " is " + Factorial(number) );

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

    static int Factorial (int n) {
        if (n==1) {
            return 1 ;
        } else {
            return n*Factorial(n-1) ;
        }
    }
}
