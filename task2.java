import java.util.Scanner;

public class StockTradingPlatform {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] stocks = {"TCS", "Infosys", "Reliance"};
        double[] prices = {3500, 1500, 2800};
        int[] owned = {0, 0, 0};

        double balance = 100000;

        int choice;

        do {
            System.out.println("\n===== STOCK TRADING PLATFORM =====");
            System.out.println("Balance: ₹" + balance);
            System.out.println("1. View Stocks");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Stocks:");
                    for (int i = 0; i < stocks.length; i++) {
                        System.out.println((i + 1) + ". " + stocks[i] + " - ₹" + prices[i]);
                    }
                    break;

                case 2:
                    System.out.print("Enter Stock Number: ");
                    int buy = sc.nextInt() - 1;

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    double cost = prices[buy] * qty;

                    if (cost <= balance) {
                        balance -= cost;
                        owned[buy] += qty;
                        System.out.println("Stock Purchased Successfully!");
                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Stock Number: ");
                    int sell = sc.nextInt() - 1;

                    System.out.print("Enter Quantity: ");
                    int sellQty = sc.nextInt();

                    if (sellQty <= owned[sell]) {
                        owned[sell] -= sellQty;
                        balance += sellQty * prices[sell];
                        System.out.println("Stock Sold Successfully!");
                    } else {
                        System.out.println("Not enough stocks to sell!");
                    }
                    break;

                case 4:
                    System.out.println("\n===== PORTFOLIO =====");
                    for (int i = 0; i < stocks.length; i++) {
                        System.out.println(stocks[i] + " : " + owned[i] + " shares");
                    }
                    System.out.println("Balance: ₹" + balance);
                    break;

                case 5:
                    System.out.println("Thank you for using the Stock Trading Platform!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}