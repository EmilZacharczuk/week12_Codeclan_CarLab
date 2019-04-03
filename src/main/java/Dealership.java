import java.util.ArrayList;

public class Dealership implements IBuy {

    private Dealer dealer;
    private Till till;
    private Customer customer;
    private ArrayList<Vehicle> stock;

    public Dealership(Dealer dealer, Till till, Customer customer, ArrayList<Vehicle> stock){
        this.dealer = dealer;
        this.till = till;
        this.customer = customer;
        this.stock = stock;
    }

    public Dealer getDealer() {
        return this.dealer;
    }

    public Till getTill() {
        return this.till;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public ArrayList<Vehicle> getStock() {
        return this.stock;
    }

    public void buy(Vehicle vehicle) {
       int total = this.till.getTotal();
        total -= vehicle.getPrice();
    }

    public String customerName() {
        return this.customer.getName();
    }


}
