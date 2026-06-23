import java.util.*;

public class Program2_TriangleArea {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = in.nextDouble();

        System.out.print("Enter the height: ");
        double height = in.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("Area = " + area);

        in.close();
    }
}