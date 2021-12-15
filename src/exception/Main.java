package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] arges) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a number to divide: ");
            int X = scanner.nextInt();
            System.out.println("Enter a number to divide by: ");
            int Y = scanner.nextInt();

            int Z = X / Y;
            System.out.println("the result: " + Z);
        } 
        catch (ArithmeticException e) {
            System.out.println("You can't divide by zero IDIOT!!!!!");
        } 
        catch (InputMismatchException e) {
            System.out.println("You cant divide by this OMG!!!");
        } 
        finally {
            scanner.close();
        }
    }
}
