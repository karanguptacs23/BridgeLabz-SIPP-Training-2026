package Level2_Answers;
import java.util.*;

public class Program3_SquareSide {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the perimeter: ");
        double p = in.nextDouble();

        double side = p / 4;

        System.out.println("The length of the side is " + side);
        System.out.println("The perimeter is " + p);

        in.close();
    }
}