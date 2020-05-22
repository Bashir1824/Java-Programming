package Practice;

/**
 * Kathryn bought 600 shares of stock at a price of $21.77 per share.
 * She must pay her stock- broker a 2 percent commission for the transaction.
 * Write a program that calculates and displays the following:
 * • The amount paid for the stock alone (without the commission)
 * • The amount of the commission
 * • The total amount paid (for the stock plus the commission)
 */
public class StockCommision {
    public static void main(String[] args) {
        double shares = 600;
        double price = 21.77;
        double paid = shares * price;
        double commission = (paid * 2) / 100;

        System.out.println("Amount Paid: " + paid);
        System.out.println("Amount commision paid: " + commission);
        System.out.println("Total amount paid for the stock: " + (paid + commission));

    }
}
