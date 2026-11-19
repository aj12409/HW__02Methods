import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        boolean hasMoreItems = false;

        do
        {
            double itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 99.99);
            totalCost += itemPrice;
            hasMoreItems = SafeInput.getYNConfirm(in, "Do you have more items to scan?");
        } while (hasMoreItems);

        System.out.printf("\nTotal cost of your items: $%.2f\n", totalCost);
    }
}
