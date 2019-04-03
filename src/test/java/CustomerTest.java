import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Vehicle vehicle;
    Tyre tyre;
    Engine engine;
    Car car;

    @Before
    public void before() {
        customer = new Customer("Phil", 1100);
        car = new Car(1000, "red", engine, tyre);
        }


    @Test
    public void hasName() {
        assertEquals("Phil", customer.getName());

    }

    @Test
    public void canBuy() {
        customer.buy(car);
        assertEquals(100, customer.getWallet());
    }
}
