package nclan.McCaig.GameShop;

public class Transaction {

    private String transactionType;
    private String transactionDate;
    private String customerName;
    private String gameTitle;

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

    @Override
    public String toString() {
        return transactionType +
                ", " + transactionDate +
                ", " + customerName +
                ", " + gameTitle;
    }

}
