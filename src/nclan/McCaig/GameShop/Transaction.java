package nclan.McCaig.GameShop;

import java.util.ArrayList;

public class Transaction {

    private String transactionType;
    private String transactionDate;
    private String customerName;
    private String gameTitle;
    private Transaction[] transDoc = new Transaction[5];
    private int i = 0;

    public Transaction(String transactionType,
                       String transactionDate,
                       String customerName,
                       String gameTitle)
    {
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.customerName = customerName;
        this.gameTitle = gameTitle;
    }

    public Transaction() {
    }

    @Override
    public String toString() {
        return transactionType +
                ", " + transactionDate +
                ", " + customerName +
                ", " + gameTitle;
    }

    public void printTransactions() {
        for (Transaction t : transDoc) {
            System.out.println(t);
        }
    }

    public void transactionMade(Game g, Customer c, String s) {
        if (s.equals("trade")) {
            g.setQuantity(g.getQuantity() + 1);
            c.setDiscountEligible(true);
            transDoc[i++] = new Transaction("Trade-In", "06/10/25", c.getName(), g.getName());
        } else if (s.equals("buy")) {
            double gPrice = c.isDiscountEligible() ? g.getPrice() * 0.90 : g.getPrice();
            g.setQuantity(g.getQuantity() - 1);
            c.setDiscountEligible(false);
            transDoc[i++] = new Transaction("purchase", "06/10/25", c.getName(), g.getName());
        }
    }
}
