package Level2_Answers;
import java.util.*;

public class Program4_DistanceConvert {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = in.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("Distance in yards = " + yards);
        System.out.println("Distance in miles = " + miles);

        in.close();
    }
}