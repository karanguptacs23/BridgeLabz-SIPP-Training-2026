package Level1_Answers;

import java.util.*;

class FeetToYardsMiles {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double feet = in.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("Distance in yards is " + yards
                + " and miles is " + miles);

        in.close();
    }
}