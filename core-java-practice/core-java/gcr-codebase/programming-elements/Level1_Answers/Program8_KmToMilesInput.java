package Level1_Answers;

import java.util.*;

class KmToMilesInput {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double km = in.nextDouble();

        System.out.println("The total miles is " + (km / 1.6)
                + " mile for the given " + km + " km");

        in.close();
    }
}