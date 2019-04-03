public class Customer extends Person implements IBuy {

    private int wallet;

    public Customer(String name, int wallet) {
        super(name);
        this.wallet = wallet;
    }

    public void buy(Vehicle vehicle) {
        this.wallet -= vehicle.getPrice();
    }

    public int getWallet() {
        return this.wallet;
    }

}
