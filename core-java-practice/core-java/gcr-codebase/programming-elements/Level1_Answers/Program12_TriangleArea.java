package Level1_Answers;

import java.util.*;

class TriangleArea {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double b = in.nextDouble();
        double h = in.nextDouble();

        System.out.println("Area of triangle is " + (0.5 * b * h));

        in.close();
    }
}