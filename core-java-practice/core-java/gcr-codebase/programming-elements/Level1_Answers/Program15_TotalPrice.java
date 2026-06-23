package Level1_Answers;

import java.util.*;

class TotalPrice {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double unit = in.nextDouble();
        int q = in.nextInt();

        System.out.println("The total purchase price is INR " + (unit * q)
                + " if the quantity " + q
                + " and unit price is INR " + unit);

        in.close();
    }
}