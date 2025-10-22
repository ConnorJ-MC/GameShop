package nclan.McCaig.GameShop;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Game> allGames = new ArrayList<>();

    public Inventory() {
    }

    public boolean addStock(Game g) {
        if (g.getQuantity() > 10) {
            g.setQuantity(10);
            return allGames.add(g);
        } else return allGames.add(g);
    }

    public void printInventory() {
        for (Game g : allGames) {
            if (!(g.getQuantity() <= 0)) {
                System.out.println(g);
            }
        }
    }


}
