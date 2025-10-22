import nclan.McCaig.GameShop.Customer;
import nclan.McCaig.GameShop.Game;
import nclan.McCaig.GameShop.Inventory;
import nclan.McCaig.GameShop.Transaction;

public class GameShop {
    public static void main(String[] args) {
        GameShop myApp = new GameShop();

        myApp.testShop();
    }

    public void testShop() {
        System.out.println();

        Customer c1 = new Customer("manager", "admin office", false);
        Customer c2 = new Customer("jamie", "3d street", false);
        Customer c3 = new Customer("rohn", "12 oak road", false);

        Inventory in = new Inventory();
        Transaction ts = new Transaction();

        Game zelda = new Game("Zelda", "NES", 1987, 11, 20.00);
        in.addStock(zelda);
        Game marioKart = new Game("Mario Kart", "SNES", 1992, 3, 30.00);
        in.addStock(marioKart);
        Game sonic = new Game("Sonic", "Mega Drive", 1991, 0, 10.00);
        in.addStock(sonic);
        Game sf2 = new Game("Street Fighter II", "SNES", 1992, 0, 12.00);
        in.addStock(sf2);
        Game banjoKazoo = new Game("Banjo-Kazooie", "N64", 1998, 1, 20.50);
        in.addStock(banjoKazoo);

        in.printInventory();
        System.out.println();

        String transact;

        ts.transactionMade(sonic, c2, transact = "trade");

        ts.transactionMade(sf2, c3, transact = "trade");

        ts.transactionMade(zelda, c2, transact = "buy");

        ts.transactionMade(marioKart, c3, transact = "buy");

        ts.transactionMade(banjoKazoo, c1, transact = "buy");

        ts.printTransactions();
        System.out.println();

        in.printInventory();
    }
}