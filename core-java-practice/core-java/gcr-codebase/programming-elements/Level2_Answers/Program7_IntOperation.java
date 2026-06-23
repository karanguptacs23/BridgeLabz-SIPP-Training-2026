package Level2_Answers;
import java.util.*;

public class Program7_IntOperation {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = in.nextInt();

        System.out.print("Enter second integer: ");
        int b = in.nextInt();

        System.out.print("Enter third integer: ");
        int c = in.nextInt();

        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        System.out.println("The results of Integer Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        in.close();
    }
}