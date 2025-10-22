package nclan.McCaig.GameShop;

import java.util.ArrayList;

/**
 * @author 30202291
 */
public class Inventory {
    private ArrayList<Game> allGames = new ArrayList<>();


    public Inventory() {
    }

    /**
     *
     * @param g the game
     * @return adding the game to a list
     */
    public boolean addStock(Game g) {
        if (g.getQuantity() > 10) {
            g.setQuantity(10);
            return allGames.add(g);
        } else return allGames.add(g);
    }

    /**
     * printing out the inventory
     */
    public void printInventory() {
        for (Game g : allGames) {
            if (!(g.getQuantity() <= 0)) {
                System.out.println(g);
            }
        }
    }


}
