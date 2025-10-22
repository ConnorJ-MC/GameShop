package nclan.McCaig.GameShop;

/**
 * @author 30202291
 */
public class Game {

    public Game(String name, String console, int releaseYear, int quantity, double price) {
        this.name = name;
        this.console = console;
        this.releaseYear = releaseYear;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = Math.min(quantity, 10);
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name +
                ", " + console +
                ", " + releaseYear +
                ", " + quantity + " copies" +
                ", £" + price;
    }

    private String name;
    private String console;
    private int releaseYear;
    private int quantity;
    private double price;
}
