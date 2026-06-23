package Level1_Answers;

import java.util.*;

class DiscountInput {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double fee = in.nextDouble();
        double p = in.nextDouble();

        double d = fee * p / 100;

        System.out.println("The discount amount is INR " + d
                + " and final discounted fee is INR " + (fee - d));

        in.close();
    }
}