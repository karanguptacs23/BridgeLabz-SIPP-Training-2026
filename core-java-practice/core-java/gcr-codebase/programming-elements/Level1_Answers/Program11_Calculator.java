package Level1_Answers;

import java.util.*;

class Calculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1 = in.nextDouble();
        double n2 = in.nextDouble();

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + n1 + " and " + n2 + " is "
                + (n1 + n2) + ", "
                + (n1 - n2) + ", "
                + (n1 * n2) + ", and "
                + (n1 / n2));

        in.close();
    }
}