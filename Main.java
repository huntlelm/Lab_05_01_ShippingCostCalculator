import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Variables
        double itemPrice = 0.0;
        double shippingCost;
        double totalPrice = 0.0;
        double SHIPPING_RATE = 0.02;

        // Ask for initial price of the item
        System.out.print("Enter the price of the item: $");
        itemPrice = in.nextDouble();

        // Calculate Shipping Cost
        if (itemPrice >= 100.0) {
            shippingCost = 0.0;
        } else {
            shippingCost = itemPrice * SHIPPING_RATE;
        }
        // Calculate Total Cost
        totalPrice = itemPrice + shippingCost;

        // Output Results
        System.out.println("Shipping cost: $" + shippingCost);
        System.out.println("Total price: $" + totalPrice);
    }
}