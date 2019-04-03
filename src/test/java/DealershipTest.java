import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Dealer dealer;
    Till till;
    Customer customer;
    Car car;
    Engine engine;
    Tyre tyre;

    @Before
    public void before() {
        dealer = new Dealer("Bill");
        till = new Till(1500);
        customer = new Customer("Sandra", 1100);
        car = new Car(1200, "blue", engine, tyre);

        ArrayList<Vehicle> stock = new ArrayList<>();
        stock.add(car);

        dealership = new Dealership(dealer, till, customer, stock);
    }

    @Test
    public void hasDealer() {
        assertEquals("Bill", dealership.getDealer().getName());
    }

    @Test
    public void countStock() {
        assertEquals(1, dealership.getStock().size());
    }

    @Test
    public void canBuy() {
        dealership.buy(car);
        assertEquals(300, dealership.getTill());
    }

}
