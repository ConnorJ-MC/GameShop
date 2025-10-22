import nclan.McCaig.GameShop.*;

public class GameShop {
    public static void main(String[] args) {
        GameShop myApp = new GameShop();

        myApp.testShop();
    }

    public void testShop() {
        System.out.println();

        Customer c1 = new Customer("manager", "admin office", false);
        Customer c2 = new Customer("jamie", "3d street", false);
        Customer c3 = new Customer("ron", "12 oak road", false);

        Inventory in = new Inventory();
        Transaction ts = new Transaction();

        Game zelda = new Game("Zelda", "NES", 1987, 5, 20.00);
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
        System.out.println();
//
//        double priceMario = c3.isDiscountEligible() ? marioKart.getPrice() * 0.90 : marioKart.getPrice();
//        marioKart.setQuantity(marioKart.getQuantity() - 1);
//        c3.setDiscountEligible(false);
//        transactions[i++] = new Transaction("Purchase", "06/10/25", c3.getName(), marioKart.getName());
//
//        double priceBanjo = c1.isDiscountEligible() ? banjoKazoo.getPrice() * 0.90 : banjoKazoo.getPrice();
//        banjoKazoo.setQuantity(banjoKazoo.getQuantity() - 1);
//        transactions[i++] = new Transaction("Purchase", "06/10/25", c1.getName(), banjoKazoo.getName());

//        System.out.println();
//        System.out.println("transaction record:");
//        for (Transaction t : transactions) {
//            System.out.println(t);
//        }

//        System.out.println();
//        System.out.println("final inventory:");
//        for (Game g : inventory) {
//            if (!(g.getQuantity() <= 0)) {
//                System.out.println(g);
//            }
//        }

//        System.out.println();
//        System.out.println("customers:");
//        System.out.println(c1.getName() + ", " + c1.getAddress());
//        System.out.println(c2.getName() + ", " + c2.getAddress());
//        System.out.println(c3.getName() + ", " + c3.getAddress());
//        System.out.println(c1);


    }
}