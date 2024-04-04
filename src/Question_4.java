import java.util.InputMismatchException;
import java.util.Scanner ;

//Write a Java program to convert Decimal to binary using recursion

public class Question_4 {

    static Scanner input = new Scanner(System.in) ;
    public static void main(String[] args) {

        int value = Get_input() ;
        Deci_to_Binary( value ) ;

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
    static int Deci_to_Binary( int D_number) {

        if (D_number==1) {
            System.out.print(1);
            return 1;
        } else {
            int remainder = D_number % 2 ;
            System.out.print(remainder);
            return Deci_to_Binary(D_number/2) ;
        }
        

    }
}