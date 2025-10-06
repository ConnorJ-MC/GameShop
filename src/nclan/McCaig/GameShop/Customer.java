package nclan.McCaig.GameShop;

import java.util.ArrayList;

public class Customer {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDiscountEligible() {
        return discountEligible;
    }

    public void setDiscountEligible(boolean discountEligible) {
        this.discountEligible = discountEligible;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer(String name, String address, boolean discountEligible) {
        this.name = name;
        this.address = address;
        this.discountEligible = discountEligible;
    }

    private String name;
    private String address;
    private boolean discountEligible = false;
    ArrayList<String> Game;

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", discountEligible=" + discountEligible +
                '}';
    }

}
