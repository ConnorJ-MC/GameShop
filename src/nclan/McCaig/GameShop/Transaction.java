package nclan.McCaig.GameShop;

/**
 * @author 30202291
 */
public class Transaction {

    private String transactionType;
    private String transactionDate;
    private String customerName;
    private String gameTitle;
    private String gamePrice;
    private Transaction[] transDoc = new Transaction[5]; // ← will have to change this if adding new game for now :(
    private int i = 0;

    public Transaction(String transactionType,
                       String transactionDate,
                       String customerName,
                       String gameTitle,
                       String gamePrice) {
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.customerName = customerName;
        this.gameTitle = gameTitle;
        this.gamePrice = gamePrice;
    }

    public Transaction() {
    }

    @Override
    public String toString() {
        return transactionType +
                ", " + transactionDate +
                ", " + customerName +
                ", " + gameTitle+
                ", " + gamePrice;
    }

    /**
     * prints out the transaction history
     */
    public void printTransactions() {
        for (Transaction t : transDoc) {
            System.out.println(t);
        }
    }

    /**
     * this sets up the transactions, and adds to the transaction history
     *
     * @param g the game
     * @param c the customer
     * @param s the type of transaction
     */
    public void transactionMade(Game g, Customer c, String s) {
        if (s.equals("trade")) {
            g.setQuantity(g.getQuantity() + 1);
            c.setDiscountEligible(true);
            transDoc[i++] = new Transaction("Trade-In", "06/10/25", c.getName(), g.getName(), "£" + g.getPrice());
        } else if (s.equals("buy")) {
            double gPrice = c.isDiscountEligible() ? g.getPrice() * 0.90 : g.getPrice();
            // ↑ basically an "if else." if a customer is eligible, then gPrice = discounted price, else gPrice = regular price
            g.setQuantity(g.getQuantity() - 1);
            c.setDiscountEligible(false);
            transDoc[i++] = new Transaction("purchase", "06/10/25", c.getName(), g.getName(), "£" + gPrice);
        }
    }
}
