package nclan.McCaig.GameShop;

public class Inventory extends Game{

    public Inventory(String name, String console, int releaseYear, int quantity, double price) {
        super(name, console, releaseYear, quantity, price);
    }

    public void LimitStock(int quantity) {
        if (quantity < 10) {
            quantity = 10;
        }
    }


}
