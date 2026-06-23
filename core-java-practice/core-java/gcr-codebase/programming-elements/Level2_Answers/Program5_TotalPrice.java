package Level2_Answers;
import java.util.*;

public class Program5_TotalPrice {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double unitPrice = in.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = in.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice);
        System.out.println("Quantity = " + quantity);
        System.out.println("Unit Price = INR " + unitPrice);

        in.close();
    }
}