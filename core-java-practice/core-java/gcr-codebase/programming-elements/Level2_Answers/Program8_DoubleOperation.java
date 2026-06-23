package Level2_Answers;
import java.util.*;

public class Program8_DoubleOperation {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = in.nextDouble();

        System.out.print("Enter second number: ");
        double b = in.nextDouble();

        System.out.print("Enter third number: ");
        double c = in.nextDouble();

        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        in.close();
    }
}