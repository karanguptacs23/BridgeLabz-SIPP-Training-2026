package Level1_Answers;

import java.util.*;

class Handshakes {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println("The number of possible handshakes is "
                + (n * (n - 1) / 2));

        in.close();
    }
}
