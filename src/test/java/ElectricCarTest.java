import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Engine engine;
    Tyre tyre;

    @Before
    public void before() {
        engine = new Engine("Petrol", 1.4);
        tyre = new Tyre("Winter", "Michellin");
        electricCar = new ElectricCar(12000, "blue", engine, tyre);
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, electricCar.getEngine());
    }
}
