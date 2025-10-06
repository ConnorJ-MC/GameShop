import nclan.McCaig.GameShop.Customer;
import nclan.McCaig.GameShop.Game;
import nclan.McCaig.GameShop.Transaction;

public class GameShop {
    public static void main(String[] args) {
        GameShop myApp = new GameShop();

        myApp.testShop();
    }

    public void testShop() {
        Customer c1 = new Customer("manager", "admin office", false);
        Customer c2 = new Customer("jamie", "3d street", false);
        Customer c3 = new Customer("ron", "12 oak road", false);

        Game zelda = new Game("Zelda", "NES", 1987, 5, 20.00);
        Game marioKart = new Game("Mario Kart", "SNES", 1992, 3, 30.00);
        Game sonic = new Game("Sonic", "Mega Drive", 1991, 0, 10.00);
        Game sf2 = new Game("Street Fighter II", "SNES", 1992, 0, 12.00);
        Game banjoKazoo = new Game("Banjo-Kazooie", "N64", 2008, 1, 20.50);

        Game[] inventory = {zelda, marioKart, sonic, sf2, banjoKazoo};

        Transaction[] transactions = new Transaction[5];
        int i = 0;

        System.out.println();
        System.out.println("initial inventory:");
        for (Game g : inventory) {
            if (!(g.getQuantity() <= 0)) {
                System.out.println(g);
            }
        }

        sonic.setQuantity(sonic.getQuantity() + 1);
        c2.setDiscountEligible(true);
        transactions[i++] = new Transaction("Trade-In", "06/10/25", c2.getName(), sonic.getName());

        sf2.setQuantity(sf2.getQuantity() + 1);
        c3.setDiscountEligible(true);
        transactions[i++] = new Transaction("Trade-In", "06/10/25", c3.getName(), sf2.getName());

        double priceZelda = c2.isDiscountEligible() ? zelda.getPrice() * 0.90 : zelda.getPrice();
        zelda.setQuantity(zelda.getQuantity() - 1);
        c2.setDiscountEligible(false);
        transactions[i++] = new Transaction("Purchase", "06/10/25", c2.getName(), zelda.getName());

        double priceMario = c3.isDiscountEligible() ? marioKart.getPrice() * 0.90 : marioKart.getPrice();
        marioKart.setQuantity(marioKart.getQuantity() - 1);
        c3.setDiscountEligible(false);
        transactions[i++] = new Transaction("Purchase", "06/10/25", c3.getName(), marioKart.getName());

        double priceBanjo = c1.isDiscountEligible() ? banjoKazoo.getPrice() * 0.90 : banjoKazoo.getPrice();
        banjoKazoo.setQuantity(banjoKazoo.getQuantity() - 1);
        transactions[i++] = new Transaction("Purchase", "06/10/25", c1.getName(), banjoKazoo.getName());

        System.out.println();
        System.out.println("transaction record:");
        for (Transaction t : transactions) {
            System.out.println(t);
        }

        System.out.println();
        System.out.println("final inventory:");
        for (Game g : inventory) {
            if (!(g.getQuantity() <= 0)) {
                System.out.println(g);
            }
        }

        System.out.println();
        System.out.println("customers:");
//        System.out.println(c1.getName() + ", " + c1.getAddress());
//        System.out.println(c2.getName() + ", " + c2.getAddress());
        System.out.println(c3.getName() + ", " + c3.getAddress());
        System.out.println(c1);
    }
}