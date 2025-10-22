package nclan.McCaig.GameShop;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Game> allGames = new ArrayList<>();

    public Inventory() {

    }

    public boolean addStock(Game g) {
        if(limitStock(g.getQuantity()))
            return allGames.add(g);
        else
            return false;
    }

    public boolean limitStock(int quantity) {
        if (quantity < 10) {
            quantity = 10;
            return true;
        } else
            return false;
    }

    public void printInventory() {
        for (Game g : allGames) {
            if (!(g.getQuantity() <= 0)) {
                System.out.println(g);
            }
        }
    }


}
