package nclan.McCaig.GameShop;

public class Game {

    public Game(String name, String console, int releaseYear, int quantity, double price) {
        this.name = name;
        this.console = console;
        this.releaseYear = releaseYear;
        this.quantity = quantity;
        this.price = price;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", console='" + console + '\'' +
                ", releaseYear=" + releaseYear +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    private String name;
    private String console;
    private int releaseYear;
    private int quantity;
    private double price;
}
