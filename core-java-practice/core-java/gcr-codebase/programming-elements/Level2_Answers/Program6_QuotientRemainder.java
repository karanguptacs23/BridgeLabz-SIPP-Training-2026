package Level2_Answers;
import java.util.*;

public class Program6_QuotientRemainder {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = in.nextInt();

        System.out.print("Enter the second number: ");
        int b = in.nextInt();

        int quotient = a / b;
        int remainder = a % b;

        System.out.println("The Quotient is " + quotient);
        System.out.println("The Remainder is " + remainder);
        System.out.println("The two numbers are " + a + " and " + b);

        in.close();
    }
}