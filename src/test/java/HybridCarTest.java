import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;
    Engine engine;
    Tyre tyre;

    @Before
    public void before() {
        engine = new Engine("Petrol", 1.4);
        tyre = new Tyre("Winter", "Michellin");
        hybridCar = new HybridCar(12000, "blue", engine, tyre);
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, hybridCar.getEngine());
    }
}
