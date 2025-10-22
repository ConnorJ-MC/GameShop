package nclan.McCaig.GameShop;

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

    public void setDiscountEligible(boolean eligible) {
        this.discountEligible = eligible;
    }

    public Customer(String name, String address, boolean discountEligible) {
        this.name = name;
        this.address = address;
        this.discountEligible = discountEligible;
    }

    private String name;
    private String address;
    private boolean discountEligible;

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", address='" + address;
    }

}
